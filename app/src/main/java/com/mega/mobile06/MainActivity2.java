package com.mega.mobile06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent= getIntent();
        String name = intent.getStringExtra("name"); //string으로 넘어온 값을 받는다.
        String age = intent.getStringExtra("age"); //string으로 넘어온 값을 받는다.
        String height = intent.getStringExtra("height"); //string으로 넘어온 값을 받는다.
        ArrayList<String> subject=intent.getStringArrayListExtra("subject");

        Toast.makeText(getApplicationContext(),
                "받은 이름은 > "  + name+age+height +"\n"+subject,
                Toast.LENGTH_SHORT
                ).show();
    }
}