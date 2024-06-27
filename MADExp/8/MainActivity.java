//package com.vvit.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = findViewById(R.id.list_view);
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Dragon");
        list.add("Grapes");
        list.add("Mango – आम (Aam)");
        list.add("Grapes – अंगूर (Angoor)");
        list.add("Pineapple – अनानास (Ananas)");
        list.add("Watermelon – तरबूज (Tarbuj)");
        list.add("Papaya – पपीता (Papita)");
        list.add("Cherry");
        list.add("Jackfruit");
        list.add("Kiwi");
        list.add("Apricot");
        list.add("Coconut");
        list.add("Strawberry");
        list.add("Blueberry");
        list.add("Pomegranate");
        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                //Apple
                    Toast.makeText(MainActivity.this, "Apple", Toast.LENGTH_SHORT).show();
            }
                else if(i==1){
                    //Banana
                    Toast.makeText(MainActivity.this, "Banana", Toast.LENGTH_SHORT).show();
                }
                else if(i==2){
                    //orange
                    startActivity(new Intent(MainActivity.this, Orange.class));
                   //Toast.makeText(MainActivity.this, "Orange", Toast.LENGTH_SHORT).show();
                }
                else {
                    //Dragon
                    Toast.makeText(MainActivity.this, "Dragon", Toast.LENGTH_SHORT).show();
                }
        }
        });
        }
}
