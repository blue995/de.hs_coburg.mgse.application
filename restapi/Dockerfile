FROM tomcat:8-alpine AS build
RUN apk add --no-cache maven openjdk8

WORKDIR /opt/app

COPY pom.xml /opt/app/
COPY docker/hibernate.cfg.xml /opt/app/src/main/resources/hibernate.cfg.xml
RUN mvn compile

COPY src /opt/app/src

RUN mvn package


# fetch basic image
FROM tomcat:8-alpine

COPY --from=build /opt/app/target/rest-api.war $CATALINA_HOME/webapps/rest-api.war
