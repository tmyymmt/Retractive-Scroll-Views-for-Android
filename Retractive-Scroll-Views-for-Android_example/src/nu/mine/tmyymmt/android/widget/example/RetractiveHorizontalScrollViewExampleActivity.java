package nu.mine.tmyymmt.android.widget.example;

import nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView;
import android.app.Activity;
import android.os.Bundle;

/**
 * Simple Example for Retractive Scroll Views for Android.
 * 
 * This is a example for
 * nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView.
 * 
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

        RetractiveHorizontalScrollView scrollView = (RetractiveHorizontalScrollView) findViewById(R.id.scroll_view);
        scrollView.setRetractiveWidth(getResources().getDimensionPixelSize(R.dimen.retractive_width));
    }
}
