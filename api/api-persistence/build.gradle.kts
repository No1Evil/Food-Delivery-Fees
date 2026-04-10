plugins {
    id("java")
}

description = "Persistence service interfaces and DAOs"

dependencies {
    implementation(project(":api:api-domain"))
    implementation(project(":api:api-protocol"))
}