This is a new lab. Do not reuse the project from the earlier labs.

1. Run `gradle init` 
    - Select project type - `2: application` 
    - Select implementation language - `3: Java`
    - Split functionality across subprojects - `2: yes` (!)
   -  Select a build script DSL - `2: Kotlin` (or `1: Groovy` if you prefer)
    - For the other questions, press enter to use the default values
2. Explore the multi-project build
    - Find the convention plugins in `buildSrc`
    - Explore the `app/build.gradle(.kts)` file and find the project dependencies
    - Execute `./gradlew :app:assemble --scan` and explore the build scan timeline. Which tasks from which projects have been executed?
    - Execute `./gradlew :app:run --scan`. What additional tasks did execute this time?
    - Configure a JDK of your choice for all projects in `lab.java-common-conventions.gradle(.kts)` (use `java.toolchain.languageVersion`)
