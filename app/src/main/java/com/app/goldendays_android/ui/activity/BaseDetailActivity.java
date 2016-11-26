package com.app.goldendays_android.ui.activity;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.app.goldendays_android.R;
import com.app.goldendays_android.utils.TransitionHelper;

/**
 * Created by lgvalle on 12/09/15.
 */
public class BaseDetailActivity extends AppCompatActivity {
    public  static final String EXTRA_SAMPLE = "sample";
    public  static final String EXTRA_TYPE = "type";
    public static final int TYPE_PROGRAMMATICALLY = 0;
    public static final int TYPE_XML = 1;

    public  void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @SuppressWarnings("unchecked")public void transitionTo(Intent i) {
        final Pair<View, String>[] pairs = TransitionHelper.createSafeTransitionParticipants(this, true);
        ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(this, pairs);
        startActivity(i, transitionActivityOptions.toBundle());
    }
}
