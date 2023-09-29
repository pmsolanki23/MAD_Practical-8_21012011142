package com.example.mad_practical_8_21012011142

import android.app.AlarmManager
import android.app.PendingIntent
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import java.text.SimpleDateFormat
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun setAlarm(militime: Long, action: String) {
        val intentAlarm = Intent(applicationContext, MyAlarmBroadcastReceiver::class.java)
        intentAlarm.putExtra(MyAlarmBroadcastReceiver.ALARMKEY, action)
        val pendingintent = PendingIntent.getBroadcast(
            applicationContext,
            4345,
            intentAlarm,
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )
        val manager = getSystemService(ALARM_SERVICE) as AlarmManager
        if (action == MyAlarmBroadcastReceiver.ALARMSTART) {
            manager.setExact(AlarmManager.RTC_WAKEUP, militime, pendingintent)
        } else if (action == MyAlarmBroadcastReceiver.ALARMSTOP) {
            manager.cancel(pendingintent)
            sendBroadcast(intentAlarm)


        }
    }
}