plugins {
    id("application")
    id("checkstyle")
}

repositories {
    mavenCentral()
}

dependencies {
    // Use JUnit test framework.
    testImplementation("junit:junit:4.13")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:29.0-jre")
}

application {
   mainClass.set("lab.App")
}
