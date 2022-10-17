FROM openjdk:11-jdk-slim
EXPOSE 8081
ARG DEPENDENCY=target/TestPart1.war
COPY ${DEPENDENCY} TestPart1.war
ENTRYPOINT ["java","-jar","/TestPart1.war"]