
FROM openjdk:11

ADD ./target/EurekaServer-1.0.0.jar /usr/src/EurekaServer-1.0.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "EurekaServer-1.0.0.jar"]