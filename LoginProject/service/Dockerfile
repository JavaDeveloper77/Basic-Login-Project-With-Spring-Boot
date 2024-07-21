FROM amazoncorretto:17-alpine
COPY target/service-0.0.1-SNAPSHOT.jar usr/app/service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/usr/app/service-0.0.1-SNAPSHOT.jar"]