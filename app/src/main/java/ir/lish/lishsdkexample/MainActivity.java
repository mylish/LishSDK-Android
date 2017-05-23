package ir.lish.lishsdkexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.lish.lishsdk.LishSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LishSDK.init();
    }
}
