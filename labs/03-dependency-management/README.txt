This lab builds off of the previous lab. Continue working in your `lab-gradle-basics` project.

1. Execute `./gradlew :app:dependencies --configuration compileClasspath`
2. In `app/build.gradle(.kts)`: Add an `implementation` dependency to `com.google.inject:guice:4.2.3` 
3. Execute `:app:dependencies --configuration compileClasspath` again. Can you see the Guava conflict?
4. Change the Guava version in your build to `26.0-jre`. Which version is selected now?
5. Change the Guice dependency to `runtimeOnly`. Compare the `compileClasspath` and the `runtimeClasspath`. Check the selected Guava versions!
6. Run `./gradlew :app:dependencies --scan` and explore the results in the "Dependencies" tab of the build scan.
7. Enforce the selection of Guava `26.0-jre` (hint: use a strict version). Is `26.0-jre` selected in both `compileClasspath` and the `runtimeClasspath`?
