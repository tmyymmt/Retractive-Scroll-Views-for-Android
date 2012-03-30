Retractive Scroll Views for Android
======================
Android向けのライブラリです。
びよーんと伸びるHorizontalScrollViewです。
複数のビューのスクロールの同期もできます。

RetractiveHorizontalScrollView は android.widget.HorizontalScrollView を継承しています。
将来的には、ご要望次第で、android.widget.ScrollView を継承した RetractiveVerticalScrollViewも追加するかもしれません。

サンプル動画
--------

...

ダウンロード
------

### ver.0.1 ###

[ ![](https://github.com/images/modules/download/zip.png) ](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/zipball/0.1)
[ ![](https://github.com/images/modules/download/tar.png) ](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/zipball/0.1)

使い方
------

### びよーん ###

1. [RetractiveHorizontalScrollView][rhsv] を [android.widget.HorizontalScrollView][hsv] と同じように使います。

### 2つのRetractiveHorizontalScrollView][rhsv]を同期する ###

1. [RetractiveHorizontalScrollView][rhsv] を [android.widget.HorizontalScrollView][hsv] と同じように使います。
2. [RetractiveHorizontalScrollView#addSyncScrollView(RetractiveHorizontalScrollView syncScrollView)][rhsv2] を使って、ビューをもう一方のビューに追加します。

サンプルコード
--------

動画と同じサンプルコードです。

...

Javadoc
--------

詳細は [javadoc][rhsv] を視て下さい。
  
ライセンス
----------
Copyright &copy; 2012 [ Tomoya Yamamoto 山本智世 ![profile_image] ][aboutme]

Distributed under the [MIT License](http://www.opensource.org/licenses/mit-license.php "MIT License").  

連絡先
--------

[ Tomoya Yamamoto 山本智世 ![profile_image] ][aboutme] (tmyymmt+github@gmail.com)

参考情報
--------

他に以下のサイトも参考になると思います。

- [http://y-anz-m.blogspot.ca/2011/01/androidoverscroll.html](http://y-anz-m.blogspot.ca/2011/01/androidoverscroll.html)
- [http://d.hatena.ne.jp/hdk_embedded/20110102/1293906357](http://d.hatena.ne.jp/hdk_embedded/20110102/1293906357)
- [http://tomokey.blogspot.ca/2011/01/scrollview.html](http://tomokey.blogspot.ca/2011/01/scrollview.html)

[profile_image]: http://tmyymmt.mine.nu/profile/profile-sq_16.png "Profile Image"
[aboutme]: http://about.me/tmyymmt "about me"
[hsv]: http://developer.android.com/reference/android/widget/HorizontalScrollView.html
[rhsv]: http://tmyymmt.github.com/Retractive-Scroll-Views-for-Android/
[rhsv2]: http://tmyymmt.github.com/Retractive-Scroll-Views-for-Android/
