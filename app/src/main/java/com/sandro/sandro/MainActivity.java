package com.sandro.sandro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private Button myBtn, myBtn1,myBtn2,myBtn3,myBtn4,myBtn5;
    String[] urls = new String[50];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        myBtn = findViewById(R.id.jiosaavn);
        myBtn1 = findViewById(R.id.movierulzhd);
        myBtn2 = findViewById(R.id.movierulz);
        myBtn3 = findViewById(R.id.livescore);
        myBtn4 = findViewById(R.id.spoify);
        myBtn5 = findViewById(R.id.news);
        urls[0] = " https://www.jiosaavn.com/";
        urls[1] = "https://movierulzhd.site/";
        urls[2]="https://ww3.5movierulz.mg/";
        urls[3]="https://www.google.com/search?q=google+live+score+cricket&rlz=1C1CHBF_enIN977IN978&oq=google+live+score&aqs=chrome.1.69i57j0i20i263i512j0i512l7j0i20i263i512.12106j0j4&sourceid=chrome&ie=UTF-8#sie=lg;/g/11n1ntn76g;5;/m/021q23;mt;fp;1;;;";
        urls[4]="https://open.spotify.com/";
        urls[5]="https://www.inshorts.com/en/read";
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
        myBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra(" links ", urls[2]);
                startActivity(intent);
            }
        });
        myBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra(" links ", urls[3]);
                startActivity(intent);
            }
        });
        myBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra(" links ", urls[4]);
                startActivity(intent);
            }
        });
        myBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra(" links ", urls[5]);
                startActivity(intent);
            }
        });

    }
    private class Mywebclient extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }

    }

}