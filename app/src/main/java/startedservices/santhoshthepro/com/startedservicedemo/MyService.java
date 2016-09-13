package startedservices.santhoshthepro.com.startedservicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

    private static final String TAG = MyService.class.getSimpleName();

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG,"Service onCreate()");
        Toast.makeText(getApplicationContext(),"Service Created",Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"Service onStartCommand()");
        Toast.makeText(getApplicationContext(),"Service Started",Toast.LENGTH_SHORT).show();

        String msg=intent.getStringExtra("message");
        Toast.makeText(getApplicationContext(),"Message from Activity: "+ msg,Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Service onDestroy()");
        Toast.makeText(getApplicationContext(),"Service Destroyed",Toast.LENGTH_SHORT).show();
    }
}
