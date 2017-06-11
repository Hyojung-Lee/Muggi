package com.example.hyojung.muggi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.view.animation.Animation;
import android.view.ViewAnimationUtils;

import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        Animation set_Anim = AnimationUtils.loadAnimation(this, R.anim.set);
        Animation transAnim = AnimationUtils.loadAnimation(this, R.anim.translate);
        Animation alphaAnim = AnimationUtils.loadAnimation(this, R.anim.delayed_alpha);
        Animation slide = AnimationUtils.loadAnimation(this, R.anim.slide);

        ImageView image=(ImageView) findViewById(R.id.text);
        image.startAnimation(set_Anim);

        ImageView qbg=(ImageView) findViewById(R.id.qbg);
        qbg.startAnimation(slide);

        ImageView text=(ImageView) findViewById(R.id.choosetext);
        text.startAnimation(alphaAnim);

        ImageButton spikey = (ImageButton)findViewById(R.id.spikeySelect);

        spikey.startAnimation(transAnim);

        ImageButton baldy = (ImageButton)findViewById(R.id.baldySelect);
        baldy.startAnimation(transAnim);

        ImageButton buggy = (ImageButton)findViewById(R.id.buggySelect);
        buggy.startAnimation(transAnim);

        spikey.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(ChooseActivity.this, EggSelected.class); // 두번째 액티비티를 실행하기 위한 인텐트
                startActivity(intent); // 두번째 액티비티를 실행합니다.
            }
        });
        baldy.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(ChooseActivity.this, EggSelected.class); // 두번째 액티비티를 실행하기 위한 인텐트
                startActivity(intent); // 두번째 액티비티를 실행합니다.
            }
        });
        buggy.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(ChooseActivity.this, EggSelected.class); // 두번째 액티비티를 실행하기 위한 인텐트
                startActivity(intent); // 두번째 액티비티를 실행합니다.
            }
        });
    }
}


