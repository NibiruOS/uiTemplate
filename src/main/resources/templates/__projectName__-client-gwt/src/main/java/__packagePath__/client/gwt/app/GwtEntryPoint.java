package @packageName@.client.gwt.app;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class GwtEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        RootPanel.get()
                .add((Widget) DaggerInjector.create()
                        .getHomeDisplay()
                        .asNative());

    }
}
