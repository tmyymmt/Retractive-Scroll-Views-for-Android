package nu.mine.tmyymmt.android.widget.retractivehorizontalscrollviewexamplesync;

import nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView;
import android.app.Activity;
import android.os.Bundle;

/**
 * Simple Example for Retractive Scroll Views for Android.
 * 
 * This is a example for
 * nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView about sync.
 * 
 * @see nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView
 * 
 * @author Tomoya Yamamoto <a
 *         href="mailto:tmyymmt+github@gmail.com">&lt;tmyymmt+
 *         github@gmail.com&gt;</a> <a
 *         href="http://about.me/tmyymmt">http://about.me/tmyymmt</a>
 */
public class RetractiveHorizontalScrollViewExampleSyncActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

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
    }
}
