FROM openjdk:8
EXPOSE 8080
ADD target/SepDel23.jar SepDel23.jar
ENTRYPOINT ["java","-jar","/SepDel23.jar"]