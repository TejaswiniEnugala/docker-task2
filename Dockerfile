FROM openjdk:11.0.3
ADD /target/muzix-app-hibernate.jar muzixapp-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","muzixapp-0.0.1-SNAPSHOT.jar"]