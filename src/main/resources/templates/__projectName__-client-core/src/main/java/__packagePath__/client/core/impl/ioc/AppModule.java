package @packageName@.client.core.impl.ioc;

import org.nibiru.ui.core.api.ResourcesBasePath;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    @ResourcesBasePath
    public String resourcesBasePath() {
        return "@packagePath@/client/core/resources/";
    }
}
