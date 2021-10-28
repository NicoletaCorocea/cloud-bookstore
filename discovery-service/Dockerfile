# this image is used for all microservices
# in docker-compose, the jar is copied to /code
FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
VOLUME /code
ENTRYPOINT ["java","-jar","/code/app-1.0.jar"]
EXPOSE 8761
EXPOSE 8080
EXPOSE 8081
EXPOSE 8082