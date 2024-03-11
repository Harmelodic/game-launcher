# Contributing

I'm not currently looking for active contributors for this project since I am also using this project as an opportunity
to learn JavaFX.

## Requirements

- JDK with JavaFX (I usually use Zulu with FX, since that's available in [SDKMAN](https://sdkman.io/))
- Maven

Intention is to always use the latest released versions.

## Running the app for development

Clone the repo and run:

```shell
mvn clean javafx:run
```

## Releasing the application

Currently, no releases will be created until:

- The application can be built binaries that work on Windows, macOS and Linux (Debian).
  - Debian because highest percentage of users
    are [Ubuntu or Debian (both Debian-based)](https://truelist.co/blog/linux-statistics/).
- The release process is automated.
- The application can be updated automatically once installed, either through a built-in software updater, or a package
  manager.

### Building the application binaries

The goal is to output an application binary for each supported Operating System. To output the application binaries, we
need to consider the following components:

- The application code
- The application's dependencies
- The Java runtime, including the required JavaFX components.
- The necessary file format / binary components for the target Operating System.
- Any additional components to create an installer for the target Operating System.

So far, my findings show the recommended path is:

- Use `jlink` to create a custom Java runtime that includes the necessary JavaFX components.
- Use `jpackage` to create an installer for the target Operating System.

However, this relies on Java 9 Modules system, which has the advantage of creating a small Java runtime and all the
strong encapsulation niceties that come with Java 9 Modules, but has the disadvantage of requiring the application to be
modularized with Java 9 Modules, which is a bit of a pain to deal with, and since not every library is modularized, I'd
need to figure out doing automatic modularization of the dependencies - and that's just... ugh. Not right now.

The alternative is to build a jar with all the dependencies included - classic "everything on the classpath" style.
Then use `jpackage` (or similar tool) to create an installer for the target Operating System.

To build everything into the JAR, we can use the `maven-jar-plugin` or the `maven-assembly-plugin` to build a JAR, which
would then still require a JDK with JavaFX to execute. This might be fine, since I think I'll be able to use `jpackage`
with a JDK with JavaFX to create an installer for the target Operating System, however I haven't tested this yet.

If I can't use `jpackage` with a JDK with JavaFX and get an installer to work, I might have to use
the `maven-shade-plugin`to build an "uber-jar" that includes the Java runtime and JavaFX components.

## TODO

- Automate release process
- Make a little website (GitHub page?) for:
  - Downloading installers
  - Endpoints for software updater
- Build a software updater into the application
- Make the damn application
