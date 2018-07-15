package @packageName@.client.gwt.app;

import @packageName@.client.core.impl.ioc.AppModule;
import @packageName@.client.core.impl.ui.HomeDisplay;

import org.nibiru.ui.core.impl.ioc.CoreModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class,
        GwtModule.class,
        CoreModule.class,
        org.nibiru.ui.gwt.ioc.GwtModule.class,
        org.nibiru.async.gwt.ioc.GwtModule.class})
@Singleton
public interface Injector {
    HomeDisplay getHomeDisplay();
}
