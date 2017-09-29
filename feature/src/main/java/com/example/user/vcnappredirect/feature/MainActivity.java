package com.example.user.vcnappredirect.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url = "http://www.streetmessenger.io/";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }
    }
}
