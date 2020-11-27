FROM openjdk:8-jdk-alpine3.9
	VOLUME /temp
	EXPOSE 8080
	ADD *.jar app.jar
	ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]