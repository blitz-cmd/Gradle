This lab builds off of the previous lab. Continue working in your `lab-build-logic` project.

1. Write a task as Java, Kotlin or Groovy class alongside the existing convention plugins.
    - Hint: you'll need to import `org.gradle.api.*`, `org.gradle.api.tasks.*`, `org.gradle.api.file.*`.
2. Add one input and one output property of type `RegularFileProperty`
3. Add a task action that writes `name` and `length` of the input file to the output file
4. In `lab.java-common-conventions.gradle(.kts)`, register/configure the task
5. Name the task `jarSize` and wire its input to `tasks.jar.archiveFile` (jar task output)

Explore how your task works. You can use `--scan` to create a build scan or `--console=plain` for more information in the terminal.
1. Run `./gradlew :app:jarSize` and check which tasks were executed
2. Run `./gradlew :app:jarSize` again and check if your task is `UP-TO-DATE`
3. Modify or delete the generated txt file. What happens if you run `:app:jarSize` again?
4. Modify a Java file in `app/src/main`. What happens if you run `:app:jarSize` again?
5. Modify a Java file in `lists` or `utilities`. What happens if you run `:app:jarSize`?
6. Repeat the above steps but always add `clean` and `--build-cache` parameters.
