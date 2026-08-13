# Wayfarer — A European Travel Guide

A small server-rendered travel site covering 12 European cities, built with **Java 17, Spring
Boot 3, and Thymeleaf**, and packaged with **Maven**. No database — destinations live in an
in-memory repository, so there's nothing to configure before you run it.

## Requirements

- Java 17 or newer (`java -version`)
- Maven 3.8+ (`mvn -version`) — or just use the included `mvnw` wrapper if you add one

## Run it locally

```bash
cd europe-travel
mvn spring-boot:run
```

Then open **http://localhost:8080**.

## Build a deployable jar

```bash
mvn clean package
java -jar target/europe-travel.jar
```

That jar is self-contained (embedded Tomcat) — copy it to any server with Java 17+ and run it
the same way. To change the port, either edit `server.port` in
`src/main/resources/application.properties` or run:

```bash
java -jar target/europe-travel.jar --server.port=9090
```

## Project layout

```
src/main/java/com/wayfarer/europe/
  EuropeTravelApplication.java   Spring Boot entry point
  model/Destination.java         Destination data model
  data/DestinationRepository.java In-memory list of 12 destinations
  controller/HomeController.java  "/" and "/about"
  controller/DestinationController.java  "/destinations/{slug}"

src/main/resources/
  templates/       Thymeleaf views (index, destination, about, fragments, error/404)
  static/css/      Single stylesheet, vintage-atlas theme
  application.properties
```

## Adding a destination

Open `DestinationRepository.java` and add a new `Destination(...)` entry to the list — city,
country, region, tagline, description, best time to visit, average daily cost, three highlights,
coordinates, and an accent hex color for its card. It'll show up on the home page and get its
own `/destinations/{slug}` page automatically.

## Deploying

Because it packages to a single executable jar, it runs anywhere with a JVM: a plain VPS, a
Docker container (`FROM eclipse-temurin:17-jre` + `COPY target/europe-travel.jar app.jar` +
`CMD ["java","-jar","app.jar"]`), or any platform that accepts a Java buildpack (Render,
Railway, Heroku, Elastic Beanstalk, etc.).

## Note on this build

This project was assembled without network access to Maven Central, so the Maven build itself
hasn't been run end-to-end in this environment — the code has been carefully reviewed by hand,
but please run `mvn clean package` yourself as a first step and let me know if anything doesn't
compile so it can be fixed.
