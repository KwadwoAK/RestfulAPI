# Use the official Eclipse Temurin Java 17 image as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the Java application JAR file into the container
COPY build/libs/RestappAPI-0.0.1-SNAPSHOT.jar .

# Expose the port on which your Java API will run
EXPOSE 8080

# Command to run the Java application when the container starts
CMD ["java", "-jar", "RestappAPI-0.0.1-SNAPSHOT.jar"]