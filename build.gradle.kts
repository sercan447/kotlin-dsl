// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath(ClassPaths.gradleClasspath)
        classpath(ClassPaths.kotlinGradlePluginClasspath)
        classpath(ClassPaths.playServicesPlugin)
        classpath(ClassPaths.firebaseCrashlyticsClassPath)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven ("https://plugins.gradle.org/m2/")
        maven ("https://repo.spring.io/plugins-release/")
        maven("https://jitpack.io")
        maven("https://maven.google.com")
    }
}

task("clean") {
    delete(rootProject.buildDir)
}