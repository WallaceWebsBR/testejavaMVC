# ARQUIVO PARA HEROKU, USE docker-compose COMO ALTERNATIVA
# ESSE ARQUIVO NÃO FUNCIONA FORA DA HEROKU
From tomcat:8.0.51-jre8-alpine

MAINTAINER Wallace Alberto "dev@wallace.tk"
RUN rm -rf /usr/local/tomcat/webapps/*
ADD ./dist/projetomvc.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE $PORT
CMD ["catalina.sh", "run" ] 