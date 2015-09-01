package net.rafaeltoledo.daggeraa;

import android.app.Application;
import android.content.Context;

import net.rafaeltoledo.daggeraa.dagger.ApplicationModule;
import net.rafaeltoledo.daggeraa.dagger.DaggerApplicationComponent;
import net.rafaeltoledo.daggeraa.dagger.MyComponent;

import org.androidannotations.annotations.EApplication;

@EApplication
public class MyApp extends Application {

    private MyComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public MyComponent getComponent() {
        return component;
    }
}
