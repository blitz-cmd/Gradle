This lab builds off of the previous lab. Continue working in your `lab-gradle-basics` project.

1. Set a `version` for the project in `app/build.gradle(.kts)`.
2. Execute `./gradlew tasks` to see which tasks are available.
3. Build the application's jar and try to find it. The name should include the version number.
4. Configure the `jar` task to add an entry named `Implementation-Version` to the Jar manifest. Set the entry's value to the project version.
5. Edit the source code of a test to make it fail, execute the project's tests with `--scan`, and check the HTML test report as well as the build scan.
6. Configure the `test` task to run tests in parallel (hint: use the `maxParallelForks` setting).
