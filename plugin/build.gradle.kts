plugins{
    id("com.github.johnrengelman.shadow") version ("7.1.2")
}

dependencies {
    compileOnly("org.spigotmc:spigot:1.8.8-R0.1-SNAPSHOT")
    implementation(project(":api"))
}
