# maven-tutorial
Tutorial code for maven

Steps:

mvn archetype:generate -DgroupId=development.tutorial.maven -DartifactId=mavenApp -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

Use command to create maven project structure with pom.xml etc. A main App.java file will be created which prints "Hello World!" to console.


mvn package 

Will build code into a Jar file named mavenApp-1.0-SNAPSHOT.jar, which can be run using the following command...

java -cp target/mavenApp-1.0-SNAPSHOT.jar development.tutorial.maven.App
