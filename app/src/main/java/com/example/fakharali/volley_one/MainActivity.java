package com.example.fakharali.volley_one;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ExpandableListView exlist;
    Expandable_list expandable_list;
    //TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exlist=findViewById(R.id.exlist);

       // txtView=findViewById(R.id.txtView);
        expandable_list=new Expandable_list(MainActivity.this);
        exlist.setAdapter(expandable_list);
    }
}
