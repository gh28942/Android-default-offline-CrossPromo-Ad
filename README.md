# Android default offline CrossPromo ad
An <b>offline ad</b> that can be shown to Android app users if they don't have an internet connection (or if an ad fails to load for any other reason, e.g. not enough time to load).

You can use this implementation in your Android app to <b>show an ad to a user</b> even if he has <b>turned off or doesn't have an internet connection</b>. This way, you can <b>cross-promote other apps/products</b> you've made.

In order to show the app, simply use an Intent->startActivity() for the default_ad class in your onInterstitialLoadFailed, if the Interstitial isn't ready when it should be shown, and if the Interstitial is null.


Offline ad design:
<br>
<hr>
<br>
<p align="center">
<img src="https://raw.githubusercontent.com/gh28942/Android-default-offline-CrossPromo-Ad/master/examples/default-ad-design.png" width="80%">
<br>Offline Ad Design</br>
<br>
</p>
<hr>
<br>
<p align="center">
<img src="https://raw.githubusercontent.com/gh28942/Android-default-offline-CrossPromo-Ad/master/examples/screenshot_20190610-154840.jpg" width="40%">
<br>In-app screenshot of the offline ad</br>
<br>
</p>
<hr>
<br>
You can find the offline <i>banner</i> here: https://github.com/gh28942/Android-default-offline-CrossPromo-Ad-banner
