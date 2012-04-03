[日本語](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/blob/master/README.ja.md)

Retractive Scroll Views for Android
======================

This is a library for Android.
This is a retractable HorizontalScrollView.
You can also sync scrolling in views.

RetractiveHorizontalScrollView extends android.widget.HorizontalScrollView.
In the future, I might add RetractiveVerticalScrollView extends android.widget.ScrollView, if you want to get it.

Sample movie
--------

...

Download
------

### ver.0.1 ###

[ ![](https://github.com/images/modules/download/zip.png) ](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/zipball/0.1)
[ ![](https://github.com/images/modules/download/tar.png) ](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/zipball/0.1)

How to use
------

### How to retract a view ###

1. Create layout as this format. Full version of res/layout/main.xml is [here](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/blob/master/Retractive-Scroll-Views-for-Android_example/res/layout/main.xml).

     <nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView1>
       <LinearLayout>
         <TextView />
         <TextView android:id="@+id/child_content" />
         <TextView />
       </LinearLayout>
     </nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView>

	     <nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView2>
	       <LinearLayout>
	         <TextView />
	         <TextView android:id="@+id/child_content" />
	         <TextView />
	       </LinearLayout>
	     </nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView>

<pre><code>
     <nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView>
       <LinearLayout>
         <TextView />
         <TextView android:id="@+id/child_content" />
         <TextView />
       </LinearLayout>
     </nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView>
</code></pre>

2. Use [RetractiveHorizontalScrollView][rhsv] as [android.widget.HorizontalScrollView][hsv].

### How to sync two RetractiveHorizontalScrollViews ###

1. Create layout as this format. Full version of res/layout/main.xml is [here](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/blob/master/Retractive-Scroll-Views-for-Android_example/res/layout/main.xml).

<script src="https://gist.github.com/2288618.js"> </script>

2. Use [RetractiveHorizontalScrollView][rhsv] as [android.widget.HorizontalScrollView][hsv].

3. Add a view which you want to sync to another view by [RetractiveHorizontalScrollView#addSyncScrollView(RetractiveHorizontalScrollView syncScrollView)][rhsv2].

Sample code
--------

This is a sample code as sample movie.

...

Javadoc
--------

Please see detail at [javadoc][rhsv].
  
License
----------
Copyright &copy; 2012 [ Tomoya Yamamoto 山本智世 ![profile_image] ][aboutme]

Distributed under the [MIT License](http://www.opensource.org/licenses/mit-license.php "MIT License").  

Contact
--------

[ Tomoya Yamamoto 山本智世 ![profile_image] ][aboutme] (tmyymmt+github@gmail.com)

Reference Information
--------

You can see good ideas for about this kind of thing in Japanese.

- [http://y-anz-m.blogspot.ca/2011/01/androidoverscroll.html](http://y-anz-m.blogspot.ca/2011/01/androidoverscroll.html)
- [http://d.hatena.ne.jp/hdk_embedded/20110102/1293906357](http://d.hatena.ne.jp/hdk_embedded/20110102/1293906357)
- [http://tomokey.blogspot.ca/2011/01/scrollview.html](http://tomokey.blogspot.ca/2011/01/scrollview.html)

[profile_image]: http://tmyymmt.mine.nu/profile/profile-sq_16.png "Profile Image"
[aboutme]: http://about.me/tmyymmt "about me"
[hsv]: http://developer.android.com/reference/android/widget/HorizontalScrollView.html
[rhsv]: http://tmyymmt.github.com/Retractive-Scroll-Views-for-Android/
[rhsv2]: http://tmyymmt.github.com/Retractive-Scroll-Views-for-Android/
