package com.xaurora.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle b) {
    super.onCreate(b);
    getWindow().setFlags(1024,1024);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    WebView w = new WebView(this);
    w.setBackgroundColor(0xff111111);
    WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
    w.setOverScrollMode(View.OVER_SCROLL_NEVER);
    setContentView(w);
    w.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed() { }
}
