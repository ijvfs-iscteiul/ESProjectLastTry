FROM openjdk:7

#WORKDIR  C:/Users/irina/docker-proj/app

ARG JAR_FILE=target/*.jar

COPY target/ES2Project-0.0.1-SNAPSHOT.jar app.jar

#RUN javac App.java

ENTRYPOINT ["java","-jar","/app.jar"]
