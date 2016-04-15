package com.example.ted.simpleservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

  private static String TAG = "MyService";

  public MyService() {
  }

  @Override
  public void onCreate() {
    Log.d(TAG, "onCreate fired");
  }

  @Override
  public IBinder onBind(Intent intent) {
    // TODO: Return the communication channel to the service.
    // throw new UnsupportedOperationException("Not yet implemented");
    return null;
  }

  @Override
  public int onStartCommand(Intent intent, int flags, int startId) {
    // return super.onStartCommand(intent, flags, startId);
    Toast.makeText(this,"Starting the service", Toast.LENGTH_LONG).show();
    Log.d("MyService", "onStart hook method");
    //return START_STICKY;
    return super.onStartCommand(intent, flags, startId);
  }
}
