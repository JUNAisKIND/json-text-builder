plugins {
    java
    `maven-publish`
}

group = "com.github.junaiskind"
version = "1.0.9"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenLocal()
    maven(url = "https://papermc.io/repo/repository/maven-public/")
}

dependencies {

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    compileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

publishing {
    publications {
        create("maven_public", MavenPublication::class) {
            groupId = group.toString()
            artifactId = "json-text-builder"
            version = version
            from(components.getByName("java"))
        }
    }
}