From openjdk:8
EXPOSE 8083
ADD target/springBootDemo-0.0.1-SNAPSHOT.war  springBootDemo-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/springBootDemo-0.0.1-SNAPSHOT.war" ]
