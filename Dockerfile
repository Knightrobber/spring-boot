FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8080
ARG APP_NAME="Jenkins-aws-proj"
ARG APP_VERSION="0.0.1"
ARG JAR_FILE="/target/JenkinsAWSProj-0.0.1-SNAPSHOT.jar"

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "app.jar"]