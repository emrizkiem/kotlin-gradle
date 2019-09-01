private const val kotlinVersion = "1.3.50"
private const val androidGradleVersion = "3.5.0"

// Support lib
private const val appcompatVersion = "1.0.0"
private const val constraintLayoutVersion = "1.1.3"

// Test lib
private const val junitVersion = "4.12"
private const val runnerVersion = "1.1.0"
private const val espressoVersion = "3.1.0"

object Dependencies {
    object Android {
        val minSdkVersion = 19
        val targetSdkVersion = 28
        val compileSdkVersion = 28
        val applicationId = "emrizkiem.dev.kotlingradle"
        val versionCode = 1
        val versionName = "1.0"
    }
    object Kotlin {
        val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    }
    object buildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }
    object SupportLibs {
        val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
        val constraint_layout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    }
    object TestLibs {
        val junit = "junit:junit:$junitVersion"
        val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"
        val runner = "androidx.test:runner:$runnerVersion"
    }
}