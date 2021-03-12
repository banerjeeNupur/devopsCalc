FROM openjdk:8
COPY ./target/tempcalc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "tempcalc-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]