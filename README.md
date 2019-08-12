# ToastMessag

[![](https://jitpack.io/v/MohamedNajib/ToastMessag.svg)](https://jitpack.io/#MohamedNajib/ToastMessag)

Custom ToastMessag For Ease use Toast with good view

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

##### Add the dependency in your `build.gradle` file
```java
dependencies {
	        implementation 'com.github.MohamedNajib:ToastMessag:0.1.0'
	}
```

### Success Toast:
```javascript
ToastMessage.setSuccess(this,"Success Text", ToastMessage.LENGTH_LONG, true).show();
```

![s](https://user-images.githubusercontent.com/50467719/62870332-c943b300-bd19-11e9-8bea-c9ed680d565a.PNG)

