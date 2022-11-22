import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    id("org.jetbrains.compose") version "1.1.1"
}

group = "me.mikesol"
version = "1.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.desktop.currentOs)

    implementation("com.darkrockstudios:richtexteditor:1.3.0")

// for Cyrillic symbols
    implementation ("ru.noties:jlatexmath-android-font-cyrillic:0.2.0")

// for Greek symbols
    implementation ("ru.noties:jlatexmath-android-font-greek:0.2.0")

    implementation("org.scilab.forge:jlatexmath:1.0.7")

    implementation("com.mikepenz:multiplatform-markdown-renderer:0.6.1")

    implementation ("org.jetbrains:markdown:0.3.1") //???


}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "16"
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "MyMath"
            packageVersion = "1.0.0"
        }
    }
}