WebView App Documentation
=========================

This is a documentation for WebView App created by [Robo Templates](http://robotemplates.com/). WebView App is a native Android application. You can find here useful info about configuring, customizing, building and publishing the app.

* [WebView App on Codecanyon](http://codecanyon.net/item/universal-android-webview-app/8431507)
* [Video manual on YouTube](https://www.youtube.com/watch?v=GaOJu7elxCA)
* [Video preview on YouTube](https://www.youtube.com/watch?v=mcEXzYXvC94)
* [Live demo on Google Play](https://play.google.com/store/apps/details?id=com.robotemplates.webviewapp)


## Features

* Support for Gingerbread (Android 2.3.3) and newer
* Developed with Android Studio & Gradle
* Material design following Android Design Guidelines
* Ten color themes (blue, brown, gray, green, lime, orange, purple, red, teal, violet)
* Thirty menu icons
* Action bar
* Navigation drawer menu (easily customizable)
* Pull-to-Refresh
* Share dialog
* Intents (e-mail, sms, phone call, map, store)
* Download manager
* File picker for uploading files
* WebView supports JavaScript, Cookies, CSS, images, videos and other standard web tools and technologies
* HTML5 videos, YouTube, Vimeo
* Support for opening links in external browser (customizable rules)
* Local pages (available in offline)
* Error handling
* Offline handling
* Progress bar when loading the page
* Google Analytics
* AdMob
* Push notifications (Parse)
* Responsive design (portrait, landscape, handling orientation change)
* Support for high-resolution displays (xxhdpi)
* Multi-language support
* Possibility to build the project without Android Studio / Eclipse (using Gradle & Android SDK)
* Easy configuration
* Well documented
* Top quality clean code created by experienced senior Android developer
* Free support


## Android SDK & Android Studio

This chapter describes how to install Android SDK and Android Studio. You don't have to install Android Studio, but it's better. The project can be built without Android Studio, using Gradle and Android SDK. Gradle is a build system used for building final APK file.

1. Install [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. Install [Android SDK](https://developer.android.com/sdk/index.html)
3. Run Android SDK Manager and [download necessary SDK packages](https://developer.android.com/sdk/installing/adding-packages.html), make sure that you have installed Android SDK Tools, Android SDK Platform-tools, Android SDK Build-tools, Android Support Repository, Android Support Library and Google Play services
4. Install [Android Studio](https://developer.android.com/sdk/index.html)
5. Now you should be able to open/edit the Android project and build APK
6. You can also install [Genymotion](http://www.genymotion.com/) - fast Android emulator


## Project structure

Project has the following structure (directories are marked by square braces):

- [app] - main module
- [app]/[libs] - contains 3rd party libraries (not used)
- [app]/[src] - contains source code
- [app]/[src]/[main]
- [app]/[src]/[main]/[assets] - asset files (local html pages)
- [app]/[src]/[main]/[java] - java sources
- [app]/[src]/[main]/[res] - xml resources, drawables
- [app]/[src]/[main]/AndroidManifest.xml - manifest file
- [app]/build.gradle - main build script
- [app]/proguard-rules.pro - Proguard config (not used)
- [doc] - documentation
- [extras] - contains extras
- [extras]/[keystore]
- [extras]/[keystore]/webviewapp.keystore - keystore certificate for signing APK
- [extras]/[keystore]/webviewapp.properties - alias and password for keystore
- [gradle]
- [gradle]/[wrapper] - Gradle Wrapper
- .gitignore - Gitignore file
- build.gradle - parent build script
- gradle.properties - build script properties containing path to keystore
- gradlew - Gradle Wrapper (Unix)
- gradlew.bat - Gradle Wrapper (Windows)
- README.md - readme file
- settings.gradle - build settings containing list of modules

Java packages:

- com.robotemplates.webviewapp - contains application class and main config class
- com.progress.photos.activity - contains activities representing screens
- com.progress.photos.adapter - contains all adapters
- com.progress.photos.fragment - contains fragments with main application logic
- com.progress.photos.utility - contains utilities
- com.progress.photos.view - contains tools for working with views


## Configuration

This chapter describes how to configure the project to be ready for publishing. All these steps are very important!


### 1. Import

Unzip the package and import/open the project in Android Studio. Choose "Import project" on Quick Start screen and select "webviewapp-x.y.z" directory.


### 2. Rename package name

1. Create new package in _java_ directory, e.g. "com.mycompany.myapp". Right click on _app/src/main/java_ directory -> New -> Package.
2. Select all packages and classes in "com.robotemplates.webviewapp" and move (drag) them to the new package.
3. Delete the old package "com.robotemplates.webviewapp".
4. Open _app/src/main/AndroidManifest.xml_ and rename the package name. Select package name "com.robotemplates.webviewapp" -> Right click on selected text -> Refactor -> Rename -> enter the new package name, select "Search in comments and strings" option -> Refactor -> Do Refactor.
5. Clean the project. Main menu -> Build -> Clean Project.
6. Replace all occurrences of "com.robotemplates.webviewapp" for a new package name, e.g. "com.mycompany.myapp". Right click on _app_ directory -> Replace in Path -> set old and new package names, Case sensitive to true -> Find -> Replace.
7. Clean the project again. Main menu -> Build -> Clean Project.
8. Synchronize the project. Main menu -> Tools -> Android -> Sync Project with Gradle Files.
9. If you see "Activity class does not exist" error, restart Android Studio.


### 3. Rename application name

Open _app/src/main/res/values/strings.xml_ and change "WebView App" to your own name.


### 4. Create launcher icon

Right click on _app/src/main/res_ directory -> New -> Image Asset -> Asset type Launcher Icons, Resource name "ic\_launcher", create the icon -> Next -> Finish.

You can also change the icon replacing _ic\_launcher.png_ file in _mipmap-mdpi_, _mipmap-hdpi_, _mipmap-xhdpi_, _mipmap-xxhdpi_ directories. See [Android Cheatsheet for Graphic Designers](http://petrnohejl.github.io/Android-Cheatsheet-For-Graphic-Designers/#screen-densities-and-icon-dimensions) for correct launcher icon dimensions. Don't forget to change also the icon for a push notification replacing _ic\_stat\_notify.png_ file in _drawable-mdpi_, _drawable-hdpi_, _drawable-xhdpi_, _drawable-xxhdpi_ directories.

Another possibility is to create launcher icons using [Android Asset Studio](http://romannurik.github.io/AndroidAssetStudio/icons-launcher.html).

**Important:** _ic\_launcher.png_ is the launcher icon and _ic\_stat\_notify.png_ is the icon for the push notification.

**Note:** _ab\_ic\_launcher.png_ is no longer used in a new version of the app with Material design.


### 5. Choose color theme

Open _app/src/main/AndroidManifest.xml_ and change value of `application.android:theme` attribute. There are 10 themes you can use:

* Theme.WebViewApp.Blue
* Theme.WebViewApp.Brown
* Theme.WebViewApp.Gray
* Theme.WebViewApp.Green
* Theme.WebViewApp.Lime
* Theme.WebViewApp.Orange
* Theme.WebViewApp.Purple
* Theme.WebViewApp.Red
* Theme.WebViewApp.Teal
* Theme.WebViewApp.Violet


### 6. Setup navigation and web pages

Open _app/src/main/res/values/navigation.xml_. There are 4 string arrays:

* List of titles in navigation drawer menu.
* List of webview URLs. You can specify URL link to a web page on the Internet or URL link to a local page stored in _assets_ directory. Local page does not require Internet connection. URL to the local page must be in this format: `file:///android_asset/example.html`.
* List of icons in navigation drawer menu.
* List of share messages. Each webview page can be shared via e-mail, sms, social networks etc. Share button is in the action bar. You can specify a message which gonna be posted. If you don't want to share the page, keep the item empty.

You can add/remove/modify menu items as you need. If you want to use local pages, copy HTML files to _app/src/main/assets_ directory and set proper paths in _navigation\_url\_list_ array. See the path format above.

**Important:** each of these 4 arrays must contain the same number of items.


### 7. Setup Google Analytics

Open _app/src/main/res/xml/analytics\_app\_tracker.xml_ and change UA code (_ga\_trackingId_ parameter) to your own UA code. You can enable/disable Google Analytics in configuration file _/app/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_.


### 8. Setup AdMob

Open _app/src/main/res/values/admob.xml_ and change unit id (_admob\_unit\_id_ parameter) to your own unit id (banner id). You should also specify your test device id (_admob\_test\_device\_id_ parameter) and use test mode when debugging the app. Requesting test ads is recommended when testing your application so you do not request invalid impressions. You can find your hashed device id in the logcat output by requesting an ad when debugging on your device. You can enable/disable AdMob in configuration file _/app/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_.


### 9. Setup push notifications

Application uses [Parse](https://www.parse.com/) for push notifications. You need to create a new Parse account if you don't have one. Open configuration file _/app/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and setup `PARSE_APPLICATION_ID` and `PARSE_CLIENT_KEY` constants. You can find application id and client key in [Parse settings](https://www.parse.com/). Open Parse admin -> choose your app -> Settings -> Keys -> Application Keys. Then open _app/src/main/AndroidManifest.xml_ and uncomment necessary permissions, service and receivers. There are 2 blocks of commented out code. The first starts with "uses-permission", the second starts with "service", so uncomment them.

**Note:** keep the constants in the configuration file empty and don't uncomment the code in the manifest file if you do not want to use push notifications.

**Tip:** _ic\_stat\_notify.png_ is an icon for the push notification. You can change it if you want.


### 10. Create signing keystore

You need to create your own keystore to sign an APK file before publishing on Google Play. You can create the keystore via [keytool utility](http://docs.oracle.com/javase/7/docs/technotes/tools/solaris/keytool.html) which is part of Java JDK.

1. Run following command: `keytool -genkey -v -keystore webviewapp.keystore -alias <your_alias> -keyalg RSA -keysize 2048 -validity 36500` where `<your_alias>` is your alias name. For example your company name or app name. If you are going to publish the app on Google Play, you have to set the validity attribute.
2. Copy new _webviewapp.keystore_ file into _extras/keystore_ directory.
3. Open _extras/keystore/webviewapp.properties_ and set keystore alias and passwords.
4. Done. Remember that _webviewapp.keystore_ and _webviewapp.properties_ are automatically read by Gradle script when creating a release APK via _assembleRelease_ command. Paths to these files are defined in _gradle.properties_.


## Customization

This chapter describes some optional customizations of the app.


### Custom colors and icons

You can customize colors in _app/src/main/res/values/colors.xml_.

There are 30 icons which you can use for navigation drawer menu. If you need to create the icon for navigation drawer, it is recommended to use [Android Asset Studio](http://romannurik.github.io/AndroidAssetStudio/index.html). See [Android Cheatsheet for Graphic Designers](http://petrnohejl.github.io/Android-Cheatsheet-For-Graphic-Designers/#screen-densities-and-icon-dimensions) for correct icon dimensions.


### Open links in external browser

If you click on some link in the webview, web page is opened directly in the webview by default. Pages can be opened in external browser. If you need this behavior, just open configuration file _/app/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and set `OPEN_LINKS_IN_EXTERNAL_BROWSER = true`.

You can also set a rules which links will be opened in external browser and which ones will be loaded in internal webview. Open configuration file _/app/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and add/remove rules in `LINKS_OPENED_IN_EXTERNAL_BROWSER` or `LINKS_OPENED_IN_INTERNAL_WEBVIEW` arrays. If URL link contains the string from the array, it will be opened in external browser/internal webview. These rules have higher priority than `OPEN_LINKS_IN_EXTERNAL_BROWSER` option. For example "http://www.example.com/?target=blank" will be opened externally and "http://www.example.com/?target=webview" will be opened internally.


### Download manager

This feature allows to download files from the web into the device. Just click on the download link and the file will be automatically downloaded into DOWNLOAD directory. File URL must have a specific format so download manager can recognize it is a downloadable file - URL must ends with the supported extension (zip, pdf, mp3, avi etc.), e.g. _http://www.example.com/path/mediafile.mp3_ or _http://www.example.com/path/mediafile.mp3?arg1=1&arg2=2_. You can see progress of downloading in the notification panel. You can modify supported file formats in config file. Just open configuration file _/app/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and add/remove file types in `DOWNLOAD_FILE_TYPES` array as you need. Keep this array empty if you don't want to use download manager.


### Intents in HTML

Application supports [Android Intents](http://developer.android.com/guide/components/intents-filters.html). You can add a special link to your HTML file and you will be able to run appropriate external app to perform some action. For example send an e-mail or call somebody. Following intents are supported (example URI):

* HTTP web page: http://android.com
* HTTPS web page: https://google.com
* E-mail: mailto:someone@example.com?subject=Hello
* Phone call: tel:+0123456789
* SMS: sms:+0123456789
* Map point: geo:50.087474,14.421206
* Map search: geo:0,0?q=Czech+Republic


### Video in HTML

Application supports HTML5 video however there is a known bug on Android KitKat which blocks the webview component. See official [Android Issue Tracker](https://code.google.com/p/android/issues/detail?id=63754) for more info.


### Uploading files

Application supports uploading files however there is a known bug on some Android versions so the upload does not work properly. See official [Android Issue Tracker](https://code.google.com/p/android/issues/detail?id=62220) for more info.


## Building & publishing

This chapter describes how to build APK with Gradle and prepare app for publishing. Android Studio uses Gradle for building Android applications.

You don't need to install Gradle on your system, because there is a [Gradle Wrapper](http://www.gradle.org/docs/current/userguide/gradle_wrapper.html). The wrapper is a batch script on Windows, and a shell script for other operating systems. When you start a Gradle build via the wrapper, Gradle will be automatically downloaded and used to run the build.

1. Open the project in Android Studio
2. Open configuration file _/app/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and set constants as required (see below for more info)
3. Open main build script _/app/build.gradle_ and set constants as required (see below for more info)
4. Run `gradlew assemble` in console
5. APK should be available in _/app/build/outputs/apk_ directory

**Note:** You will also need a "local.properties" file to set the location of the SDK in the same way that the existing SDK requires, using the "sdk.dir" property. Example of "local.properties" on Windows: `sdk.dir=C:\\adt-bundle-windows\\sdk`. Alternatively, you can set an environment variable called "ANDROID\_HOME".

**Tip:** Command `gradlew assemble` builds both - debug and release APK. You can use `gradlew assembleDebug` to build debug APK. You can use `gradlew assembleRelease` to build release APK. Debug APK is signed by debug keystore. Release APK is signed by own keystore, stored in _/extras/keystore_ directory.

**Signing process:** Keystore passwords are automatically loaded from property file during building the release APK. Path to this file is defined in "keystore.properties" property in "gradle.properties" file. If this property or the file does not exist, user is asked for passwords explicitly.


### WebViewAppConfig.java

This is the main configuration file. There are some true/false switches. It is very important to correctly set these switches before building the APK.

* LOGS - true for showing logs
* ANALYTICS - true for enabling Google Analytics
* ADMOB - true for enabling AdMob

**Important:** Following configuration should be used for release APK, intended for publishing on Google Play:

```java
public static final boolean LOGS = false;
public static final boolean ANALYTICS = true;
public static final boolean ADMOB = true;
``` 


### build.gradle

This is the main build script and there are 4 important constants for defining version code and version name.

* VERSION\_MAJOR
* VERSION\_MINOR
* VERSION\_PATCH
* VERSION\_BUILD

See [Versioning Your Applications](http://developer.android.com/tools/publishing/versioning.html#appversioning) in Android documentation for more info.


## Dependencies

* [Android Support Library v4](http://developer.android.com/tools/support-library/index.html)
* [AppCompat](https://developer.android.com/reference/android/support/v7/appcompat/package-summary.html)
* [Google Play Services](http://developer.android.com/google/play-services/index.html)
* [Parse](https://www.parse.com)


## Changelog

* Version 1.0.0
	* Initial release
* Version 1.1.0
	* AdMob support
	* Configuration for opening links in webview
* Version 1.2.0
	* Update Gradle script to be compatible with Android Studio 1.0
	* Download manager
	* Open links directly in the webview by default
	* Show progress bar when loading nested link
	* Fix refreshing of the current page
	* Fix text color of the HTML select
	* Fix Google Play intent
* Version 1.3.0
	* Material design
	* New color themes
	* New set of menu icons
	* Rules for opening links in external browser or internal webview
	* Support for uploading files
* Version 1.4.0
	* Push notifications
	* Launcher icon as a mipmap
	* Fix empty placeholder


## Developed by

[Robo Templates](http://robotemplates.com/)


## License

[Codecanyon licenses](http://codecanyon.net/licenses)
