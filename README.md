# App_01
from [Android Get Started](https://developer.android.com/training/basics/firstapp/creating-project.html)

## 1. Empty Activity
Learn to create 2 Activities and connect them together.
  * MainActivity
  * DisplayMessageActivity

### MainActivity
MainActivity has 2 objects: _EditText_ and _Button_. User will fill up the text, then click
the send button. The event will instantiate DisplayMessageActivity and show the text.

### DisplayMessageActivity
It only contain a ViewText that shows the sent text.

## 2. Internationalization
Default is US, and alternative is ES (Spanish)
```
MyProject/
    res/
       values/
           strings.xml
       values-b+es/
           strings.xml
       mipmap/
           country_flag.png
       mipmap-b+es+ES/
           country_flag.png
```

## 3. Supporting Different Screens
* There are four generalized sizes: small, normal, large, xlarge
* And four generalized densities: low (ldpi), medium (mdpi), high (hdpi), extra high (xhdpi)

For example, this project includes a default layout and an alternative layout for large screens:
```
MyProject/
    res/
        layout/
            main.xml
        layout-large/
            main.xml
```

As another example, here's a project with an alternative layout for landscape orientation:
```
MyProject/
    res/
        layout/
            main.xml
        layout-land/
            main.xml
```
By default, the layout/main.xml file is used for portrait orientation.

If you want to provide a special layout for landscape, including while on large screens, then you need to use both the large and land qualifier:
```
MyProject/
    res/
        layout/              # default (portrait)
            main.xml
        layout-land/         # landscape
            main.xml
        layout-large/        # large (portrait)
            main.xml
        layout-large-land/   # large landscape
            main.xml
```

To generate these images, you should start with your raw resource in vector format and generate the images for each density using the following size scale:

* xhdpi: 2.0
* hdpi: 1.5
* mdpi: 1.0 (baseline)
* ldpi: 0.75

This means that if you generate a 200x200 image for xhdpi devices, you should generate the same resource in 150x150 for hdpi, 100x100 for mdpi, and 75x75 for ldpi devices.

Then, place the files in the appropriate drawable resource directory:
```
MyProject/
    res/
        drawable-xhdpi/
            awesomeimage.png
        drawable-hdpi/
            awesomeimage.png
        drawable-mdpi/
            awesomeimage.png
        drawable-ldpi/
            awesomeimage.png
```
Any time you reference @drawable/awesomeimage, the system selects the appropriate bitmap based on the screen's density.

## 4. Interacting with Other Apps
### 1. Sharing Simple Data
Just use an intent, see MainActivity.pickContact() and startNewActivity().

### 2. Sharing Files
