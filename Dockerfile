FROM openjdk:8
ADD target/apidemo-0.1.jar rakdemoservice.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "rakdemoservice.jar" ]