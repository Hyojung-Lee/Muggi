package com.example.hyojung.muggi;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;


public class EggPlay extends AppCompatActivity {
    /** Called when the activity is first created. */
    Egg egg = new Egg(10);
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eggplay);
        Animation floatingAnim = AnimationUtils.loadAnimation(this, R.anim.floating);
        Animation loop_scaleAnim = AnimationUtils.loadAnimation(this, R.anim.loop_scale);
        Animation loop_alphaAnim = AnimationUtils.loadAnimation(this, R.anim.loop_alpha);
        ImageView egg = (ImageView)findViewById(R.id.egg);
        egg.startAnimation(floatingAnim);

        ImageView shadow = (ImageView)findViewById(R.id.shadow);
        shadow.startAnimation(loop_alphaAnim);

        ImageButton start = (ImageButton)findViewById(R.id.hug);
        start.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
            }
        });
    }

}

