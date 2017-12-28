package com.example.aaa.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private Contacts[]contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    for (int a =0; a<1000; a++)
    {
        contact[a]=new Contacts("Name"+a,"phone"+a);
    }

        ListView lv= (ListView) findViewById(R.id.lv1);

    }
}
