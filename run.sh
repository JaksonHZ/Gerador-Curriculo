#!/bin/bash

# Compila o projeto
mvn clean compile

# Gera o JAR executável
mvn package

# Executa o compilador com o arquivo de exemplo
java -jar target/curriculo-compilador-1.0-SNAPSHOT-jar-with-dependencies.jar exemplo.curriculo 