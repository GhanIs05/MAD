//package com.vvit.myapp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
// These are the global variables
EditText editName, editPassword, editAddress;
TextView result;
RadioGroup radioSexGender;
private RadioButton radioGenderButton;
Button buttonSubmit;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
editName = findViewById(R.id.editName);
editPassword = findViewById(R.id.editPassword);
editAddress = findViewById(R.id.editAddress);
radioSexGender = findViewById(R.id.radioGender);
result = findViewById(R.id.tvResult);
buttonSubmit = findViewById(R.id.buttonSubmit);
buttonSubmit.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
String name = editName.getText().toString();
String password = editPassword.getText().toString();
String address = editAddress.getText().toString();
int selectedId = radioSexGender.getCheckedRadioButtonId();
radioGenderButton = (RadioButton) findViewById(selectedId);
result.setText("Name:\t" + name + "\nPassword:\t" +
password + "\nAddress:\t" + address + "\nGender:\t" +
radioGenderButton.getText().toString());
}
});
}
}