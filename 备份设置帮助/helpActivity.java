package com.example.suiyue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class helpActivity extends AppCompatActivity {
    private Button mbtnButton1;
    private Button mbtnButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        mbtnButton1 = (Button) findViewById(R.id.swh_2);
        mbtnButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(helpActivity.this,gongnengjieshaoActivity.class);
                startActivity(intent);
            }
        });
        mbtnButton2 = (Button) findViewById(R.id.swh_3);
        mbtnButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(helpActivity.this,yijianfankuiActivity.class);
                startActivity(intent);
            }
        });
    }
}
