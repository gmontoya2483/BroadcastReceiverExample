package com.example.montoya.broadcastreceiverexamples.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by montoya on 09.08.2016.
 */
public class CustomReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Custom Broadcast received",Toast.LENGTH_LONG).show();
    }
}
