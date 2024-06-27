//package com.vvit.myapp;
import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends Activity {
private EditText phone, message;
private Button send;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
phone = findViewById(R.id.editPhoneNumber);
message = findViewById(R.id.editMessage);
send = findViewById(R.id.buttonSend);
send.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View v) {
String phoneNumber = phone.getText().toString();
String msg = message.getText().toString();
SmsManager sms = SmsManager.getDefault();
sms.sendTextMessage(phoneNumber,null,msg,null,null);
Toast.makeText(MainActivity.this, "Message Sent",
Toast.LENGTH_SHORT).show();
}
});
}
}

