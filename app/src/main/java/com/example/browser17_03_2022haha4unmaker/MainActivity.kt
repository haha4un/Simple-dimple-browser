package com.example.browser17_03_2022haha4unmaker

import android.annotation.TargetApi
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import java.nio.file.WatchEvent

class MainActivity() : AppCompatActivity() {

    var w: WebView ?= null;
    var search: String = "f"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        w = findViewById(R.id.web)
        var web: WebView = findViewById(R.id.web)
        var ok: Button = findViewById(R.id.ok)
        var txt: EditText = findViewById(R.id.what)

        w?.loadUrl("https://www.google.com/search?q=$search")

        w?.webViewClient = MyWebViewClient()
        web.webViewClient = MyWebViewClient()


        ok.setOnClickListener()
        {
            search = txt.text.toString()
            goToSearch(search.toString(), web)
        }
    }

    fun goToSearch(search: String, w: WebView)
    {
        w.loadUrl("https://www.google.com/search?q=$search")
    }


    override fun onBackPressed() {
        if (w?.canGoBack() == true) {
            w?.goBack()
        }
    }
}





//
private class MyWebViewClient : WebViewClient() {

    @TargetApi(Build.VERSION_CODES.N)
    override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
        view.loadUrl(request.url.toString())
        return true
    }

    override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
        view.loadUrl(url)
        return true
    }
}