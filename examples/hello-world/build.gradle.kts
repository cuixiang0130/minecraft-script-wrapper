import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

plugins {
    kotlin("js") version "1.8.20"
}

group = "example"
version = "1.0"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(enforcedPlatform("minecraft-script-wrapper:bom:release-1.19.50"))
    implementation("minecraft-script-wrapper:server:1.0.0")
    testImplementation(kotlin("test"))
}

kotlin {
    js {
        binaries.executable()
        useEsModules()
        nodejs()
    }
}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions {
        useEsClasses = true
    }
}

rootProject.plugins.withType<NodeJsRootPlugin> {
    rootProject.the<NodeJsRootExtension>().download = false
}

rootProject.plugins.withType<YarnPlugin> {
    rootProject.the<YarnRootExtension>().download = false
}

