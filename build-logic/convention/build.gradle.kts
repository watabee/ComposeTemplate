plugins {
    `kotlin-dsl`
}

group = "com.github.watabee.composetemplate.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "composetemplate.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "composetemplate.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "composetemplate.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidLibrary") {
            id = "composetemplate.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
    }
}
