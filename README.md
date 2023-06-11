# Explorer
![A portrait of Richard Stallman, edited to signify his anger.](art/stallman.png)
## Reclaim your files!
Starting from Android 9 (API level 28), the geniuses at Android decided to implement some "restrictions" on apps. Oh, how thoughtful of them! They thought it would be a brilliant idea to prevent apps from sharing files in their data directories with other apps. Like seriously, who needs that kind of convenience anyway?

But wait, it gets even better! In Android 11 (API level 30), they took it to the next level of absurdity. Now even the stock file directory viewer, which comes pre-installed on your device, can't access the `Android/data` directory. Because, you know, it's not like people want to share those large obb files of games or those oh-so-necessary multimedia files like videos and images with their friends. Nope, let's make it impossible for them. Brilliant move! [read more](https://developer.android.com/about/versions/11/privacy/storage#other-apps-data)

Oh, and let's not forget to give a standing ovation to the Android security team. They really outdid themselves this time! Locking people out of their own File System on their hard earned precious mobile devices, how considerate! After all, who needs the right to read, delete, or modify what's stored on their own devices? Clearly, the Android security team knows better.

I can already hear some of you defending this madness, saying "but it's for our security..." Oh, how adorable! Let me show you a little meme to express my gratitude for your argument.

![Angry Batman slapping Robin.](art/bat_to_robin.png)

Oh, my dear defenders of Android's file restrictions, you are so wrong! Apps can store all sorts of sensitive data inside their internal storage. Feel free to read about it [here](https://developer.android.com/training/data-storage/app-specific).

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


