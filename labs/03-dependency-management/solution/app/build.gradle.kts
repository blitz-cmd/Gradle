plugins {
    id("application")
    id("checkstyle")
}

repositories {
    mavenCentral()
}

version = "1.0"

dependencies {
    testImplementation("junit:junit:4.13")

    // implementation("com.google.guava:guava:29.0-jre")
    // implementation("com.google.guava:guava:26.0-jre")
    implementation("com.google.guava:guava:26.0-jre!!")

    // implementation("com.google.inject:guice:4.2.3")
    runtimeOnly("com.google.inject:guice:4.2.3")
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
    maxParallelForks = 4
}

// Groovy DSL:
// tasks.named("jar") {
//   manifest {
//     attributes("Implementation-Version": project.version)
//   }
// }
//
// tasks.named("test") {
//    maxParallelForks = 4
// }
