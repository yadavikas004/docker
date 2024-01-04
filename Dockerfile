FROM openjdk
WORKDIR /usr/src/myapp
COPY . /usr/src/myapp
CMD [ "java", "-jar", "docker.jar" ]
EXPOSE 8082
