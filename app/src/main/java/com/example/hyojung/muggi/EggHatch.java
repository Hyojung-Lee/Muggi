package com.example.hyojung.muggi;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;




public class EggHatch extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egghatch);
        Animation floatingAnim = AnimationUtils.loadAnimation(this, R.anim.floating);
        Animation loop_alphaAnim = AnimationUtils.loadAnimation(this, R.anim.loop_alpha);
        ImageView egg = (ImageView)findViewById(R.id.egg);
        egg.startAnimation(floatingAnim);
        ImageView shadow = (ImageView)findViewById(R.id.shadow);
        shadow.startAnimation(loop_alphaAnim);

    }

}
