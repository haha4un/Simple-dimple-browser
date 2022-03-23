package com.example.browser17_03_2022haha4unmaker

import android.app.AlertDialog
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.strictmode.SqliteObjectLeakedViolation
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.random.Random

class PinCodeEnter : AppCompatActivity() {

    var name: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin_code_enter)

        var text: TextView = findViewById(R.id.pin)
        var one: Button = findViewById(R.id.one)
        var two: Button = findViewById(R.id.two)
        var three: Button = findViewById(R.id.three)
        var four: Button = findViewById(R.id.four)
        var five: Button = findViewById(R.id.five)
        var six: Button = findViewById(R.id.six)
        var seven: Button = findViewById(R.id.seven)
        var eight: Button = findViewById(R.id.eight)
        var nine: Button = findViewById(R.id.nine)
        var zero: Button = findViewById(R.id.zero)

        var pin: String = ""
        var max: Int = 0

        name = Random.nextInt(0, 1000) + Random.nextInt(1000, 10000) + Random.nextInt(100, 60000)

        var db: SQLiteDatabase = baseContext.openOrCreateDatabase("users.db", MODE_PRIVATE, null)
        db.execSQL("CREATE TABLE IF NOT EXISTS user (id INTEGER NOT NULL,name INTEGER NOT NULL UNIQUE, opens INTEGER NOT NULL DEFAULT 0, PIN NOT NULL);")

        if (checkOnName(db) == true)
        {
            text.text = "Надо создать пин-код. \nЗапомните его, а то придется переустанавливать приложение"
            var opens = 1;
            var id = 1;


            one.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "1"
                else
                {
                    var pinTo = pin.toInt()
                    db.execSQL("INSERT INTO user (id, name, opens, pin) VALUES ($id, $name, $opens, $pinTo)")
                    pinIsComplete(text,pin)
                }
                text.text = pin;
            }
            two.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "2"
                else
                {
                    var pinTo = pin.toInt()
                    db.execSQL("INSERT INTO user (id, name, opens, pin) VALUES ($id, $name, $opens, $pinTo)")
                    pinIsComplete(text,pin)
                }
                text.text = pin;
            }
            three.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "3"
                else
                {
                    var pinTo = pin.toInt()
                    db.execSQL("INSERT INTO user (id, name, opens, pin) VALUES ($id, $name, $opens, $pinTo)")
                    pinIsComplete(text,pin)
                }
                text.text = pin;
            }
            four.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "4"
                else
                {
                    var pinTo = pin.toInt()
                    db.execSQL("INSERT INTO user (id, name, opens, pin) VALUES ($id, $name, $opens, $pinTo)")
                    pinIsComplete(text,pin)
                }
                text.text = pin;
            }
            five.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "5"
                else
                {
                    var pinTo = pin.toInt()
                    db.execSQL("INSERT INTO user (id, name, opens, pin) VALUES ($id, $name, $opens, $pinTo)")
                    pinIsComplete(text,pin)
                }
                text.text = pin;
            }
            six.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "6"
                else
                {
                    var pinTo = pin.toInt()
                    db.execSQL("INSERT INTO user (id, name, opens, pin) VALUES ($id, $name, $opens, $pinTo)")
                    pinIsComplete(text,pin)
                }
                text.text = pin;
            }
            seven.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "7"
                else
                {
                    var pinTo = pin.toInt()
                    db.execSQL("INSERT INTO user (id, name, opens, pin) VALUES ($id, $name, $opens, $pinTo)")
                    pinIsComplete(text,pin)
                }
                text.text = pin;
            }
            eight.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "8"
                else
                {
                    var pinTo = pin.toInt()
                    db.execSQL("INSERT INTO user (id, name, opens, pin) VALUES ($id, $name, $opens, $pinTo)")
                    pinIsComplete(text,pin)
                }
                text.text = pin;
            }
            nine.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "9"
                else
                {
                    var pinTo = pin.toInt()
                    db.execSQL("INSERT INTO user (id, name, opens, pin) VALUES ($id, $name, $opens, $pinTo)")
                    pinIsComplete(text,pin)
                }
                text.text = pin;
            }
            zero.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "0"
                else
                {
                    var pinTo = pin.toInt()
                    db.execSQL("INSERT INTO user (id, name, opens, pin) VALUES ($id, $name, $opens, $pinTo)")
                    pinIsComplete(text,pin)
                }
                text.text = pin;
            }
        }
        else
        {
            text.text = "Введите ваш пин-код"
            addOpen(db)

            one.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "1"
                else
                {
                    if (checkPin(db, pin.toInt()) == true)
                        pinIsComplete(text, pin)
                    else{
                        text.text = "Пароль не подходит!"
                        pin += "1"
                    }
                }
                text.text = pin;
            }
            two.setOnClickListener(){
                max++
                if (max <= 4)
                    pin += "2"
                else
                {
                    if (checkPin(db, pin.toInt()) == true)
                        pinIsComplete(text, pin)
                    else{
                        text.text = "Пароль не подходит!"
                        pin += "2"
                    }
                }
                text.text = pin;
            }
            three.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "3"
                else
                {
                    if (checkPin(db, pin.toInt()) == true)
                        pinIsComplete(text, pin)
                    else{
                        text.text = "Пароль не подходит!"
                        pin += "3"
                    }
                }
                text.text = pin;
            }
            four.setOnClickListener(){
                max++
                if (max <= 4)
                    pin += "4"
                else
                {
                    if (checkPin(db, pin.toInt()) == true)
                        pinIsComplete(text, pin)
                    else{
                        text.text = "Пароль не подходит!"
                        pin += "4"
                    }
                }
                text.text = pin;
            }
            five.setOnClickListener(){
                max++
                if (max <= 4)
                    pin += "5"
                else
                {
                    if (checkPin(db, pin.toInt()) == true)
                        pinIsComplete(text, pin)
                    else{
                        text.text = "Пароль не подходит!"
                        pin += "5"
                    }
                }
                text.text = pin;
            }
            six.setOnClickListener(){
                max++
                if (max <= 4)
                    pin += "6"
                else
                {
                    if (checkPin(db, pin.toInt()) == true)
                        pinIsComplete(text, pin)
                    else{
                        text.text = "Пароль не подходит!"
                        pin += "6"
                    }
                }
                text.text = pin;
            }
            seven.setOnClickListener(){
                max++
                if (max <= 4)
                    pin += "7"
                else
                {
                    if (checkPin(db, pin.toInt()) == true)
                        pinIsComplete(text, pin)
                    else{
                        text.text = "Пароль не подходит!"
                        pin += "7"
                    }
                }
                text.text = pin;
            }
            eight.setOnClickListener(){
                max++
                if (max <= 4)
                    pin += "8"
                else
                {
                    if (checkPin(db, pin.toInt()) == true)
                        pinIsComplete(text, pin)
                    else{
                        text.text = "Пароль не подходит!"
                        pin += "8"
                    }
                }
                text.text = pin;
            }
            nine.setOnClickListener(){
                max++
                if (max <= 4)
                    pin += "9"
                else
                {
                    if (checkPin(db, pin.toInt()) == true)
                        pinIsComplete(text, pin)
                    else{
                        text.text = "Пароль не подходит!"
                        pin += "9"
                    }
                }
                text.text = pin;
            }
            zero.setOnClickListener(){
                max++
                if (max <= 4)
                    pin += "0"
                else
                {
                    if (checkPin(db, pin.toInt()) == true)
                        pinIsComplete(text, pin)
                    else{
                        text.text = "Пароль не подходит!"
                        pin = "0"
                    }
                }
                text.text = pin;
            }
        }

    }

    fun checkOnName(db: SQLiteDatabase) : Boolean
    {
        db.execSQL("CREATE TABLE IF NOT EXISTS user (id INTEGER NOT NULL,name INTEGER NOT NULL UNIQUE, opens INTEGER NOT NULL DEFAULT 0, PIN NOT NULL);")

        var check: Cursor = db.rawQuery("SELECT name FROM user", null)

        var vs: Int;

        var count: Int = 0
        if (check.moveToNext())
            count++

        if (count == 0)
            return true
        else
            return false
    }


    fun addOpen(db: SQLiteDatabase)
    {
        db.execSQL("CREATE TABLE IF NOT EXISTS user (id INTEGER NOT NULL,name INTEGER NOT NULL UNIQUE, opens INTEGER NOT NULL DEFAULT 0, PIN NOT NULL);")

        var check: Cursor = db.rawQuery("SELECT opens FROM user", null)

        var open = 1
        while (check.moveToNext())
        {
            open = check.getInt(0)+1;
            db.execSQL("UPDATE user SET id = $open")
        }
    }
    fun checkPin(db: SQLiteDatabase, pin: Int) : Boolean
    {
        db.execSQL("CREATE TABLE IF NOT EXISTS user (id INTEGER NOT NULL,name INTEGER NOT NULL UNIQUE, opens INTEGER NOT NULL DEFAULT 0, PIN NOT NULL);")

        var check: Cursor = db.rawQuery("SELECT PIN FROM user", null)

        while (check.moveToNext())
        {
            if (pin == check.getInt(0))
                return true
        }
        return false
    }


    fun pinIsComplete(text: TextView, pin: String)
    {
        var note: Toast = Toast.makeText(this, "Пин-код создан. Ваш пинкод: $pin", Toast.LENGTH_LONG)
        note.show()


        var toNext: Intent = Intent(this, Main::class.java)
        startActivity(toNext)
    }
}