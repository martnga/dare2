package com.nganga.dare2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by nganga on 7/29/15.
 */
public class Intro extends AppIntro {
    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(AppIntroFragment.newInstance("Hello!", "Kenya", R.drawable.first, R.color.hint_foreground_material_light));
        addSlide(AppIntroFragment.newInstance("Did You Know?", "This is the only country with Fluiks", R.drawable.second, R.color.hint_foreground_material_light));
        addSlide(AppIntroFragment.newInstance("Welcome!", "Enjoy the Beauty", R.drawable.third, R.color.hint_foreground_material_light));

    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, Nairobi.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed() {
        loadMainActivity();

    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
    }

    public void getStarted(View v){
        loadMainActivity();
    }
}
