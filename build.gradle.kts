
subprojects{
    apply(plugin = "java")

    group = "io.github.imecuadorian"
    version = "1.0.0-SNAPSHOT"

    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://repo.codemc.io/repository/nms/")
        maven("https://oss.sonatype.org/content/repositories/snapshots")
        maven("https://oss.sonatype.org/content/repositories/central")
        maven("https://repo.unnamed.team/repository/unnamed-public/")
    }

    dependencies {
        add("compileOnly", "org.projectlombok:lombok:1.18.24")
        add("annotationProcessor", "org.projectlombok:lombok:1.18.24")
        add("implementation","org.jetbrains:annotations:20.1.0")
    }
}
