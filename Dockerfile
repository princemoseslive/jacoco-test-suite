FROM tomee:7-jre-1.7.4-webprofile

COPY target/jacoco-0.0.1-SNAPSHOT.war /usr/local/tomee/webapps/

