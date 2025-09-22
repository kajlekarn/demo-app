# Use a base image with a Java Runtime Environment (JRE)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
# Replace 'your-application.jar' with the actual name of your compiled JAR file
COPY target/demo-0.0.1-SNAPSHOT.jar demo-app.jar

# Expose the port your Spring Boot application listens on (default is 8080)
EXPOSE 8080

# Define the command to run the application when the container starts
ENTRYPOINT ["java", "-jar", "demo-app.jar"]