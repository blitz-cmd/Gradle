plugins {
    id("application")
    id("checkstyle")
}

repositories {
    mavenCentral()
}

version = "1.0"

dependencies {
    // Use JUnit test framework.
    testImplementation("junit:junit:4.13")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:29.0-jre")
}

application {
    mainClass.set("lab.App")
}

// Kotlin DSL:
tasks.jar {
    manifest {
        attributes("Implementation-Version" to project.version)
    }
}

tasks.test {
    maxParallelForks = 8
}

// Groovy DSL:
// tasks.named("jar") {
//   manifest {
//     attributes("Implementation-Version": project.version)
//   }
// }
//
// tasks.named("test") {
//    maxParallelForks = 8
// }