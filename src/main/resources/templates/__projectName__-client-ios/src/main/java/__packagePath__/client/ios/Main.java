package @packageName@.client.ios;

import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;
import @packageName@.client.ios.app.DaggerInjector;

import apple.NSObject;
import apple.foundation.NSDictionary;
import apple.uikit.UIApplication;
import apple.uikit.UIView;
import apple.uikit.UIWindow;
import apple.uikit.c.UIKit;
import apple.uikit.protocol.UIApplicationDelegate;

public class Main extends NSObject implements UIApplicationDelegate {
    public static void main(String[] args) {
        UIKit.UIApplicationMain(0, null, null, Main.class.getName());
    }

    @Override
    public void applicationDidFinishLaunching(UIApplication application) {
    }

    @Selector("alloc")
    public static native Main alloc();

    protected Main(Pointer peer) {
        super(peer);
    }

    private UIWindow window;

    @Override
    public boolean applicationDidFinishLaunchingWithOptions(UIApplication application, NSDictionary launchOptions) {
        return true;
    }

    @Override
    public void setWindow(UIWindow value) {
        window = value;
        window.addSubview((UIView) DaggerInjector.create()
                .getHomeDisplay()
                .asNative());
    }

    @Override
    public UIWindow window() {
        return window;
    }
}
