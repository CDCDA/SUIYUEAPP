package com.example.suiyue;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.RemoteActionCompatParcelizer;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class log_in extends AppCompatActivity {

    private EditText mtzhanghu;
    private Button mbtnTextView;
    private EditText mtmima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        mtzhanghu =(EditText) findViewById(R.id.zhanghu);
        mtmima =(EditText) findViewById(R.id.mima);
        mbtnTextView = (Button) findViewById(R.id.button);
        mbtnTextView.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               Toast.makeText(log_in.this,"登录成功",Toast.LENGTH_SHORT).show();
               //跳转到主页面
               Intent intent=new Intent(log_in.this,MainActivity.class);
               startActivity(intent);
           }
        });
    }
}
