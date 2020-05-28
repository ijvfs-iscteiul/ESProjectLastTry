FROM openjdk:7

#WORKDIR  C:/Users/irina/docker-proj/app

ARG JAR_FILE=target/*.jar

COPY ES2Project/target/ES2Project-0.0.1-SNAPSHOT.jar app.jar

RUN javac src/App.java

#CMD tail -f /dev/null
ENTRYPOINT ["java","-jar","/app.jar"]
