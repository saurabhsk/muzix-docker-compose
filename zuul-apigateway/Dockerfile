
FROM openjdk:11

ADD ./target/spring-boot-zulugatewayproxy-0.0.1-SNAPSHOT.jar /usr/src/spring-boot-zulugatewayproxy-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "spring-boot-zulugatewayproxy-0.0.1-SNAPSHOT.jar"]