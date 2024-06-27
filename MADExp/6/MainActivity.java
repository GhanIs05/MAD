//package com.vvit.myapp;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends Activity {
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
final Fragment first = new FirstFragment();
final Fragment second = new SecondFragment();
findViewById(R.id.fragment1).setOnClickListener(new
View.OnClickListener() {
@Override
public void onClick(View v) {
getSupportFragmentManager().beginTransaction().replace(R.id.layout,first)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();
}
});
findViewById(R.id.fragment2).setOnClickListener(new
View.OnClickListener() {
@Override
public void onClick(View v) {
getSupportFragmentManager().beginTransaction().replace(R.id.layout,first)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();
}
});
}
}
