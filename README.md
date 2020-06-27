# NoteApplication-JSON-REST-API
A JSON REST API using Spring and IntelliJ to power a simple note-taking application. 

![JsonRestAPI](https://github.com/Klutix/Images/blob/master/RESTJSON/running.png)

## Requirements

**For Deployement:** IntelliJ, Maven and Java's JDK
   
**For Testing:** curl or Postman(recommended for windows)

## Setup

First download or clone the repositiory and unzip the directory into a folder. Next install [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) if you missing it.  Next install [IntelliJ](https://www.jetbrains.com/idea/download/) and your os specific version [maven](https://maven.apache.org/download.cgi). You will need to make sure maven has been added to your variable path. OS specific path instructions are available [here](https://www.baeldung.com/install-maven-on-windows-linux-mac#:~:text=Adding%20Maven%20to%20the%20Environment,run%20the%20Maven's%20command%20everywhere.)

Once  IntelliJ ,Maven and variable path have been installed and setup correctly. You should be ready to rock and roll!  
  
Go ahead and start IntelliJ.  
Go to File->Open and select the "com.restApi" directory in the folder you cloned and unzipped.  

Intellji will begin collecting the missing dependencies and make some configurations from the files provided.  

Once that is finished you can either select run from the top toolbar or right click on 'NoteApplication' in the project explorer and click run. 
  
You will see some feedback in the IntelliJ run console. If if there are no errors shown at the bottom then the REST-API is up and running on the server.
 
 *Note the server is defaulted to localhost:8080 You can change this in "application.properties" if need be.*
 
 ## Testing the API
 To test the API you need to be able to run curl commands against the server. OS specific instructions to install curl can be found [here.](https://help.ubidots.com/en/articles/2165289-learn-how-to-install-run-curl-on-windows-macosx-linux). 
 **If you runnning on windows I recommend using [Postman](https://www.postman.com/downloads/) instead.**
 
 **END POINTS AND USE**
=================================================================
 <pre>
 *POST* - /api/notes                *adds and entry
                                    ~input a json note value 
                                     example: {"body":"got milk"}
                                     
 curl --location --request POST 'localhost:8080/api/notes' \
--header 'Content-Type: application/json' \
--data-raw '{"body":"got milk"}

=================================================================                                     
                                     
 *GET*   /api/notes                *returns all entrys entered in 
         /api/notes/{id}           *return entrys by id 
         /api/notes?query={value}  *returns all entrys containing where body contains the substring value 
         
 curl --location --request GET 'localhost:8080/api/notes' \
--header 'Content-Type: application/json' \
--data-raw '{"body":"got milk"}
         
    
=================================================================        
           
 *PUT*   /api/notes{id}            *replaces entry at id with new note value  
                                    ~input a json note value  
                                    example: {"body":"got cows"} 
                                    
 curl --location --request PUT 'localhost:8080/api/notes/1' \
--header 'Content-Type: application/json' \
--data-raw '{"body":"got butter"}
                                    
                                    
=================================================================
   
 *DELETE*   /api/notes/{id}           *deletes entry at id  
 
 curl --location --request DELETE 'localhost:8080/api/notes/1' \
--header 'Content-Type: application/json' \
--data-raw '{"body":"got butter"}

=================================================================
 </pre>
 
 
## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://github.com/Klutix/NoteApplication-JSON-REST-API/blob/master/LICENSE)
