# New Library Fronted

> Project no.1 as part of interview process

University IT system requires New Library Fronted (NLF), to allow librarian to keep track of book loans.
NLF must support these actions:
- Library issues (loan) the book to student
- Student returns the book to library
- NLF must display all books currently borrowed by students.

#### To build and run
`mvn clean install` <br />
`mvn jfx:run` 

##### Executable jar with embedded apache derby in current directory, java 1.8 required
**/app** contains entire app with libraries <br />
**/app/run.bat** on windows executes `java -jar app-name.jar` 

![Alt text](/app/how_to.jpg?raw=true "How to App!")