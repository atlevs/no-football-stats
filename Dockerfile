FROM eclipse-temurin:17-jdk-focal
#FROM amazoncorretto:17-alpine-jdk

#RUN apt-get update && apt-get -y upgrade
#RUN apt-get install -y inotify-tools dos2unix
#ENV HOME=/app
#RUN mkdir -p $HOME
#WORKDIR $HOME
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
#RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline
COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
