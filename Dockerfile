# Base Image
FROM openjdk:8-jre-alpine

# Environment variable passed from docker-compose file
ENV SPRING_ACTIVE_PROFILE dev

# Copy JAR to root folder
ADD ./target/pbm-api.jar pbm-api.jar

EXPOSE 8090

## Execute JAR file on Start-Up
ENTRYPOINT ["sh", "-c", "java -Dspring.profiles.active=${SPRING_ACTIVE_PROFILE} -jar pbm-api.jar"]
