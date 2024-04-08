FROM eclipse-temurin:17
COPY target/whatname.jar whatname.jar
CMD ["java","-jar","whatname.jar"]