package development.tutorial.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("The most common default lifecycle phases in maven are;");
        System.out.println("   validate: validates the project is correct and all necessary information is available.");
        System.out.println("   compile: compile the source code of the project.");
        System.out.println("   test: test the compiled source code using a suitable testing framework.");
        System.out.println("   package: take the compiled code and package it in its distributable format, such as JAR.");
        System.out.println("   integration-test: process and deploy the package if necessary into an environment where integration tests can run.");
        System.out.println("   verify: run any checks to verify the package is valid and meets quality criteria.");
        System.out.println("   install: install the package into the local repository, for use as a dependency in other projects locally.");
        System.out.println("   deploy: done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.");
        System.out.println("   clean: cleans up artifacts created by prior builds.");
        System.out.println("   site: generates site documentation for the the project.");
    }
}
