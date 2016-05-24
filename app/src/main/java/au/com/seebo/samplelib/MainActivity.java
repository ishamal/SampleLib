package au.com.seebo.samplelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import au.com.seebo.mylibrary.MyLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = new MyLib(this);
        setContentView(v);
        //setContentView(R.layout.activity_main);
    }
}
