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

class MainActivity : AppCompatActivity() {

    var w: WebView ?= null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        w = findViewById(R.id.web)
        var ok: Button = findViewById(R.id.ok)
        var txt: EditText = findViewById(R.id.what)

        w?.loadUrl("https://github.com/haha4un/Simple-dimple-browser")

        w?.webViewClient = MyWebViewClient()

        ok.setOnClickListener()
        {
            var search = txt.text;

            w?.loadUrl("https://yandex.ru/search/?lr=37166&text=$search")
        }

    }
}
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