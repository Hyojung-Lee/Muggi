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
import android.os.Looper;
import java.util.Timer;
import java.util.TimerTask;



public class EggPlay extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        class Egg{
            int click=0;
            int warmth=100;
            int age=0;
            int times=0;
            int next=0;
            int getWarmth(){return warmth;}
            void setWarmth(int warmth){this.warmth=warmth;}
            int getAge(){return age;}
            void setAge(int age){this.age=age;}

            Egg(int warmth, int age){
                this.warmth=warmth;
                this.age=age;

            }
            Timer timer = new Timer();
            TimerTask warmthTask = new TimerTask(){
                public void run(){
                    warmth = warmth-1;
                }
            };
            TimerTask ageTask = new TimerTask() {
                public void run() {
                    age = age+1;
                }
            };

            Handler mHandler = new Handler(){
                public void handleMessage(Message msg){
                    times++;
                    TextView warmth_val = (TextView)findViewById(R.id.warmth_value);
                    warmth_val.setText(String.valueOf(warmth));
                    mHandler.sendEmptyMessageDelayed(0, 100);       // 타이머에따라 위의 과정을 반복함  cf) 1000=1초
                }
            };
            public int getNext(int next){
                if(warmth<=350 && warmth>=250){this.next=1;}
                else
                    return 0;
                }

            public void start(){
                if(click==0) {
                    timer.scheduleAtFixedRate(warmthTask, 5, 5);
                    timer.scheduleAtFixedRate(ageTask, 200000, 200000);
                    mHandler.sendEmptyMessage(0);
                    click++;
                }
                else
                    return;
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

            Egg egg1 = new Egg(100,0);

            public void onClick(View v) {
                egg1.start();
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(50);
                egg1.setWarmth(egg1.getWarmth()+50);
            }
        });

        ImageView eggtext = (ImageView)findViewById(R.id.eggtext);
        eggtext.startAnimation(disappear);
        eggtext.setVisibility(View.INVISIBLE);
    }

}
