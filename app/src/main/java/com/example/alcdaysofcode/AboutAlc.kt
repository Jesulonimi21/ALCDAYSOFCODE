package com.example.alcdaysofcode

import android.net.http.SslError
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_about_alc.*

class AboutAlc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc);
        supportActionBar!!.setTitle("About Alc")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        webview.webViewClient=SSLTolerenceWebviewClient()
        webview.settings.javaScriptEnabled=true
        webview.settings.loadWithOverviewMode=true
        webview.settings.useWideViewPort=true
        webview.loadUrl("https:andela.com/alc/");
                 // http://b-ok.org
    }

    class SSLTolerenceWebviewClient:WebViewClient(){
        override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
            handler!!.proceed()
        }
    }
}
