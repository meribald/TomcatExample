# How to create an image

- Build with maven with the command `mvn clean install`.
- Copy TomcatExample.war file from the "target" directory to {project dir}/src/docker directory.
- Navigate to {prodect dir}/src/docker directory.
- Run `docker build -t mywebapp`.
  This command will download the official Tomcat 9.0 image and add TomcatExample.war file in that image.

# How to run the container
 
Run `docker run -p 8080:8080 mywebapp`. You can change the desired port by changing the first "8080" in the command.

# How to see the result

Navigate the URL "http://localhost:8080/TomcatExample/hello" in a browser.
