package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import  com.example.activitylifecycle.R;

public class ActivityLifeTest extends AppCompatActivity {
    Button btnQuit;
    @Override
    protected void onCreate(Bundle b){
super.onCreate(b);
setContentView(R.layout.activity_lifecycle);
btnQuit=findViewById(R.id.btnQuit);
btnQuit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        finishAffinity();
    }
});
        Log.v("myTest","Activity created.");
}
@Override
protected void onStart(){
        super.onStart();
        Log.v("my test","Activity started");
}
@Override
    protected void onPause(){
        super.onPause();
        Log.v("my Test","Activity paused");
}
@Override
    protected void onResume(){
        super.onResume();
        Log.v("my Test","Activity resumed");
}
@Override
    protected void onRestart(){
        super.onRestart();
        Log.v("my Test","Activity Restart");
}
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v("my Test","Activity Destroy");
    }


}