package ir.lish.lishsdk;

import android.util.Log;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by macbook on 5/23/17.
 */

public class LishSDK {

    private static final String TAG = "LISH_SDK_LOG";
    public static void init() {

        new Thread(new Runnable() {
            @Override
            public void run() {

                doGetInit();
            }
        });

        Log.d(TAG, "Initialize sdk is called");
    }

    private static void doGetInit() {

        Log.d(TAG, "Do get Initialize is called");
        String url = "http://google.com";
        OkHttpClient client = new OkHttpClient();
        Request newRequest = new Request.Builder()
                .url(url)
                .build();

        try {

            Response response = client.newCall(newRequest).execute();
            Log.d(TAG, "Got the config response");
            Log.d(TAG, String.valueOf(response.body()));

        } catch (IOException e) {

            Log.d(TAG, "Failed to Get the config response");
            e.printStackTrace();
        }
    }

}
