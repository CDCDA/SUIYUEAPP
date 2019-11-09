package com.example.suiyue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class UserInfoActivity extends AppCompatActivity {
    private ImageView mbtnImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        mbtnImageView = (ImageView) findViewById(R.id.iv_head_icon);
        mbtnImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(UserInfoActivity.this,dialog_select_photo.class);
                startActivity(intent);
            }
        });
    }


}
