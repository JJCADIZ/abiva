package com.example.jjcadiz.appbiva;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Window;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;


public class IntroActivity extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);


        // Note here that we DO NOT use setContentView();

        // Add your slide fragments here.
        // AppIntro will automatically generate the dots indicator and buttons.
        //addSlide(First_Fragment);
        addSlide(AppIntroFragment.newInstance("AppBiva", "Abiva Application", R.drawable.abiva2, Color.parseColor("#2c3e50")));
        addSlide(AppIntroFragment.newInstance("For Parents:", "A Safe and Child-Friendly App", R.drawable.family, Color.parseColor("#9b59b6")));
        addSlide(AppIntroFragment.newInstance("For Students: ", "Fun, Educational and Intuitive", R.drawable.student, Color.parseColor("#e74c3c")));
        addSlide(AppIntroFragment.newInstance("For Teachers: ", "Interactive Teaching and Exercises", R.drawable.teacher, Color.parseColor("#e67e22")));
        addSlide(AppIntroFragment.newInstance("Learning Awaits! ", "Get started and Press Done", R.drawable.learning, Color.parseColor("#34495e")));

        // OPTIONAL METHODS
        // Override bar/separator color.
        setSeparatorColor(Color.parseColor("#c2c9ce"));
        showStatusBar(false);

        // Hide Skip/Done button.
        showSkipButton(true);
        setProgressButtonEnabled(false);
        showDoneButton(true);

        //Animations
        setFadeAnimation();
    }
    /*
    public void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    */
    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}