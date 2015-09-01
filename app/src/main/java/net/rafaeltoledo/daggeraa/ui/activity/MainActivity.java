package net.rafaeltoledo.daggeraa.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import net.rafaeltoledo.daggeraa.MyApp;
import net.rafaeltoledo.daggeraa.R;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.App;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import javax.inject.Inject;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Inject
    RequestManager glide;

    @App
    MyApp app;

    @ViewById
    ImageView image;

    @AfterInject
    void afterInject() {
        app.getComponent().inject(this);
    }

    @AfterViews
    void afterViews() {
        glide.load("http://web.scott.k12.va.us/tshs/2012%20site/academics/business/mmproject/media/animations/keyboard2.gif").into(image);
    }
}
