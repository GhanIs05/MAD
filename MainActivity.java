//package com.vvit.myapp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
// These are the global variables
EditText editName, editPassword;
Button buttonSubmit;
TextView result;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
editName = findViewById(R.id.editName);
editPassword = findViewById(R.id.editPassword);
result = findViewById(R.id.tvResult);
buttonSubmit = findViewById(R.id.buttonSubmit);
buttonSubmit.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
String name = editName.getText().toString();
String password = editPassword.getText().toString();
result.setText("Name:\t" + name + "\nPassword:\t" +
password);
}
});
}
}
