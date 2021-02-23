package com.example.componentsdemo;

import  android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;


public class MyServiceExample extends Service {
    MediaPlayer mp;
    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("not");
    }
    @Override
    public void onCreate(){
        super.onCreate();
        //audio file is inside(res/raw/audio.mp3)
        mp=MediaPlayer.create(this, R.raw.msg_tone);
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mp.start();
        return super.onStartCommand(intent,flags,startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
    }
}
