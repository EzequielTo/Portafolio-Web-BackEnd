FROM amazoncorretto:11-alpine-jdk
MAINTAINER TE
COPY target/te-0.0.1-SNAPSHOT.jar  Te-app.jar
ENTRYPOINT ["java","-jar","/Te-app.jar"]