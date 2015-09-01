package net.rafaeltoledo.daggeraa.data;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Provides @Singleton
    public RequestManager provideGlide(Context context) {
        return Glide.with(context);
    }
}
