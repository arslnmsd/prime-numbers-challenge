__Prerequisites:__
  * Maven
  * Java 8

Execute the following in the cloned directory to run tests and make a jar file

`mvn clean install`

Then execute the application as follows:

`java -jar target/hubbado-challenge-0.0.1-SNAPSHOT.jar -r <ROWS> -c <COLUMNS> -f <FUNCTION> -g <GENERATOR>`

Replace `<ROWS>`, `<COLUMNS>`, `<FUNCTION>`, `<GENERATOR>` above with the parameter that you want to enter.
For Example for ROWS = 3, COLUMNS = 3, FUNCTION = add, <GENERATOR> = prime:

`java -jar target/hubbado-challenge-0.0.1-SNAPSHOT.jar -r 3 -c 3 -f add -g prime`

To get detailed usage, execute the application as follows:

`java -jar target/hubbado-challenge-0.0.1-SNAPSHOT.jar`
