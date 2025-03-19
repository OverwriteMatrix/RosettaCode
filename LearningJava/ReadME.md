# LearningJava

This respository is was created during my time learning basic java using two main sources: Bro Code on Youtube and w3schools' Java Tutorial

w3schools' Java Tutorial: https://www.w3schools.com/java/

Also with the help of Microsoft Copilot and ChatGPT

https://www.youtube.com/watch?v=vIXcT4hbR0U&t=7s

https://www.youtube.com/watch?v=Ae-r8hsbPUo&t=12s

Bro Code Java Course: https://www.youtube.com/watch?v=xTtL8E4LzTQ

# Running a Java Program Outside of an IDE

(DISCLAIMER: This was all done with Maven Java Projects using NetBeans IDE, it may differ between IDEs and Build Tools such as Maven, Gradle, Ant, ect.)

First you have to create a JAR file to run. To create the JAR file for your Maven project:

1. Open the **pom.xml** file and make sure is looks something like this (Note the **Maven Jar Plugin** is configured and the tag that ensures the **Manifest Recognizes The Main Class**)
   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <project xmlns="http://maven.apache.org/POM/4.0.0" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.mycompany</groupId>
    <artifactId>JavaGUIPractice</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>12</maven.compiler.source>
        <maven.compiler.target>12</maven.compiler.target>
    </properties>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.1.0</version>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>com.mycompany.javaguipractice.JavaGUIPractice</mainClass>
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>
   </project>
   ```
2. Next copy and paste the JAR file from the project's folder to it's new home somewhere else on your computer in a new folder (Desktop?)
3. Make sure to copy over any text files or other files that the program read/writes to, to the new folder.
4. Create a .bat file in the same folder that says:
   ```bat
   java -jar "ABSOLUTE FILE PATH TO JAR.jar"
   exit
   ```
   (To create the .bat file create a new .txt document type in the code above and then change the name to Example.bat)
5. Finally, create a shortcut by right clicking on the .bat file -> Show more options -> create shortcut
6. Move the shortcut to the desktop or wherever you would like it and run!
# 
7. ON WINDOWS OPTIONAL: Create a .vbs file that says:
   ```vbs
   Set WshShell = CreateObject("WScript.Shell")
   WshShell.Run """.BAT ABSOLUTE FILE PATH.bat""", 2, False
   ```
   (To create the .vbs file create a new .txt document type in the code above and then change the name to Example.vbs)
8. ON WINDOWS OPTIONAL: Then, instead of having the shortcut to the .bat file, have the shortcut to this file to have the command prompt auto-hide when running the program
   (See step 5 for creating a shortcut)
   
# Notes
-You extend a java class
-You implement a java interface


