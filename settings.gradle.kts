rootProject.name = "minecraft-script-wrapper"

pluginManagement {
    resolutionStrategy {
        plugins {
            val kotlinVersion = extra["kotlin.version"] as String
            kotlin("js") version kotlinVersion
        }
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":server")
include(":server-ui")

include(":server-admin")
include(":server-net")

include(":bom")
