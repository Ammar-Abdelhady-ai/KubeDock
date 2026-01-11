# Build Stage
FROM openjdk:17-jdk-slim as builder
RUN apt-get update && apt-get install -y maven git

# Copy local source code
COPY . /vprofile-project
WORKDIR /vprofile-project

# Build artifact
RUN mvn install -DskipTests

# Runtime Stage
FROM tomcat:9-jre17
LABEL "project"="Vprofile"
LABEL "Author"="Ammar"

RUN rm -rf /usr/local/tomcat/webapps/*
COPY --from=builder /vprofile-project/target/vprofile-v2.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]