package wergeld.sandbox;

import wergeld.sandbox.pictureframe.R;
import android.app.Activity;
import android.os.Bundle;

public class pictureframeActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}