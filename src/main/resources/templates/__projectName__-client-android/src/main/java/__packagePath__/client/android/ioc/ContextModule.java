package @packageName@.client.android.ioc;

import android.content.Context;

import @packageName@.client.android.ui.HomeActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    @Provides
    public Context provideContext(HomeActivity context) {
        return context;
    }
}
