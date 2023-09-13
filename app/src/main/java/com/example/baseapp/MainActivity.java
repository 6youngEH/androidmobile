package com.example.baseapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnMsg;//버튼형 전역변수 선언


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //버튼 인플레이팅(객체화) 및 대입
        btnMsg = findViewById(R.id.btnMsg);

        //버튼 클릭 이벤트 처리 리스너 구현
        btnMsg.setOnClickListener(new View.OnClickListener() {

            //클릭리스너 인터페이스의 onClick 추상 메소드 구현
            @Override
            public void onClick(View view) {
                //toast 객체 생성 및 출력(method chaining)
                 Toast.makeText(MainActivity.this, "안녕~", Toast.LENGTH_SHORT).show();


            }
        });

    }
}