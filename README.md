# Android-default-offline-CrossPromo-Ad
An offline ad that can be show to Android app users if they don't have an internet connection.

You can use this implementation in your Android app to show an ad to a user even if he has turned off or doesn't have an internet connection. This way, you can cross-promote other apps/products you've made.

In order to show the app, simply use an Intent->startActivity() for the default_ad class in your onInterstitialLoadFailed, if the Interstitial isn't ready when it should be shown, and if the Interstitial is null.

![Offline Ad Design](examples/default-ad-design.png?raw=true "Offline Ad Design")
