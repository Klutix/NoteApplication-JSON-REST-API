# NoteApplication-JSON-REST-API
A simple JSON REST API to power a note-taking application. 

This api support GET, POST, PUT, and DELETE

![JsonRestAPI](https://github.com/Klutix/Images/blob/master/RESTJSON/running.png)


## Requirements

#For Deployement
IntelliJ, Maven'

#For Testing
curl or Postman(recommended fior windows)

## Setup

First download or clone the repositiory.Then go a head and unzip the directory into a folder. Next install [IntelliJ](https://www.jetbrains.com/idea/download/)and os specific version [maven](https://maven.apache.org/download.cgi) if your missing them. You will need to make sure maven has been added to path. Ss specific instructions are available [here](https://www.baeldung.com/install-maven-on-windows-linux-mac#:~:text=Adding%20Maven%20to%20the%20Environment,run%20the%20Maven's%20command%20everywhere.) If you path for path for paven needs to be configured. 

Once  IntelliJ ,Maven and Maven's path has seen set. You should be ready to rock and roll! Go ahead and start IntelliJ. Go to File->Open and select the directory you unzipped previously. Intellji will begin collecting the missing resources and make some configurations from the files provided. You can either select run from the top toolbar or right click on 'NoteApplication' in the prokect explorer and click <run>. 
  
 You seed some feedback on IntelliJ if if there are no errors shown at the bottom then REST API is up and runnig on the server.
 
 *Note the server is defaulted to localhost:8080 You can change this in the application settings if need be.*
 
 ## Testing the API
 To test the API you need to be able to run cUrl commands against the server. OS specific instructions to install cUrl can be found [here](https://help.ubidots.com/en/articles/2165289-learn-how-to-install-run-curl-on-windows-macosx-linux). *If you runnning on windows I recommend using [Postman](https://www.postman.com/downloads/) instead.*
 
 **END POINTS AND USAGE**
 ================================================================
 <pre>
 *POST* - /api/notes                *input a json note value  
                                     example: {"body":"got milk"}*
                                     
 curl --location --request POST 'localhost:8080/api/notes' \
--header 'Content-Type: application/json' \
--data-raw '{"body":"got milk"}

=================================================================                                     
                                     
 *GET*   /api/notes                *returns all entrys entered in*  
         /api/notes/{id}           *return entrys by id*  
         /api/notes?query={value}  *returns all entrys containing where body contains the substring value* 
         
 curl --location --request GET 'localhost:8080/api/notes' \
--header 'Content-Type: application/json' \
--data-raw '{"body":"got milk"}
         
    
 =================================================================        
           
 *PUT*   /api/notes{id}            *replaces entry at id with new note value  
                                   *input a json note value  
                                    example: {"body":"got cows"}*  
                                    
 curl --location --request PUT 'localhost:8080/api/notes/1' \
--header 'Content-Type: application/json' \
--data-raw '{"body":"got butter"}
                                    
                                    
  =================================================================
   
 *DEL*   /api/notes/{id}           *deletes entry at id  
 
 curl --location --request DELETE 'localhost:8080/api/notes/1' \
--header 'Content-Type: application/json' \
--data-raw '{"body":"got butter"}
 </pre>
 
 ==================================================================
## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/MIT/)
