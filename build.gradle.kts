plugins {
    java
}

group = "org.junaiskind"
version = "1.0.0"

repositories {
    mavenCentral()
    maven(url = "https://papermc.io/repo/repository/maven-public/")
}

allprojects {
    repositories {
        jcenter()
        maven("https://jitpack.io")
    }
}

dependencies {

    implementation("com.github.junaiskind:json-text-builder:1.0.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    implementation("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}