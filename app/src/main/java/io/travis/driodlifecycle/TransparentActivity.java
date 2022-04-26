package io.travis.driodlifecycle;

import android.os.Bundle;

public class TransparentActivity extends LoggingActivity {

    public TransparentActivity() {
        setActivityName("TransparentActivity");}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent);
    }

}