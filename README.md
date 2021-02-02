# Feito com Spring MVC na IDE Netbeans

## Descricao dos arquivos

database/dump.sql -> Contém todas as tabelas do banco, podendo ser importado via phpMyAdmin ou linha de comando mysql;

dist/projetomvc.war -> Arquivo compilado para servidor Apache TOMCAT 8

## Ajuste para conexao com banco

\src\java\com\wallacewebs\projetomvc\conexao\ConexaoJDBC.java -> Substituir na linha 20 o usuario e senha do Banco de Dados. Alem de alterar a string de conexão para o nome do banco de dados.

## Rodar em docker
docker-compose up

Aguardar a segunda reinicalização do MYSQL

Acessar localhost:8080

WallaceWebs - Todos os direitos reservados ©2021

Website: www.wallace.tk
