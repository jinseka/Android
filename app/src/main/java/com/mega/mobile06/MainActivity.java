package com.mega.mobile06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button;                //a();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //부모클래스에 있는 메서드를 호출할 때 super클래스를 사용한다.
        //액티비의 기본틀 설정 , 제목넣고 , 기본색 설정
        setContentView(R.layout.activity_main);
        //a();

        button =findViewById(R.id.save);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //액티비티를 넘기려고 한다.
                //넘기는 데이터를 함께 보내려고 한다.
                Intent intent =new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name","nexttext");
                intent.putExtra("age","마음은20살");
                intent.putExtra("height","200");

                String [] hobby = {"놀기","자기","먹기"};
                intent.putExtra("hobby",hobby);

                ArrayList<String> subject = new ArrayList<>();
                subject.add("영어");
                subject.add("수학");
                subject.add("언어");
                subject.add("사회");
                subject.add("운동");
                intent.putExtra("subject",subject);
                startActivity(intent);
            }
        });

    }//oncreate
}//class