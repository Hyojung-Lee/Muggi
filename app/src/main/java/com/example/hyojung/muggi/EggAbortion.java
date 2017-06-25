package com.example.hyojung.muggi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.widget.ImageView;

public class EggAbortion extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eggabortion);
        Animation falling = AnimationUtils.loadAnimation(this, R.anim.fall);
        Animation delayed_alphaAnim = AnimationUtils.loadAnimation(this, R.anim.delayed_alpha);
        Animation alphaAnim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        ImageView egg = (ImageView)findViewById(R.id.egg);
        egg.startAnimation(falling);
        ImageButton restart = (ImageButton)findViewById(R.id.restart);
        ImageView fail = (ImageView)findViewById(R.id.fail);
        fail.startAnimation(delayed_alphaAnim);
        ImageView text = (ImageView)findViewById(R.id.text);
        text.startAnimation(delayed_alphaAnim);
        ImageView dark = (ImageView)findViewById(R.id.dark);
        dark.startAnimation(alphaAnim);
        restart.startAnimation(delayed_alphaAnim);
        restart.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(EggAbortion.this, ChooseActivity.class); // 두번째 액티비티를 실행하기 위한 인텐트
                startActivity(intent); // 두번째 액티비티를 실행
            }
        });
        egg.setVisibility(View.INVISIBLE);
    }
}

