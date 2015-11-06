package com.example.moataz.hellouser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by moataz on 10/27/2015.
 */
public class SecondActivity extends Activity {
    public TextView txt ;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        Intent intent = getIntent();
        String data  = intent.getStringExtra("Name");
        txt = (TextView) findViewById(R.id.txtName);
        txt.setText("Hello "+data);
    }
}
