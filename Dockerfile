FROM openjdk:11
EXPOSE 8082
COPY target/prescription-service-0.0.1-SNAPSHOT.jar prescription-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/prescription-service-0.0.1-SNAPSHOT.jar"]