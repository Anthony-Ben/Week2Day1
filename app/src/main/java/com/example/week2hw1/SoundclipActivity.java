package com.example.week2hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SoundclipActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundclip);
        mediaPlayer = MediaPlayer.create(this, R.raw.noooooooo);
        webView = findViewById(R.id.facedesk);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webView.loadUrl("https://giphy.com/gifs/justin-head-desk-bang-extreme-26FPML6KpNajDH0SQ/fullscreen");
    }

    public void onClick(View view) {
    switch (view.getId()) {
        case R.id.btn_play_sound:
            mediaPlayer.setVolume(100,100);
        mediaPlayer.start();

        break;
    }
    }
}
