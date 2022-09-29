FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/eureka-discovery*.jar /app.jar
CMD ["java", "-jar", "/app.jar","--spring.profiles.active=prod"]
EXPOSE 8761