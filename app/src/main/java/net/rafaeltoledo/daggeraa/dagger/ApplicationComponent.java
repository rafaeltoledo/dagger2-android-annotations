package net.rafaeltoledo.daggeraa.dagger;

import net.rafaeltoledo.daggeraa.data.DataModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        DataModule.class
})
public interface ApplicationComponent extends MyComponent {
}
