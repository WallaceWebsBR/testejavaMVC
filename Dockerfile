From tomcat:8.0.51-jre8-alpine

MAINTAINER Wallace Alberto "dev@wallace.tk"
RUN rm -rf /usr/local/tomcat/webapps/*
ADD ./dist/projetomvc.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh", "run" ] 