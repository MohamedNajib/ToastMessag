# ToastMessag

[![](https://jitpack.io/v/MohamedNajib/ToastMessag.svg)](https://jitpack.io/#MohamedNajib/ToastMessag)

Custom ToastMessag For Ease use Toast with good view

### ToastMessag library
---
![s](https://user-images.githubusercontent.com/50467719/62870332-c943b300-bd19-11e9-8bea-c9ed680d565a.PNG) ![w](https://user-images.githubusercontent.com/50467719/62872678-42450980-bd1e-11e9-905c-82c1f0b92e9d.PNG)![i](https://user-images.githubusercontent.com/50467719/62872745-69034000-bd1e-11e9-8497-9be32e3c3922.PNG)![Capture](https://user-images.githubusercontent.com/50467719/62872776-78828900-bd1e-11e9-836a-26b978905914.PNG)![n](https://user-images.githubusercontent.com/50467719/62872808-86380e80-bd1e-11e9-8c0e-44152bf3af72.PNG)


### How to integrate the ToastMessag library in your app?
---

##### Add this in your root `build.gradle` file
```java
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

##### For `AndroidX` Add the dependency in your `build.gradle` file
  * make sure the version matches the JitPack badge above
```java
dependencies {
        implementation 'com.github.MohamedNajib:ToastMessag:1.1.0'
}
```
##### If you still using `Android support library` in your android apps Add the dependency in your `build.gradle` file
```java
dependencies {
	implementation 'com.github.MohamedNajib:Support_ToastMessag:1.1.0'
}
```


### Usage
---

#### Success Toast:
```javascript
ToastMessage.setSuccess(yourContext,"Success Toast", ToastMessage.LENGTH_LONG, true).show();
```

#### Info Toast:
```javascript
ToastMessage.setInfo(yourContext, "Info Toast", ToastMessage.LENGTH_SHORT, true).show();
```

#### Warning Toast:
```javascript
ToastMessage.setWarning(yourContext, "Warning Toast", ToastMessage.LENGTH_SHORT, true).show();
```

#### Error Toast:
```javascript
ToastMessage.setError(yourContext, "Error Toast", ToastMessage.LENGTH_SHORT, true).show();
```

#### Normal Toast:
```javascript
ToastMessage.setNormal(yourContext, "Normal Toast", ToastMessage.LENGTH_LONG).show();
```



