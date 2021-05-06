# Comfort Sound
  - For android app
    https://play.google.com/store/apps/details?id=com.ComfortSound.project
  
  - Website
    https://dongryulkim9299.com/Project/



# Week 01 (Jan 31st - Feb 6th) 4hrs

  #Build ideas for project
  
   - Web and mobile application (Android)
  
# Week 02 (Feb 07th - Feb 13rd) 2hrs 30mins

  #Start discussing web page design with supervisor.
   
   - Since this project has mobile application, 
     The web page briefly introduces the purpose and contents of this program.
    
  #Basic concept of web page
   
   - Use HTML/CSS and JavaScript
   - Static web page
   - Hosting with GitHub
   - Download link on the main page
   - connect social medias such as twitter and instagram
   - Method to contact developer
  
# Week 03 (Feb 14th - Feb 20th) 12hrs 42mins

  #Start to upload code
  
  #Need to be added
  
   - Introduction
   - Sample contents
   - Contactable method such as E-mail
    
   #Hosted with GitHub
   
   - https://dongryulkim9299.com/Project/

# Week 04 (Feb 21st - Feb 27th) 6hrs
  
  #Investigate the effects of sound on the human body
  - Attach links to web page for references.

# Week 05 (Feb 28th - Mar 06th) 5hrs

  #Get contents from Youtube (Open Sources)
  
   - Frequency waves
   - Sounds from nature
  
# Week 06 (Mar 07th - Mar 13th) 21hrs

  #Project proposal confirmed. "CISC 4900 Project Proposal.docx" file for details
    
  #Build Web page
  
   - Static
   - Has introduction about this program
   - Has link to download app for android devices
   - Has sample contents
    
   #Add link to Twitter and Instagram
   
   - https://www.instagram.com/_comfortsound/
   - https://twitter.com/comfortsound1
  
![1](https://user-images.githubusercontent.com/70281650/114285978-29c44f80-9a29-11eb-8a45-df0f03ae448d.PNG)
  
# Week 07 (Mar 14th - Mar 20th) 24hrs

   #Start building Android Application using Kotlin
   
   - Start to learn Kotlin
   - Since developers have used Java to build android app, Kotlin has really similar grammar and structure with Java
   - Study to undestand what Kotlin is
   - Create first page of the app
   - Learned that image will not be displayed when it has too many pixels
   - Put test image to display in device. and it works.
  
   #Set sign-up buttons 
    
   - sign up manually or with social networks (Google, Facebook)
  
  ![2](https://user-images.githubusercontent.com/70281650/114285980-2c26a980-9a29-11eb-83d9-a0027dd1440d.png)


# Week 08 (Mar 21st - Mar 24th) 8hrs

  #Self-study
  
   - Learn Kotlin
    

# Week 09 (Mar 25th - Apr 04th) 0hrs
  
  #Spring Break
  
   - Need to prepare upcoming wedding ceremony. Cannot work on the project
  
# Week 10 (Apr 05th - Apr 10th) 14hrs

  #Learn firebase to link application and database
  
  #Use emailJS to create e-mail contact form
  
 ![3](https://user-images.githubusercontent.com/70281650/114285983-2df06d00-9a29-11eb-8964-ebfb3f31fa77.PNG)
   - Writing script for emailJS is one of the hardest challenge this week
  
  #setup sign-up function
   - Link with google fire base
   - Struggle with importing extension -> problem solved when edit gradle
   - Password will be hide when user types it
   
  ![4](https://user-images.githubusercontent.com/70281650/114285984-2e890380-9a29-11eb-8796-46b9642d71fd.png)
  
  ![5](https://user-images.githubusercontent.com/70281650/114285985-2fba3080-9a29-11eb-8881-70234fd2ae8a.PNG)
  
  
  #Activate Sign-in function using Google account
  
  ![6](https://user-images.githubusercontent.com/70281650/114285986-30eb5d80-9a29-11eb-90d7-b655b2bb63b0.png)
  
   - did not move to mainpage after sign-in using google account
   - Add SHA1 key to firebase and it works



  #Activate Sign-in function using Facebook
  
  
  ![7](https://user-images.githubusercontent.com/70281650/114285987-334db780-9a29-11eb-8f01-49d2b4655eb9.png)
    
   - An error occurs when trying to sign-in with facebook
  
  ![8](https://user-images.githubusercontent.com/70281650/114285988-33e64e00-9a29-11eb-8123-5e2dd3fb5612.png)
   
   - The reason of error was using wrong password(typo) for google firebase -> fixed
 
  ![9](https://user-images.githubusercontent.com/70281650/114285989-35177b00-9a29-11eb-9944-d38d21779f53.PNG)
  
   - Complete to activate sign-up using e-mail, Google, and Facebook


  # Week 11 (Apr 12th - Apr 17th) 17hrs
   - Make bottom navigation bar
    - set fragments to build bottom navigation bar
    - challenge: swipe activity <-> fragement
    - follow the similar design of Instagram/TikTok to make users feel familiar.
   
   - Main page design
  ![KakaoTalk_20210415_012125762](https://user-images.githubusercontent.com/70281650/114817966-efd8ad80-9d88-11eb-88a9-a61beb1a5ff8.jpg)


  # Week 12 (Apr 19th - Apr 14th) 18hrs
   - upload data to google firebase storage.
    - program will display data like diary
   - got permission of useage for 6 mp3 files
   - Main page

  ![11](https://user-images.githubusercontent.com/70281650/116928552-195f5900-ac12-11eb-8b8f-42f727bd449a.png)
  
   - Post writing page
   
  ![10](https://user-images.githubusercontent.com/70281650/116925806-84a72c00-ac0e-11eb-9657-044a73c41d46.png)
  
   - Personal page
   
  ![12](https://user-images.githubusercontent.com/70281650/116928559-1b291c80-ac12-11eb-8c48-6194c9bf8d5b.png)

  
  # Week 13 (Apr 26th - May 01st) 13hrs
   - retrieve data from firebase storage to application
   - need to create delete post function 
   - add delete function
   - program does not allow to sort post by timeline
    - firebase?.collection()?.whereEqualsTo()?.orderBy() does not work
    - add index in firebase storage -> working!!
   - posts are shown ordered by timeline, descending.
   - having problem with playin/ pausing/ stopping mp3 files
 
    - all three buttons are work when at the first time
    - when pages are changed, the sound still playing
    - but when go back to pause/ stop sound, it does not work

  # Week 14 (May 03rd - may 08th) 18hrs
   - google sign-in function works on emulator, but not on real device
   - application shutting down when click the button of 'comfort fragment'
    - it haapend because the size of image files too big. system memory cannot hold the app
   - add admob for advertisement
   - register on play market (https://play.google.com/store/apps/details?id=com.ComfortSound.project)
   
  











  
