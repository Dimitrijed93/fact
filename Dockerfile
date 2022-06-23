FROM eclipse-temurin:17
COPY target/fact-service.jar fact-service.jar
EXPOSE 8181
ENTRYPOINT ["java","-jar","/fact-service.jar"]