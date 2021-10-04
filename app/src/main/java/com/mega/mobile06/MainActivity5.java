package com.mega.mobile06;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.mega.mobile06.R.id.b8;

public class MainActivity5 extends AppCompatActivity {
    EditText t3,t4;
    ImageButton b8;
    Button b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    t3=findViewById(R.id.t3);
    t4=findViewById(R.id.t4);
    b7=findViewById(R.id.b7);
    b8=findViewById(R.id.b8);

    b7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String title = t3.getText().toString();
            String content = t4.getText().toString();

            try {
                FileOutputStream file =openFileOutput(  title + ".txt",MODE_PRIVATE);
                String content1 = content;
                file.write(content1.getBytes());
                file.close();
                t3.setText("");
                t4.setText("");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                Log.d("","파일이 존재하지 않습니다.");
            } catch (IOException e) {
                e.printStackTrace();
                Log.d("","파일을 읽고 쓰는 중에 에러가 발생하였습니다.");
            }catch (Exception e) {
                e.printStackTrace();
                Log.d("","에러가 발생하였습니다.");
            }

            String total =t3 +"Wn"+t4 ;
        }
    });

    }
}