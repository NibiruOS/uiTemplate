package @packageName@.client.android.ioc;

import @packageName@.client.android.ui.HomeActivity;

import org.nibiru.ui.android.ioc.AndroidModule;
import org.nibiru.ui.core.impl.ioc.CoreModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {
        ContextModule.class,
        CoreModule.class,
        AndroidModule.class,
        org.nibiru.async.android.ioc.AndroidModule.class
})
public interface HomeActivitySubcomponent
        extends AndroidInjector<HomeActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeActivity> {
    }
}