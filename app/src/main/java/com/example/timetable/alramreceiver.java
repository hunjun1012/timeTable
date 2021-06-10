package com.example.timetable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

//https://sh-itstory.tistory.com/64

public class alramreceiver extends BroadcastReceiver {

    Context context;

    @Override
    public void onReceive(Context context, Intent intent){

        this.context = context;


        String get_yout_string = intent.getExtras().getString("extra");

        Intent service_intent = new Intent(context, ringplay.class);


        service_intent.putExtra("state",get_yout_string);


        if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O){
            this.context.startForegroundService(service_intent);
        }
        else{
            this.context.startService(service_intent);
        }

    }
}
