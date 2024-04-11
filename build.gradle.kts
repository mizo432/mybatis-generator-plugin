plugins {
    id("java")
}

group = "org.venus-pj"
version = "1.0-SNAPSHOT"
java {
    sourceCompatibility = JavaVersion.VERSION_21
}
repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.25.3")
    implementation("com.google.guava:guava:33.1.0-jre")

}

tasks.test {
    useJUnitPlatform()
}