#!/usr/bin/env bash

#Android Settings
ANDROID_GRADLE_FILE=$APPCENTER_SOURCE_DIRECTORY/app/build.gradle
ANDROID_MANIFEST_FILE=$APPCENTER_SOURCE_DIRECTORY/app/src/main/AndroidManifest.xml
ANDROID_STRINGS_FILE=$APPCENTER_SOURCE_DIRECTORY/app/src/main/res/values/strings.xml

#sed -i '' 's/package="[a-z.]*"/package="'$APP_BUNDLE_ID'"/' $ANDROID_MANIFEST_FILE

echo "File content Manifest:"
cat $ANDROID_MANIFEST_FILE

sed -i '' 's/versionName "[0-9.]*"/versionName "'${APP_MAJOR_ID}.${APP_MINOR_ID}.${APPCENTER_BUILD_ID}'"/' $ANDROID_GRADLE_FILE
sed -i '' 's/versionCode [0-9.]*/versionCode '${APPCENTER_BUILD_ID}'/' $ANDROID_GRADLE_FILE
sed -i '' 's/applicationId "[a-z.]*"/applicationId "'$APP_BUNDLE_ID'"/' $ANDROID_GRADLE_FILE
