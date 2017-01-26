# Android Icon Resizer

A simple icon resizer Tool for Android Developers
--------------

I created this project because I'm really frustated resizing my android icon resoures, 
There's actually <a href="https://resizeappicon.com/">this</a> web-based icon resizer, but I spend a lot of time renaming them one by one and put them in their correct folder.

So I created this **Android Icon Resier** tool to be able to

- Automatically resize icon image to android drawables (ldpi, mdpi, tvdpi, hdpi, xhdpi, xxhdpi, xxxhdpi)
- Automatically create res folder, so you just need to move res folder to your android project
- Create drawable folder, so you don't have to create them one by one
- Preverve image name, so you don't have to rename them one by one
- Preserve the image format (png)
- Shortcut support
- Automatically open explorer/finder on save finishes (so you can easily move res folder to your android project directory)

Current version : *0.1*

And here is the [changelog](https://github.com/fadeltd/AndroidIconResizer/wiki/Changelog)

If you use this tool, don't hesitate and leave me a message.

## Upcoming pathc
 - [ ] Drag and Drop & Multiple Image
 - [ ] iOS Icon Size
 - [ ] Select output densities (ldpi, mdpi, tvdpi, hdpi, xhdpi, xxhdpi, xxxhdpi)
 - [ ] Select output directory (mipmap or drawable)
 - [ ] Save at res directory and overwrite file

## How to Use
 ![First Window](/screenshots/1.png)
 ![Browse File](/screenshots/2.png)
 ![Open File](/screenshots/3.png)
 ![Save File](/screenshots/4.png)
 ![Save Completed](/screenshots/5.png)
 ![Open Explorer](/screenshots/6.png)
 
## Reference
 * Image resized using imgscalr - Java Image-Scaling Library - http://www.thebuzzmedia.com/software/imgscalr-java-image-scaling-library/
 * The library use an optimized incremental scaling algorithm proposed by **Chris Campbell** - http://today.java.net/pub/a/today/2007/04/03/perils-of-image-getscaledinstance.html
 
## Contributors
 * fadeltd

*If you want to contribute, feel free to commit changes.*

If you just want to download the executable jar, click <b><a href="https://github.com/fadeltd/AndroidIconResizer/raw/master/dist/AndroidIconResizer.jar">here</a></b>
To be able to run this you need Java in your Operating System, and you need to download the libs folder as well

I hope it'll be as useful to you as it is useful to me. If you like it, you can donate to me here.
<a href='paypal.me/NerdStoreID'><img alt='Click here to support to: Android Icon Resizer' src='https://www.paypalobjects.com/en_US/i/btn/btn_donate_SM.gif' ></a>
