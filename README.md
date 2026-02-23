# Explorer
A small app to regain access to your files and folders.

## Installation

#### Binaries/APK

Pre-built binaries are available from [here](https://github.com/mickeymgk/explorer/releases/latest).

#### Building from source
You can build the project by opening it via Android Studio, but you can also build it form terminal like so
Assuming you've already setup JDK, Gradle & Android SDK in your system, run the following command in your terminal within the source directory:

##### Linux/Mac
```
./gradlew assembleDebug
```

##### Windows
```
.\gradlew assembleDebug
```
the resulting apk can be found in the following directory ``app/build/outputs/apk/debug/app-debug.apk``. You can send it to your device then install it or through ADB with this command ``adb install <path-to-apk>``.

## Usage
After installation simply open the App named ``Explorer`` from your launcher. Then, you can access whichever file you need.

## How does it work
The codebase is pretty much self-explanatory & short, but as a general description, it works by opening the ``Android DocumentsUI`` Component via an ``Intent`` without the need of Root. You can read more about it [here](https://source.android.com/docs/core/ota/modular-system/documentsui). Or if you're technically inclined, explore the source code from the Android Open Source Project [here](https://android.googlesource.com/platform/packages/apps/DocumentsUI/+/refs/heads/master).

## Bonus point
The project includes a CI/CD workflow (Github Action) that can serve a base for building your next Android workflow. you can check it [here](https://github.com/mickeymgk/explorer/blob/main/.github/workflows/android.yml)


