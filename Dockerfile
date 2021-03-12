FROM openjdk:8
COPY ./target/tempcalc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "tempcalc-1.0-SNAPSHOT-jar-with-dependencies.jar"]