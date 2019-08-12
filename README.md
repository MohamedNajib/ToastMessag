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



