package com.mega.mobile06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    EditText t1,t2;
    Button b6;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        b6=findViewById(R.id.b6);
        t1=findViewById(R.id.t1); //아이디
        t2=findViewById(R.id.t2); //비밀번호
        result=findViewById(R.id.result); //비밀번호
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id =t1.getText().toString();
                String pw =t2.getText().toString();
                Toast.makeText(getApplicationContext(),
                    "입력한 아이디는 "+id+"입력한 비밀번호는 "+pw+"",Toast.LENGTH_SHORT).show();

                String id2 = "root";
                String pw2 = "1234";

                if (id.equals(id2)&&pw.equals(pw2)){

                    result.setText("일치");
                    Intent intent =new Intent(getApplicationContext(),MainActivity5.class);
                    startActivity(intent);
                    t1.setText("");
                    t2.setText("");
                }else{
                    result.setText("불일치");
                    t1.setText("");
                    t2.setText("");

                }


            }
        });





    }//onCreate
}//main