FROM openjdk:17-jdk
ARG JAR_FILE=build/libs/Jenkins-test-server.jar
ADD ${JAR_FILE} Jenkins-test-server.jar
ENTRYPOINT ["java", "-jar", "/Jenkins-test-server.jar"]