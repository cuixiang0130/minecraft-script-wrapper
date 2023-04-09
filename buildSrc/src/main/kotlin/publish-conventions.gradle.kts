plugins {
    kotlin("js")
    `maven-publish`
}

configure<PublishingExtension> {
    publications{
        create<MavenPublication>("kotlin"){
            from(components["kotlin"])
        }
    }

}


