object CoreLibraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinVersion}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
    const val dagger = "com.google.dagger:dagger:${Versions.daggerVersion}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.daggerVersion}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.daggerVersion}"
    const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.daggerVersion}"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.daggerVersion}"
}

object ThirdPartyLibraries {
    //const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    const val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.moshiVersion}"
    const val moshiapt = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshiVersion}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttpVersion}"
    const val okhttpUrlConnection = "com.squareup.okhttp3:okhttp-urlconnection:${Versions.okhttpVersion}"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofitRxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofitVersion}"
    const val retrofitMoshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofitVersion}"
    //const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    const val rxJava = "io.reactivex.rxjava3:rxjava:${Versions.rxJavaVersion}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroidVersion}"
    const val jwtDecoder = "com.auth0.android:jwtdecode:${Versions.jwtDecoderVersion}"

    const val scalableImageView = "com.davemorrissey.labs:subsampling-scale-image-view-androidx:${Versions.scaleImageViewVersion}"
    const val circleImageView = "de.hdodenhof:circleimageview:${Versions.circleImageViewVersion}"
    const val objectAnimator = "com.bartoszlipinski:viewpropertyobjectanimator:${Versions.objectAnimatorVersion}"
    const val spinKit = "com.github.ybq:Android-SpinKit:${Versions.spinKitVersion}"
    const val elevationimageview = "com.qhutch.elevationimageview:elevationimageview:${Versions.elevationimageviewVersion}"
    const val swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiperefreshlayoutVersion}"

    const val fileBox = "com.github.lyrebirdstudio:filebox:${Versions.fileboxVersion}"
    const val exoPlayer = "com.google.android.exoplayer:exoplayer:${Versions.exoPlayerVersion}"

    const val airbnbEpoxy = "com.airbnb.android:epoxy:${Versions.airbnbEpoxyVersion}"
    const val airbnbEpoxyProcessor = "com.airbnb.android:epoxy-processor:${Versions.airbnbEpoxyVersion}"
    const val gravitySnapHelper = "com.github.rubensousa:gravitysnaphelper:${Versions.gravitySnapHelperVersion}"
    const val lottie = "com.airbnb.android:lottie:${Versions.lottieVersion}"
    const val trendyolMedusa = "com.github.trendyol:medusa:${Versions.trendyolMedusaVersion}"
}

object AndroidxLibraries {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val core = "androidx.core:core-ktx:${Versions.coreVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val material = "com.google.android.material:material:${Versions.materialVersion}"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleVersion}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerviewVersion}"
    const val security = "androidx.security:security-crypto:${Versions.securityVersion}"
}

object AppInsightLibraries {
    const val core = "com.google.firebase:firebase-bom:${Versions.firebaseVersion}"
    const val analytics = "com.google.firebase:firebase-analytics-ktx"
    const val messaging = "com.google.firebase:firebase-messaging-ktx"
    const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
}