package com.sgt7.bazinga;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Zing extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Nothing too see here yet, not even dreams of Electric Sheep");
        setContentView(tv);
    }
}

