package @packageName@.client.ios.app;

import @packageName@.client.core.impl.ioc.AppModule;
import @packageName@.client.core.impl.ioc.JavaModule;
import @packageName@.client.core.impl.ui.HomeDisplay;

import dagger.Component;
import org.nibiru.ui.core.impl.ioc.CoreModule;

import javax.inject.Singleton;

@Component(modules = {AppModule.class,
        JavaModule.class,
        CoreModule.class,
        org.nibiru.ui.ios.ioc.IOSModule.class,
        org.nibiru.async.ios.ioc.IOSModule.class})
@Singleton
public interface Injector {
    HomeDisplay getHomeDisplay();
}
