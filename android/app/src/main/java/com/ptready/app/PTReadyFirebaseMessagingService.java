package com.ptready.app;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

public class PTReadyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "PTReadyPush";
    private static final String BETA_TOPIC = "pt_ready_beta";

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        Log.i(TAG, "FCM token refreshed");
        subscribeToBetaTopic();
    }

    private void subscribeToBetaTopic() {
        FirebaseMessaging.getInstance()
            .subscribeToTopic(BETA_TOPIC)
            .addOnCompleteListener(task -> {
                if (task.isSuccessful()) {
                    Log.i(TAG, "Service subscribed to topic: " + BETA_TOPIC);
                } else {
                    Log.w(TAG, "Service topic subscription failed", task.getException());
                }
            });
    }
}
