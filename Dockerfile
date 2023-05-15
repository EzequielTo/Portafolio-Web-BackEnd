FROM amazoncorretto:11-alpine-jdk
MAINTAINER Ezequiel Tokashiki  
COPY target/te-0.0.1-SNAPSHOT.jar TE-app.jar
ENTRYPOINT ["java","-jar","/TE-app.jar"]
