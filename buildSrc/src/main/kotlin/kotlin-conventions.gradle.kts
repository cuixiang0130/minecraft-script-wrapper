import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("js")
}

kotlin {
    js {
        moduleName = project.name
        useEsModules()
        nodejs()
    }
}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions {
        sourceMap = false
        sourceMapEmbedSources = null
        sourceMapPrefix = null
    }
}
