# JavaFX Template

This repository contains a full-working JavaFX template with a Maven setup.

## Included features

* Create a shaded JAR with all dependencies including those of JavaFX. Thus, using the `mvn:package` goal you can build 
  a JAR which only needs an installed Java 11 instance to run ([see also below](#build-and-start-jar)).
* Use a separate `Start` class to make the JAR work correctly (else the JavaFX components would be declared as missing).
  Another approach would be to add JavaFX to the module path but this is more complex and needs to be done by the user
  or a separate starting script.
* Select the correct language resource bundle at the application's start (German and English are already given).
* Add icons with just uncommenting the responsible method call and adding actual icon resources.
* Use FXML for creating the GUI.
* Load a simple template scene at the application's start.
* Include a very basic controller (no functionality!) with resource bundle support for the main window.

## Included dependencies

| Dependency            | Version |
|-----------------------|---------|
| Java                  | 11      |
| JavaFX                | 14      |
| Log4j                 | 2.14.0  |
| Maven Compiler Plugin | 3.8.0   |
| Maven Shade Plugin    | 3.2.4   |
| JavaFX Maven Plugin   | 0.0.4   |

__For JavaFX the following packages are used:__

* javafx-base
* javafx-controls
* javafx-fxml
* javafx-graphics (for Windows, Linux and Mac)

## Run the application

You can simply use the Maven goal `javafx:run` to start the application.

As an alternative you can run the `Start` class inside your favorite IDE after having downloaded the needed dependencies 
via Maven.

## Build and start JAR

1. Execute the Maven goal `package`
2. The JAR file _./target/javafx-template-1.0-SNAPSHOT.jar_ includes all dependencies and can directly
   be started with a double click if Java 11 is installed on the device