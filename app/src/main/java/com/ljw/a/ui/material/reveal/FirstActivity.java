package com.ljw.a.ui.material.reveal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.ljw.a.R;
import com.ljw.a.ui.material.reveal.revealanimator.RevealMiddleware;

/**
 * Created by LJW on 15/5/12.
 */
public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test_first);

        findViewById(R.id.ll_test_f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {


        switch (ev.getAction()) {
            case MotionEvent.ACTION_UP:
                float centerX = ev.getX();
                float centerY = ev.getY();

                RevealMiddleware middleware = RevealMiddleware.getInstance();
                middleware.prepare(FirstActivity.this, centerX,centerY);

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;
        }

        return super.dispatchTouchEvent(ev);
    }
}
