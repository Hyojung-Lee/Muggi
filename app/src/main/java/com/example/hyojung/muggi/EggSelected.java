package com.example.hyojung.muggi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.widget.ImageView;

public class EggSelected extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eggselected);
        Animation alphaAnim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation delayed_alphaAnim = AnimationUtils.loadAnimation(this, R.anim.delayed_alpha);
        Animation scaleAnim = AnimationUtils.loadAnimation(this, R.anim.scale);

        ImageView egg = (ImageView)findViewById(R.id.egg);
        egg.startAnimation(scaleAnim);

        ImageView text = (ImageView)findViewById(R.id.text);
        text.startAnimation(alphaAnim);

        ImageButton start = (ImageButton)findViewById(R.id.start);
        start.startAnimation(delayed_alphaAnim);
        start.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(EggSelected.this, EggPlay.class); // 두번째 액티비티를 실행하기 위한 인텐트
                startActivity(intent); // 두번째 액티비티를 실행합니다.
            }
        });

    }
}

