package com.example.practica3webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

private val BASE_URL = "https://google.com"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: android.webkit.WebView = findViewById(R.id.webView)
        webView.webChromeClient = object : WebChromeClient(){

        }
        webView.webViewClient = object : WebViewClient(){

        }

        val settings = webView.settings
        settings.javaScriptEnabled = true
        webView.loadUrl(BASE_URL)
    }

    override fun onBackPressed(){
        val webView: android.webkit.WebView = findViewById(R.id.webView)
        if(webView.canGoBack()) {
            webView.goBack()
        }else{
            super.onBackPressed()
        }
    }
}