plugins {
    id(Plugins.androidApplication)
    kotlin(Plugins.kotlinAndroid)
    kotlin(Plugins.kotlinAndroidExtensions)
    kotlin(Plugins.kapt)
    id(Plugins.firebaseCrashlytics)
}

android {
    compileSdkVersion(Versions.compileSdkVersion)
    defaultConfig {
        applicationId = Config.applicationId
        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.targetSdkVersion)
        versionCode = Release.versionCode
        versionName = Release.versionName
        renderscriptTargetApi = 18
        renderscriptSupportModeEnabled = true
    }

    buildTypes {
      /*  getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }*/
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    flavorDimensions("env")
 /*   productFlavors {
        create("development") {
            buildConfigField("String", "API_BASE_URL", findProperty("apiProductionUrl") as String)
            setDimension("env")
        }

        create("production") {
            buildConfigField("String", "API_BASE_URL", findProperty("apiProductionUrl") as String)
            setDimension("env")
        }
    }*/

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

kapt {
    generateStubs = true
    correctErrorTypes = true
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // Core Libraries
    implementation(CoreLibraries.kotlin)
    implementation(CoreLibraries.coroutines)
    implementation(CoreLibraries.glide)
    "kapt"(CoreLibraries.glideCompiler)
    implementation(CoreLibraries.dagger)
    "kapt"(CoreLibraries.daggerCompiler)
    implementation(CoreLibraries.daggerAndroid)
    "kapt"(CoreLibraries.daggerAndroidProcessor)
    implementation(CoreLibraries.daggerAndroidSupport)
    "kapt"(CoreLibraries.daggerAndroidSupport)

    // Support Libraries
    implementation(AndroidxLibraries.core)
    implementation(AndroidxLibraries.appCompat)
    implementation(AndroidxLibraries.constraintLayout)
    implementation(AndroidxLibraries.material)
    implementation(AndroidxLibraries.lifecycleExtensions)
    implementation(AndroidxLibraries.lifecycleRuntime)
    implementation(AndroidxLibraries.recyclerView)
    implementation(AndroidxLibraries.viewModel)
    implementation(AndroidxLibraries.security)

    // Network
    "kapt"(ThirdPartyLibraries.moshiapt)
    implementation(ThirdPartyLibraries.moshi)
    implementation(ThirdPartyLibraries.okhttp)
    implementation(ThirdPartyLibraries.okhttpUrlConnection)
    implementation(ThirdPartyLibraries.okhttpLoggingInterceptor)
    implementation(ThirdPartyLibraries.retrofit)
    implementation(ThirdPartyLibraries.retrofitRxJavaAdapter)
    implementation(ThirdPartyLibraries.retrofitMoshiConverter)
    implementation(ThirdPartyLibraries.rxJava)
    implementation(ThirdPartyLibraries.rxAndroid)
    implementation(ThirdPartyLibraries.jwtDecoder)

    // Ui
    api(ThirdPartyLibraries.scalableImageView)
    implementation(ThirdPartyLibraries.circleImageView)
    implementation(ThirdPartyLibraries.objectAnimator)
    implementation(ThirdPartyLibraries.elevationimageview)
    implementation(ThirdPartyLibraries.swiperefreshlayout)

    // File and Sound Helpers
    implementation(ThirdPartyLibraries.fileBox)
    implementation(ThirdPartyLibraries.exoPlayer)

    // View Architectures
    implementation(ThirdPartyLibraries.airbnbEpoxy)
    "kapt"(ThirdPartyLibraries.airbnbEpoxyProcessor)
    implementation(ThirdPartyLibraries.gravitySnapHelper)
    implementation(ThirdPartyLibraries.lottie)

    // App Insights
    implementation(platform(AppInsightLibraries.core))
    implementation(AppInsightLibraries.analytics)
    implementation(AppInsightLibraries.messaging)
    implementation(AppInsightLibraries.crashlytics)

    // Fragment Stack Controller
    implementation(ThirdPartyLibraries.trendyolMedusa)
}

//apply(mapOf("plugin" to "com.google.gms.google-services"))