package @packageName@.client.android.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import @packageName@.client.core.impl.ui.HomeDisplay;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class HomeActivity extends AppCompatActivity {
    @Inject
    HomeDisplay homeDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView((View) homeDisplay.asNative());
    }
}
