//package com.vvit.myapp;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
public class SecondActivity extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_second);
TextView tv = findViewById(R.id.textView2);
TextView tv1 = findViewById(R.id.textView3);
tv.setText(getIntent().getExtras().getString("name"));
tv1.setText(getIntent().getExtras().getString("place"));
}
}
