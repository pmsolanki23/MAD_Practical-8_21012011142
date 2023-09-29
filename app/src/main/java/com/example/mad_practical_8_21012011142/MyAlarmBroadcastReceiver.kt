package com.example.mad_practical_8_21012011142

import android.app.IntentService
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyAlarmBroadcastReceiver : BroadcastReceiver() {
    companion object{
        val ALARMKEY="key"
        val ALARMSTART="start"
        val ALARMSTOP="stop"

}
    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
       val data =intent.getStringExtra(ALARMKEY)
        val IntentService=Intent(context,Alarmservice::class.java)
        if (data== ALARMSTART){
            context.startService(IntentService)
        }
        else(context.startService(IntentService))
    }
}