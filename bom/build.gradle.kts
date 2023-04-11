plugins {
    `java-platform`
    `maven-publish`
}

dependencies {
    constraints {
        api(project(":server"))
    }
}

configure<PublishingExtension> {
    publications{
        create<MavenPublication>("bom") {
            from(components["javaPlatform"])
        }
    }
}