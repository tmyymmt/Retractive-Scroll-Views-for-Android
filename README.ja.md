[English](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android)

Retractive Scroll Views for Android
======================

Android向けのライブラリです。
端までスクロースした時にびよーんと伸びるHorizontalScrollViewです。
複数のビューのスクロールの同期もできます。

RetractiveHorizontalScrollView は android.widget.HorizontalScrollView を継承しています。
将来的には、ご要望次第で、android.widget.ScrollView を継承した RetractiveVerticalScrollViewも追加するかもしれません。

サンプル動画
--------

### びよーん ###


### 複数のRetractiveHorizontalScrollViewを同期する ###


ダウンロード
------

### ver.0.1 ###

[ ![](https://github.com/images/modules/download/zip.png) ](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/zipball/0.1)
[ ![](https://github.com/images/modules/download/tar.png) ](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/zipball/0.1)

使い方
------

### びよーん ###

このようなレイアウトを作成し、[RetractiveHorizontalScrollView][rhsv]を[android.widget.HorizontalScrollView][hsv]と同様に使用すればOKです。具体例は[こちら][ex1]。

	<nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView>
	  <LinearLayout>
	    <TextView/> <!-- left side -->
	    <TextView/> <!-- main content -->
	    <TextView/> <!-- right side -->
	  </LinearLayout>
	</nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView>

### 複数のRetractiveHorizontalScrollViewを同期する ###

同期したい[RetractiveHorizontalScrollView][rhsv]を[RetractiveHorizontalScrollView#addSyncScrollView(RetractiveHorizontalScrollView syncScrollView)][rhsv]で追加します。具体例は[こちら][ex2]。

	RetractiveHorizontalScrollView scrollView1 = (RetractiveHorizontalScrollView) findViewById(R.id.scroll_view);
	RetractiveHorizontalScrollView scrollView2 = (RetractiveHorizontalScrollView) findViewById(R.id.scroll_view2);
	RetractiveHorizontalScrollView scrollView3 = (RetractiveHorizontalScrollView) findViewById(R.id.scroll_view3);
	
	// add scroll views which you want to sync with scrollView1.
	scrollView1.addSyncScrollView(scrollView2);
	scrollView1.addSyncScrollView(scrollView3);
	
	// add scroll views which you want to sync with scrollView2.
	scrollView2.addSyncScrollView(scrollView1);
	scrollView2.addSyncScrollView(scrollView3);
	
	// add scroll views which you want to sync with scrollView3.
	scrollView3.addSyncScrollView(scrollView1);
	scrollView3.addSyncScrollView(scrollView2);

サンプルコード
--------

上の動画と同じサンプルコードです。

Retractive-Scroll-Views-for-Android_example is [here][ex1].

Retractive-Scroll-Views-for-Android_example_sync is [here][ex2].

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
[rhsv]: http://tmyymmt.github.com/Retractive-Scroll-Views-for-Android/index.html?nu/mine/tmyymmt/android/widget/RetractiveHorizontalScrollView.html
[ex1]: https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/blob/master/Retractive-Scroll-Views-for-Android_example/
[ex2]: https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/blob/master/Retractive-Scroll-Views-for-Android_example_sync/
