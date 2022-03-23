package com.example.browser17_03_2022haha4unmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.lang.ref.Reference

class Main : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var search: EditText = findViewById(R.id.search)
        var ok: Button = findViewById(R.id.ok)

        var txt = "В разработке!(лень)-нажми на кнопку"
        search.hint = txt

        ok.setOnClickListener()
        {
            var toSearch: Intent = Intent(this, MainActivity::class.java)
            startActivity(toSearch)
        }
    }
}

