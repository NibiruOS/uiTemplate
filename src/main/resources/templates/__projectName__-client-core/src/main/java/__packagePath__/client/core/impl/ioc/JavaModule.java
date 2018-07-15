package @packageName@.client.core.impl.ioc;

import @packageName@.client.core.impl.ui.UiMessages;

import dagger.Module;
import dagger.Provides;
import org.nibiru.ui.core.impl.i18n.MessageProvider;

@Module
public class JavaModule {
    @Provides
    public UiMessages uiMessages() {
        return new MessageProvider<>(UiMessages.class).get();
    }
}
