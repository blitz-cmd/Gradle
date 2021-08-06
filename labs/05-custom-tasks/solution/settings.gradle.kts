// Agree to 'gradle.com/terms-of-service' to publish scans with '--scan'
plugins {
    id("com.gradle.enterprise") version "3.6"
}
gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}
// ---------------------------------------------------------------------

rootProject.name = "lab"
include("app", "list", "utilities")
