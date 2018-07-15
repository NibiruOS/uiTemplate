package @packageName@.client.gwt.app;

import com.google.gwt.core.client.GWT;
import @packageName@.client.core.impl.ui.UiMessages;
import @packageName@.client.gwt.ui.GwtUiMessages;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class GwtModule {
    @Provides
    public UiMessages getUiMessages() {
        return GWT.create(GwtUiMessages.class);
    }
}
