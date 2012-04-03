package nu.mine.tmyymmt.android.widget.retractivehorizontalscrollviewexample;

import android.app.Activity;
import android.os.Bundle;

//import nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView;

/**
 * Simple Example for Retractive Scroll Views for Android.
 * 
 * This is a example for
 * nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView.
 * 
 * @see https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android
 * @author Tomoya Yamamoto <a
 *         href="mailto:tmyymmt+github@gmail.com">&lt;tmyymmt+
 *         github@gmail.com&gt;</a> <a
 *         href="http://about.me/tmyymmt">http://about.me/tmyymmt</a>
 */
public class RetractiveHorizontalScrollViewExampleActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // If you want to change the retractive width then you can change it by
        // this way.
        // RetractiveHorizontalScrollView scrollView =
        // (RetractiveHorizontalScrollView) findViewById(R.id.scroll_view);
        // scrollView.setRetractiveWidth(300);
    }
}
