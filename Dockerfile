FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/SpringBootEC2AWS-0.0.1-SNAPSHOT.jar SpringBootEC2AWS-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","SpringBootEC2AWS-0.0.1-SNAPSHOT.jar"]