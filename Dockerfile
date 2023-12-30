FROM openjdk:21-jdk
EXPOSE 8080
VOLUME /tmp
ARG JAR_FILE=target/*.jar
ADD ./target/spring-security.jar spring-security.jar
ADD src/main/bin/env.bat /opt/env.bat
ENTRYPOINT ["java","-jar","/spring-security.jar"]