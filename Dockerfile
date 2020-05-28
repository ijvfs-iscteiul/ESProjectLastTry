FROM openjdk:7

#WORKDIR /Users/irina/git/ESProjectLastTry/ES2Project/src/

ARG JAR_FILE=target/*.jar

COPY ES2Project/target/ES2Project-0.0.1-SNAPSHOT.jar app.jar

#RUN javac App.java

#CMD tail -f /dev/null
ENTRYPOINT ["java","-jar","/app.jar"]
