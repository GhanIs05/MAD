//package com.vvit.myapp;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public class FirstFragment extends Fragment {
private TextView textView;
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
}
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
Bundle savedInstanceState) {
// Inflate the layout for this fragment
View view = inflater.inflate(R.layout.fragment_first, container,
false);
}
textView = view.findViewById(R.id.fragment_view1);
textView.setText("First Fragment");
return view;
}
