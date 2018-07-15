package @packageName@.client.android.ioc;

import @packageName@.client.android.@name.capitalize()@Application;
import @packageName@.client.core.impl.ioc.AppModule;
import @packageName@.client.core.impl.ioc.JavaModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        HomeActivityModule.class,
        AppModule.class,
        JavaModule.class
})
public interface @name.capitalize()@ApplicationComponent {
    void inject(@name.capitalize()@Application posPdiApplication);
}