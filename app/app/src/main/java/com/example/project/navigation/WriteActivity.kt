package com.example.project.navigation

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.drawable.DrawableContainer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatViewInflater
import com.example.project.R
import com.example.project.navigation.model.ContentDTO
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.core.View
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.UploadTask
import kotlinx.android.synthetic.main.activity_write.*
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

class WriteActivity : AppCompatActivity() {

    //var PICK_IMAGE_FROM_ALBUM = 0
    var auth: FirebaseAuth? = null
    var firestore: FirebaseFirestore? = null
    var storage: FirebaseStorage? = null
    var photoUri: Uri? = null

    private val OPEN_GALLERY = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write)

        storage = FirebaseStorage.getInstance()
        auth = FirebaseAuth.getInstance()
        firestore = FirebaseFirestore.getInstance()


        write_photo.setOnClickListener {openGallery()}
        write_upload.setOnClickListener{contentUpload()}

    }


    private fun openGallery() {
        val intent: Intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.setType("image/*")
        startActivityForResult(intent, OPEN_GALLERY)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == OPEN_GALLERY) {
                photoUri = data?.data
                    write_photo.setImageURI(photoUri)
                try {
                    val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, photoUri)
                    write_photo.setImageBitmap(bitmap)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        } else {
            Log.d("ActivityResult", "Something Wrong")
        }
    }


    fun contentUpload() {
        //Make filename
        var timestamp = SimpleDateFormat("yyyyMMDD_HHmmss").format(Date())
        var imageFileName = "IMAGE_" + timestamp + "_.png"

        var storageRef = storage?.reference?.child("images")?.child(imageFileName)


        //Promise method
        storageRef?.putFile(photoUri!!)?.continueWithTask { task: Task<UploadTask.TaskSnapshot> ->
            return@continueWithTask storageRef.downloadUrl
        }?.addOnSuccessListener { uri ->
            var contentDTO = ContentDTO()
            contentDTO.title = write_title.text.toString()
            contentDTO.content = write_content.text.toString()
            contentDTO.date = write_date.text.toString()
            contentDTO.imageUrl = uri.toString()
            contentDTO.uid = auth?.currentUser?.uid
            contentDTO.userId = auth?.currentUser?.email
            contentDTO.timestamp = System.currentTimeMillis()

            firestore?.collection("images")?.document()?.set(contentDTO)
            setResult(Activity.RESULT_OK)
            finish()


        }
    }
}
