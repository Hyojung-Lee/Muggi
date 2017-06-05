package com.example.hyojung.muggi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        ImageButton spikey = (ImageButton)findViewById(R.id.spikeySelect);
        ImageButton baldy = (ImageButton)findViewById(R.id.baldySelect);
        ImageButton buggy = (ImageButton)findViewById(R.id.buggySelect);

        spikey.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(ChooseActivity.this, EggSelected.class); // 두번째 액티비티를 실행하기 위한 인텐트
                startActivity(intent); // 두번째 액티비티를 실행합니다.
            }
        });
        baldy.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(ChooseActivity.this, BaldySelected.class); // 두번째 액티비티를 실행하기 위한 인텐트
                startActivity(intent); // 두번째 액티비티를 실행합니다.
            }
        });
        buggy.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(ChooseActivity.this, BuggySelected.class); // 두번째 액티비티를 실행하기 위한 인텐트
                startActivity(intent); // 두번째 액티비티를 실행합니다.
            }
        });
    }
}


