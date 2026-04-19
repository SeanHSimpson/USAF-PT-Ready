package com.ptready.app;

import android.os.Bundle;
import android.util.Log;
import com.getcapacitor.BridgeActivity;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends BridgeActivity {
    private static final String TAG = "PTReadyPush";
    private static final String BETA_TOPIC = "pt_ready_beta";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FirebaseMessaging.getInstance()
            .subscribeToTopic(BETA_TOPIC)
            .addOnCompleteListener(task -> {
                if (task.isSuccessful()) {
                    Log.i(TAG, "Subscribed to topic: " + BETA_TOPIC);
                } else {
                    Log.w(TAG, "Topic subscription failed", task.getException());
                }
            });
    }
}
