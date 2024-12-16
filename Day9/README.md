## Maven Introduction:

- Maven is a build automation and dependency management tool primarily used for Java projects.
- Features:
    - Project Management: Pom.xml
    - Dependency Management
    - Build Automation
    - Plugins

- Command to make mvn project: 
    - -DgroupId: The package name (e.g., com.example).
    - DartifactId: The project name (e.g., my-app).
    - -DarchetypeArtifactId: Specifies the project template (e.g., maven-archetype-quickstart for a basic Java application).
    - -DinteractiveMode=false: allowing Maven to create the project automatically without asking for additional input during the setup process.

```bash
    mvn archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart-DinteractiveMode=false
```

- Now after writing dependenices in pom.xml where maven will find it?
    - Local Repository (.m2/repository): if it found then returns that repository then it will search on internet.
    - Remote Repository: 
        1. Custom Repository
        2. Maven Central Repository
    - we can also set repository globally in setting file
- Dependency Scopes:
    1. compile: Available in all phases of the build lifecycle, including compilation, testing, and packaging.
    2. provided: available at compile time, not included at final artifact. The assumption is that is available in runtime enviroment (web server)
    3. runtime: not required at compile-time but required at run-time (eg. mysql)
    4. test: available only for testing. (junit)
    5. system: available for compilation and testing but not explicitly provided by the developer
- dependency exclusion
- Maven Build Lifecycle:
    1. validate: all necessary information is available
    2. compile: compiles the source code
    3. test: test using unit testing
    4. package: packaged the compiled code into jar or war
    5. verify
    6. install: install dependency to Local repository
    7. deploy: copies the final package to Remote repository for sharing
- Clean Lifecycle
- site lifecycle: will generate documentation of our project

- when we apply the stage previous stage gets runs automatically

- mcn wrapper:wrapper: files created mvnw, mvnw.cmd
- These scripts download and use a specified Maven version, even if Maven isn’t installed on the machine.
- then we can use mvnw.cmd clean
