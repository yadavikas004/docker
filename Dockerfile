FROM openjdk:17
WORKDIR /com/docker/learning
COPY target/docker.jar docker.jar
EXPOSE 8083
CMD [ "java", "-jar", "docker.jar" ]
