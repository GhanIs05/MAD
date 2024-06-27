//package com.vvit.myapp;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
public class MainActivity extends AppCompatActivity {
private static final String TAG = "mytag";
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
MenuInflater inflater = getMenuInflater();
inflater.inflate(R.menu.main_menu, menu);
return true;
}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
switch (item.getItemId()) {
case R.id.aboutMenu:
Toast.makeText(this, "Clicked on About!",
Toast.LENGTH_SHORT).show();
Log.d(TAG, "Clicked on About!");
// Code for About goes here
return true;
case R.id.helpMenu:
Toast.makeText(this, "Clicked on Help!",
Toast.LENGTH_SHORT).show();
Log.d(TAG, "Clicked on Help!");
// Code for Help goes here
return true;
case R.id.signOutMenu:
Toast.makeText(this, "Clicked on Sign out!",
Toast.LENGTH_SHORT).show();
Log.d(TAG, "User signed out");
MOBILE APPLICATION DEVELOPMENT | 35
// SignOut method call goes here
return true;
default:
return super.onOptionsItemSelected(item);
}
}
}