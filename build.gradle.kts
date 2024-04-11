plugins {
    id("java")
    id("java-library")
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
// https://mvnrepository.com/artifact/org.mybatis.generator/mybatis-generator-core
    implementation("org.mybatis.generator:mybatis-generator-core:1.4.2")
// https://mvnrepository.com/artifact/org.mockito/mockito-core
    testImplementation("org.mockito:mockito-core:5.11.0")
    annotationProcessor("org.projectlombok:lombok:1.18.32")
// https://mvnrepository.com/artifact/org.projectlombok/lombok
    compileOnly("org.projectlombok:lombok:1.18.32")
}

tasks.test {
    useJUnitPlatform()
}