//package com.vvit.myapp;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
final EditText et = findViewById(R.id.editName);
final EditText et1 = findViewById(R.id.editPlace);
Button send = findViewById(R.id.buttonNext);
send.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View arg0) {
String s = et.getText().toString();
String s1 = et1.getText().toString();
Intent it = new Intent(MainActivity.this,
SecondActivity.class);
it.putExtra("name", s);
it.putExtra("place", s1);
startActivity(it);
}
});
}
}
