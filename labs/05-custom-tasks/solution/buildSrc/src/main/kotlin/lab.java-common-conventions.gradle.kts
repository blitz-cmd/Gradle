plugins {
    // Apply the java Plugin to add support for Java.
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    constraints {
        // Define dependency versions as constraints
        implementation("org.apache.commons:commons-text:1.9")
    }

    // Use JUnit Jupiter API for testing.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    // Use junit platform for unit tests.
    useJUnitPlatform()
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

// Kotlin DSL:
tasks.register<lab.tasks.JarSize>("jarSize") {
    jar.set(tasks.jar.get().archiveFile)
    jarSizeTxt.set(layout.buildDirectory.file("reporting/jarSize.txt"))
}

// Groovy DSL:
// tasks.register("jarSize", lab.tasks.JarSize) {
//     jar.set(tasks.jar.archiveFile)
//     jarSizeTxt.set(layout.buildDirectory.file("reporting/jarSize.txt"))
// }