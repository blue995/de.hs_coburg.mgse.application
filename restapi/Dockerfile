# fetch basic image
FROM tomcat:8

# install maven
RUN apt-get update && apt-get install -yq maven default-jdk

# application placed into /opt/app
RUN mkdir -p /opt/app
WORKDIR /opt/app

# selectively add the POM file and
# install dependencies
COPY pom.xml /opt/app/
# rest of the project
COPY src /opt/app/src
COPY docker/hibernate.cfg.xml /opt/app/src/main/resources/hibernate.cfg.xml

RUN mvn install
RUN mvn package

# Copy rest api
RUN cp /opt/app/target/rest-api.war $CATALINA_HOME/webapps/rest-api.war

# execute it
#CMD ["mvn", "exec:java"]
CMD ["catalina.sh", "run"]