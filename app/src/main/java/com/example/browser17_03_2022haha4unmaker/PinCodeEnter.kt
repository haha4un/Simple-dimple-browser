package com.example.browser17_03_2022haha4unmaker

import android.app.AlertDialog
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.random.Random

class PinCodeEnter : AppCompatActivity() {

    var name: Int = 0;
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

        var pin: String = "";
        var max: Int = 0

        name = Random.nextInt(0,1000) + Random.nextInt(1000, 10000) + Random.nextInt(100, 60000)

        var db: SQLiteDatabase = baseContext.openOrCreateDatabase("users.db", MODE_PRIVATE, null)

        if(checkName(db, name) == name) {

            text.text = "Вам надо создать пин-код \nЗапомните его, а то предется переустанавливать приложение"

            one.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "1"
                else
                    pinIsComplete(text,pin)
                text.text = pin;
            }
            two.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "2"
                else
                    pinIsComplete(text,pin)
                text.text = pin;
            }
            three.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "3"
                else
                    pinIsComplete(text,pin)
                text.text = pin;
            }
            four.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "4"
                else
                    pinIsComplete(text,pin)
                text.text = pin;
            }
            five.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "5"
                else
                    pinIsComplete(text,pin)
                text.text = pin;
            }
            six.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "6"
                else
                    pinIsComplete(text,pin)
                text.text = pin;
            }
            seven.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "7"
                else
                    pinIsComplete(text,pin)
                text.text = pin;
            }
            eight.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "8"
                else
                    pinIsComplete(text,pin)
                text.text = pin;
            }
            nine.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "9"
                else
                    pinIsComplete(text,pin)
                text.text = pin;
            }
            zero.setOnClickListener() {
                max++
                if (max <= 4)
                    pin += "0"
                else
                    pinIsComplete(text,pin)
                text.text = pin;
            }
        }

        else
    {
        text.text = "Введите ваш пин-код"

        one.setOnClickListener() {
            max++
            if (max <= 4)
                pin += "1"
            else if (pin.toInt() == checkOnRightPin(db, checkName(db)))
                pinIsComplete(text, pin)
            text.text = pin;
        }
        two.setOnClickListener() {
            max++
            if (max <= 4)
                pin += "2"
            else if (pin.toInt() == checkOnRightPin(db, checkName(db)))
                pinIsComplete(text, pin)
            text.text = pin;
        }
        three.setOnClickListener() {
            max++
            if (max <= 4)
                pin += "3"
            else if (pin.toInt() == checkOnRightPin(db, checkName(db)))
                pinIsComplete(text, pin)
            text.text = pin;
        }
        four.setOnClickListener() {
            max++
            if (max <= 4)
                pin += "4"
            else if (pin.toInt() == checkOnRightPin(db, checkName(db)))
                pinIsComplete(text, pin)
            text.text = pin;
        }
        five.setOnClickListener() {
            max++
            if (max <= 4)
                pin += "5"
            else if (pin.toInt() == checkOnRightPin(db, checkName(db)))
                pinIsComplete(text, pin)
            text.text = pin;
        }
        six.setOnClickListener() {
            max++
            if (max <= 4)
                pin += "6"
            else if (pin.toInt() == checkOnRightPin(db, checkName(db)))
                pinIsComplete(text, pin)
            text.text = pin;
        }
        seven.setOnClickListener() {
            max++
            if (max <= 4)
                pin += "7"
            else if (pin.toInt() == checkOnRightPin(db, checkName(db)))
                pinIsComplete(text, pin)
            text.text = pin;
        }
        eight.setOnClickListener() {
            max++
            if (max <= 4)
                pin += "8"
            else if (pin.toInt() == checkOnRightPin(db, checkName(db)))
                pinIsComplete(text, pin)
            text.text = pin;
        }
        nine.setOnClickListener() {
            max++
            if (max <= 4)
                pin += "9"
            else if (pin.toInt() == checkOnRightPin(db, checkName(db)))
                pinIsComplete(text, pin)
            text.text = pin;
        }
        zero.setOnClickListener() {
            max++
            if (max <= 4)
                pin += "0"
            else if (pin.toInt() == checkOnRightPin(db, checkName(db)))
                pinIsComplete(text, pin)
            text.text = pin;
        }
    }
        db.close()
    }

    fun checkOnRightPin(db: SQLiteDatabase, name: Int) : Int {
        db.execSQL("CREATE TABLE IF NOT EXISTS user (name INTEGER NOT NULL UNIQUE, opens INTEGER NOT NULL DEFAULT 0, PIN NOT NULL);")

        var check: Cursor = db.rawQuery("SELECT pin FROM user WHERE name = $name", null)

        var pin = 0;
        while (check.moveToNext())
        {
            pin = check.getInt(0)
        }
        return pin
    }


    fun pinIsComplete(text: TextView, pin: String)
    {
        checkerOnFirstEnter(text, pin)
        var note: Toast = Toast.makeText(this, "Пин-код создан. Ваш пинкод: $pin", Toast.LENGTH_LONG)
        note.show()

        var toNext: Intent = Intent(this, MainActivity::class.java)
        startActivity(toNext)
    }

    fun checkOnOpen(db: SQLiteDatabase, name: Int) : Int
    {
        db.execSQL("CREATE TABLE IF NOT EXISTS user (name INTEGER NOT NULL UNIQUE, opens INTEGER NOT NULL DEFAULT 0, PIN NOT NULL);")
        var check: Cursor = db.rawQuery ("SELECT opens FROM user WHERE name = $name", null)

        var opens = 0
        while (check.moveToNext())
        {
            opens = check.getInt(0)
        }
        db.close()
        check.close()

        return opens
    }
    fun checkOnOpen(db: SQLiteDatabase) : Int
    {
        db.execSQL("CREATE TABLE IF NOT EXISTS user (name INTEGER NOT NULL UNIQUE, opens INTEGER NOT NULL DEFAULT 0, PIN NOT NULL);")
        var check: Cursor = db.rawQuery ("SELECT opens FROM user", null)

        var opens = 0
        while (check.moveToNext())
        {
            opens = check.getInt(0)
        }
        db.close()
        check.close()

        return opens
    }

    fun checkName(db: SQLiteDatabase) : Int{
        db.execSQL("CREATE TABLE IF NOT EXISTS user (name INTEGER NOT NULL UNIQUE, opens INTEGER NOT NULL DEFAULT 0, PIN NOT NULL);")
        var check: Cursor = db.rawQuery ("SELECT name FROM user", null)

        var name = 0
        while (check.moveToNext())
        {
            name = check.getInt(0)
        }
        db.close()
        check.close()

        return name
    }
    fun checkName(db: SQLiteDatabase, name: Int) : Int{
        db.execSQL("CREATE TABLE IF NOT EXISTS user (name INTEGER NOT NULL UNIQUE, opens INTEGER NOT NULL DEFAULT 0, PIN NOT NULL);")
        var check: Cursor = db.rawQuery ("SELECT name FROM user", null)

        while (check.moveToNext())
        {
            if (name == check.getInt(0))
                return name
        }
        db.close()
        check.close()

        return 0
    }

    fun checkerOnFirstEnter(text: TextView, pin: String)
    {
        var db: SQLiteDatabase = baseContext.openOrCreateDatabase("users.db", MODE_PRIVATE, null)

        //db.execSQL("CREATE TABLE IF NOT EXISTS opens (open INTEGER, id INTEGER UNIQUE)")
        //db.execSQL("INSERT INTO opens (id, open) VALUES (1, $open)")


        var name = checkName(db, name)

        db = baseContext.openOrCreateDatabase("users.db", MODE_PRIVATE, null)

        var pinCode = pin.toInt()
        var open: Int = checkOnOpen(db, name)
        //
        db = baseContext.openOrCreateDatabase("users.db", MODE_PRIVATE, null)

        db.execSQL("CREATE TABLE IF NOT EXISTS user (name INTEGER NOT NULL DEFAULT 'empty', opens INTEGER NOT NULL DEFAULT 0, PIN INTEGER NOT NULL, UNIQUE(name));")

        open = checkOnOpen(db, name) +1;

        db = baseContext.openOrCreateDatabase("users.db", MODE_PRIVATE, null)

        db.execSQL("INSERT INTO user (name, opens, pin) VALUES ($name, $open, $pinCode)")

        db.execSQL("UPDATE user SET opens = $open WHERE name = $name")

        db.close()
    }
}