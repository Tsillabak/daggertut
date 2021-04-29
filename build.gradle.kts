import kotlin.text.Typography.dagger

plugins {
    java
    kotlin("jvm") version "1.5.0"
    kotlin("kapt") version "1.5.0"
}
tasks.withType<Wrapper> {
    gradleVersion = "7.0"

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    kapt("com.google.dagger:dagger-compiler:2.35.1")
    implementation("com.google.dagger:dagger:2.35.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}