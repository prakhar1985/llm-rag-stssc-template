FROM docker.io/openjdk:17
COPY ./target/*.jar   /deployments/export-run-artifact.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/deployments/export-run-artifact.jar"]
