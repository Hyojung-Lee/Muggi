package com.example.hyojung.muggi;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.widget.TextView;
import android.os.Handler;
import android.os.Message;


public class EggPlay extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        class Egg{
            int warmth=10;
            int age=0;
            int getWarmth(){return warmth;}
            void setWarmth(int warmth){this.warmth=warmth;}
            int getAge(){return age;}
            void setAge(int age){this.age=age;}
            Egg(int warmth, int age){
                this.warmth=warmth;
                this.age=age;
            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eggplay);
        Animation floatingAnim = AnimationUtils.loadAnimation(this, R.anim.floating);
        Animation disappear = AnimationUtils.loadAnimation(this, R.anim.alpha_disappear);
        Animation delayed_alphaAnim = AnimationUtils.loadAnimation(this, R.anim.delayed_alpha);
        Animation loop_alphaAnim = AnimationUtils.loadAnimation(this, R.anim.loop_alpha);
        ImageView egg = (ImageView)findViewById(R.id.egg);
        egg.startAnimation(floatingAnim);
        ImageView shadow = (ImageView)findViewById(R.id.shadow);
        shadow.startAnimation(loop_alphaAnim);

        ImageButton start = (ImageButton)findViewById(R.id.hug);
        start.startAnimation(delayed_alphaAnim);
        start.setOnClickListener(new ImageButton.OnClickListener() {
            Egg egg1 = new Egg(10,0);

            Handler mHandler = new Handler() {
                public void handleMessage(Message msg) {
                    egg1.setWarmth(egg1.getWarmth()-1);
                    mHandler.sendEmptyMessageDelayed(0,1000);
                }
            };
            TextView warmth_val = (TextView)findViewById(R.id.warmth_value);

            public void onClick(View v) {
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(100);
                egg1.setWarmth(egg1.getWarmth()+1);
                warmth_val.setText(""+egg1.getWarmth());
            }

        });
        ImageView eggtext = (ImageView)findViewById(R.id.eggtext);
        eggtext.startAnimation(disappear);
        eggtext.setVisibility(View.INVISIBLE);
    }
}

