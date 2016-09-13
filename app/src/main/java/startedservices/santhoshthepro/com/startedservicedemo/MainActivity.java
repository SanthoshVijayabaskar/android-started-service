package startedservices.santhoshthepro.com.startedservicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnStartService,btnStopService,btnStartIntentService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartService=(Button)findViewById(R.id.btnStartService);
        btnStopService=(Button)findViewById(R.id.btnStopService);
        btnStartIntentService=(Button)findViewById(R.id.btnStartIntentService);

        btnStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,MyService.class);
                myIntent.putExtra("message","Welcome Regular Service");
                startService(myIntent);
            }
        });

        btnStopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,MyService.class);
                stopService(myIntent);

            }
        });

        btnStartIntentService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(MainActivity.this,MyIntentService.class);
                serviceIntent.putExtra("message","Welcome Intent Service");
                startService(serviceIntent);
            }
        });

    }
}
