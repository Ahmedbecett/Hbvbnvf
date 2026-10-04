package com.example.ads

/**
 * AdMob Configuration for TokPulse.
 *
 * NOTE FOR PRODUCTION DEPLOYMENT:
 * Replace these test IDs with your production AdMob App ID and Ad Unit IDs
 * obtained from the Google AdMob Console (https://admob.google.com).
 * Also update `com.google.android.gms.ads.APPLICATION_ID` in AndroidManifest.xml.
 */
object AdConfig {
    // Official Google Test IDs for safe development & verification
    const val TEST_APP_ID = "ca-app-pub-3940256099942544~3347511713"
    const val BANNER_AD_UNIT_ID = "ca-app-pub-3940256099942544/6300978111"
    const val INTERSTITIAL_AD_UNIT_ID = "ca-app-pub-3940256099942544/1033173712"
    const val REWARDED_AD_UNIT_ID = "ca-app-pub-3940256099942544/5224354917"

    // Set to true to enable advertising across feed, discover, and wallet
    var isAdsEnabled: Boolean = true
}
