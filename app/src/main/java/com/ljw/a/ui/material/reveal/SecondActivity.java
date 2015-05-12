package com.ljw.a.ui.material.reveal;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.ljw.a.R;
import com.ljw.a.ui.material.reveal.revealanimator.RevealMiddleware;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        RevealMiddleware middleware = RevealMiddleware.getInstance();

        middleware.prepareAnimation(SecondActivity.this);
        middleware.animate();
    }


}
