# Simple Number Separator
The Simple Number Separator is the lightweight library for separate number with coma in android or dot or dynamically by your locale device.

## Getting Started
Make sure your internet connection was on

### Prerequisites
First, add the JitPack repository to your root-level build.gradle file:

```
allprojects {
	repositories {
	...
		maven{url 'https://jitpack.io'}
	}
}
```

Then, in your module Gradle file (usually the app/build.gradle), add the dependencies for the Android Number Separator

```
compile 'com.github.NaturalizerINA:AndroidNumberSeparator:1.0.0'
```

### How to use
You can define your separator using coma or dot using custom locale

Example for coma:
```
String get_number_value="1000";
Separator.getInstance().doSeparate(get_number_value, Locale.US);
```

Example for dot:
```
String get_number_value="1000";
Separator.getInstance().doSeparate(get_number_value, Locale.GERMANY);
```

or you can dynamically set the separator symbol by your locale device

Example for dynamicaly symbol:
```
Separator.getInstance().doSeparate(get_number_value, Locale.getDefault());
```

## Image Demo:
![Alt text](https://github.com/NaturalizerINA/AndroidNumberSeparator/blob/master/demo_image.jpg "Demo Image")

## My Reference
Thanks to <3 JAVA <3 library 
* [java.text.DecimalFormat](http://devdocs.io/openjdk~8/java/text/decimalformat)
* [java.text.NumberFormat](http://devdocs.io/openjdk~8/java/text/numberformat)
* [java.util.Locale](http://devdocs.io/openjdk~8/java/util/locale)


## Authors
**Rahmad Setiawan Mukminullah**


## License
This project is licensed under the MIT License