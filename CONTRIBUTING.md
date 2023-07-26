# Contributing

I'm not currently looking for active contributors for this project since I am also using this project as an opportunity
to learn JavaFX.

## Requirements

- JDK (I use Temurin)
- Maven

Intention is to always use the latest released versions.

## Running the app for development

Clone the repo and run:

```shell
mvn clean javafx:run
```

## Releasing the application

- Build a JAR (Maven)
- `jpackage` into installers (Maven?):
    - Windows MSI
    - macOS DMG
    - Linux `.deb` package
- Make installers publicly available

## TODO

- Automate release process
- Make a little website (GitHub page?) for:
  - Downloading installers
  - Endpoints for software updater
- Build a software updater into the application
- Make the damn application
