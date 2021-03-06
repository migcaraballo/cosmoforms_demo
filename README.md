# CosmoForms Demo


## About The Demo

This demo is a fully integrated UI-to-Database application. You will need to have the proper environment setup & running on your computer in order to successfully run the application, see "Setup Requirements" below.

At present, I have only created a "Pets" demo which shows how to use CosmoForms against a "pets" collection in MongoDB. The demo leverages Java, Spring, and MongoDB, and shows basic CRUD operations. I will attempt to provide more examples at a later date.

### Setup Requirements

You will need the following to fully run this demo. 

1. **Java 8** - this is the version the demo code is written in, however, any Java version will work with CosmoForms since backend technologies are not tied to the framework.
2. **Maven 3.3.X or Above** - Maven is a standard java build tool
2. **Tomcat 8** - or any other Java server that can run Java 8 and Servlet Api version 3.1
3. **MongoDB 3.4.X** - popular document database

Unfortunately, I will not be providing steps on how to set up the above technologies/platforms since that is beyond the scope of this document.
However, here are some links to help you install and get started with the above:

- [Java 8 Install/Setup](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html)
- [Maven 3.3.X Install/Setup](https://maven.apache.org/install.html)
- [Tomcat 8 Install/Setup](https://tomcat.apache.org/tomcat-8.0-doc/setup.html)
- [MongoDB 3.4.X Install/Setup](https://docs.mongodb.com/manual/installation/)

### Running Demo

1. First, make sure you have Java 8 installed and available
2. Make sure you have successfully installed Maven
3. Make sure MongoDB is up and running
4. Insert Initial data set in MongoDB
    1. execute the following: mongo dbscripts/cosmoforms_insert.js
        - depending on how you setup MongoDB and where you downloaded the source code, your paths will differ
        - After executing the above script, you will have a DB called **"cosmoforms"** and 1 collection named **"pets"**.
5. Execute Maven Build
    1. Using a terminal application (unless you have an IDE), CD to the **comsoforms_demo** directory
    2. Run the command **"mvn clean package"**
        - this will create a war file named: **"comosforms_demo.war"** in the **"target"** directory created by Maven.
        - **target** directory should be created at the root of **comsoforms_demo** directory
    - deploy/copy this file to Tomcat's "webapps" directory
6. Start Tomcat
7. Open your favorite browser and goto:
    - http://localhost:8080/cosmoforms_demo
    
If all is working well, you will see the following page:

![alt image](cosmoforms_demo_ss.png)
    
