package com.sandro.sandro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button myBtn, myBtn1;
    String[] urls = new String[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBtn = findViewById(R.id.cricbuzz);
        myBtn1 = findViewById(R.id.espnsports);
        urls[0] = "https://wynk.in/music";
        urls[1] = "https://www.jiosaavn.com/";
        urls[2] = "https://www.jiosaavn.com/";
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra(" links ", urls[0]);
                startActivity(intent);
            }
        });
        myBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra(" links ", urls[1]);
                startActivity(intent);
            }
        });

    }
}