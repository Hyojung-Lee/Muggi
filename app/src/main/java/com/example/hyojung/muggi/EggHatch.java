package com.example.hyojung.muggi;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.view.View;




public class EggHatch extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egghatch);
        Animation rotatingAnim = AnimationUtils.loadAnimation(this, R.anim.rotate);
        Animation sup = AnimationUtils.loadAnimation(this, R.anim.suprise_alpha);
        Animation dis = AnimationUtils.loadAnimation(this, R.anim.suprise_dis);
        Animation loop_alphaAnim = AnimationUtils.loadAnimation(this, R.anim.loop_alpha);
        ImageView egg = (ImageView)findViewById(R.id.egg);
        ImageView bg = (ImageView)findViewById(R.id.bg);
        egg.startAnimation(rotatingAnim);
        ImageView con = (ImageView)findViewById(R.id.confetti);
        ImageView born = (ImageView)findViewById(R.id.born);
        con.startAnimation(sup);
        born.startAnimation(sup);
        bg.startAnimation(dis);


        egg.setVisibility(View.INVISIBLE);
        bg.setVisibility(View.INVISIBLE);
    }

}
