import android.Keys._
import android.Dependencies.{apklib,aar}

android.Plugin.androidBuild

platformTarget in Android := "android-19"

minSdkVersion in Android := 14

libraryDependencies += "com.google.android.gms" % "play-services" % "4.4.52"

//libraryDependencies += aar("com.google.maps.android" % "android-maps-utils" % "0.3+")
libraryDependencies += "com.google.maps.android" % "android-maps-utils" % "0.3+"
