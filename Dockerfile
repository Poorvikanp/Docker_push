FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY . /app
RUN javac prime.java
CMD ["java","prime"]
