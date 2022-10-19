# syntax=docker/dockerfile:1

FROM gradle:7.5.1-jdk18-focal as gradle

COPY --chown=gradle:gradle . /home/gradle/src

WORKDIR /home/gradle/src
RUN ./gradlew build --no-daemon

FROM gradle:7.5.1-jdk18-alpine

EXPOSE 8080

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]