package com.dowellcomputer.jes_jsp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView);
        /* 웹 세팅 작업하기 */
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        webSettings.setSaveFormData(false);
        webSettings.setSavePassword(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setSupportMultipleWindows(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        /* 리다이렉트 할 때 브라우저 열리는 것 방지 */
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        /* 웹 뷰 띄우기 */
        webView.loadUrl("http://www.dowellcomputer.com/JES-JSP/therapistLoginView.jes");
    }

    public void onBackPressed() {
        if(webView.canGoBack()) webView.goBack();
        else finish();
    }
}
