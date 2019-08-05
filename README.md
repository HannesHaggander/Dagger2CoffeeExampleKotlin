# :dagger: Dagger2 coffee example in Kotlin
Translated the Dagger 2 coffee example, provided by [the dagger 2 repository](https://github.com/google/dagger/tree/master/examples), to Kotlin. 

Google coffee example project in Kotlin using Android Studio
 
When attempting to get into Dagger I was unable to find the provided coffee example written in Kotlin so I figured I might as well post it.
The biggest hurdle was getting gradle to work properly as it differs from the java gradle implementation. 

## Instructions for Gradle configuration 

To find the repository for dagger and the latest updates go to:

[github.com/google/dagger](https://github.com/google/dagger/)

Find the latest version of the dagger library and what to include in the gradle.
Open the gradle file in your android project

The project requires a plugin called "kapt" to be included for kotlin development. 
Add:

```Gradle
apply plugin: 'kotlin-kapt'
```

at the top of the file along with the other plugins in the project.

As of writing this is the recommended dependencies to add: 

```Gradle
dependencies {
  ..

  compile 'com.google.dagger:dagger:2.x'
  annotationProcessor 'com.google.dagger:dagger-compiler:2.x'

  compile 'com.google.dagger:dagger-android:2.x'
  compile 'com.google.dagger:dagger-android-support:2.x'
  annotationProcessor 'com.google.dagger:dagger-android-processor:2.x'

  ..
}
```

Both 'compile' and 'annotationProcessor' has to be changed to something like this: 

Note: Make sure that the kapt plugin is added.

```Gradle
dependencies {
  ..

  implementation 'com.google.dagger:dagger:2.x'
  kapt 'com.google.dagger:dagger-compiler:2.x'

  implementation 'com.google.dagger:dagger-android:2.x'
  implementation 'com.google.dagger:dagger-android-support:2.x'
  kapt 'com.google.dagger:dagger-android-processor:2.x'

  ..
}
```
 	
Replace the library x with the latest version of the dagger library. As of writing the latest library is 2.24 and would look like this: 
	
```Gradle
implementation 'com.google.dagger:dagger:2.24'
```

If desired, the version can be defined and used like this:

```Gradle
dependencies {
  ..

  def dagger_version = "2.24"
  implementation "com.google.dagger:dagger:$dagger_version"
  kapt "com.google.dagger:dagger-compiler:$dagger_version"

  implementation "com.google.dagger:dagger-android:$dagger_version"
  implementation "com.google.dagger:dagger-android-support:$dagger_version"
  kapt "com.google.dagger:dagger-android-processor:$dagger_version"

  ..
}
```

Note that the single ' has to be replaced with " for the defined interpolation to work.

e.i.
	
```Gradle
implementation "com.google.dagger:dagger:$dagger_version" // Works
```

```Gradle
implementation 'com.google.dagger:dagger:$dagger_version' // Wont work
```

Thats it. Dagger is added and annotations will be able to generate dagger classes.
