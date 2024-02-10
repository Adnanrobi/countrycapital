FROM openjdk:17
WORKDIR /app
COPY target/country_capital-0.0.1-SNAPSHOT.jar /app/country_capital.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/country_capital.jar"]
