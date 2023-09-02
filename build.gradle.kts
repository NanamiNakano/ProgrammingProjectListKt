import java.util.*

val ktorVersion: String by project
val kotlinxHtmlVersion: String by project

plugins {
    kotlin("jvm") version "1.9.0"
    id("org.jetbrains.gradle.plugin.idea-ext") version "1.1.6"
}

group = "dev.thynanami.pplk"
version = "1.0-SNAPSHOT"

val properties = Properties()
properties.load(project.rootProject.file("local.properties").inputStream())

repositories {
    gradlePluginPortal()
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/patbeagan1/ProtocolRSS")
        credentials {
            username = properties.getProperty("gpr.user") ?: System.getenv("USERNAME")
            password = properties.getProperty("gpr.key") ?: System.getenv("TOKEN")
        }
    }
    maven("https://jitpack.io")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.1")

    implementation("dev.patbeagan1:protocol-rss:0.3.1")
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("org.slf4j:slf4j-simple:2.0.7")

    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:$kotlinxHtmlVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-html:$kotlinxHtmlVersion")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
