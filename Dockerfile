
FROM maven:3-eclipse-temurin-25 AS build
COPY . .
RUN mvn clean package -DskipTests -Dfile.encoding=UTF-8 -Dproject.build.sourceEncoding=UTF-8

FROM eclipse-temurin:25-jdk-jammy
ENV LANG=C.UTF-8
COPY --from=build target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dfile.encoding=UTF-8", "-jar", "app.jar"]