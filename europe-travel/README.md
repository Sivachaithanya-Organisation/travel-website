# Wayfarer — A European Travel Guide

A small server-rendered travel site covering 12 European cities, built with **Java 21, Spring
Boot 3, and Thymeleaf**, packaged as a **WAR** with Maven for deployment to an external
**Apache Tomcat**. No database — destinations live in an in-memory repository, so there's
nothing to configure before you run it.

## Requirements

- Java 21 (`java -version`)
- Maven 3.8+ (`mvn -version`)
- Apache Tomcat 10.x (Spring Boot 3 uses the Jakarta EE namespace, which requires Tomcat 10+;
  Tomcat 9 and earlier will not work)

## Build the WAR

```bash
cd europe-travel
mvn clean package
```

This produces `target/europe-travel.war`.

## Deploy to Tomcat

1. Copy the WAR into Tomcat's `webapps` directory:
   ```bash
   cp target/europe-travel.war $CATALINA_HOME/webapps/
   ```
2. Start (or restart) Tomcat:
   ```bash
   $CATALINA_HOME/bin/startup.sh
   ```
3. Tomcat auto-deploys the WAR and unpacks it. Visit:
   ```
   http://localhost:8080/europe-travel/
   ```
   The context path matches the WAR's filename (`europe-travel`). To serve it at the root
   path (`http://localhost:8080/`) instead, rename the file to `ROOT.war` before copying it in.

To redeploy after a change, stop Tomcat, delete the old `webapps/europe-travel/` folder and
`.war` file, rebuild with `mvn clean package`, and copy the new WAR in again.

## Run it without Tomcat (for quick local testing)

The WAR is also self-executable, so you don't need Tomcat installed just to try it out:

```bash
mvn clean package
java -jar target/europe-travel.war
```

Then open **http://localhost:8080**.

## Project layout

```
src/main/java/com/wayfarer/europe/
  EuropeTravelApplication.java   Entry point + SpringBootServletInitializer (for Tomcat deploy)
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

