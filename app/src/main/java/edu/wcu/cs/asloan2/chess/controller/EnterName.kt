package edu.wcu.cs.asloan2.chess.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.wcu.cs.asloan2.chess.R
import edu.wcu.cs.asloan2.chess.game.GameFrag

class EnterName : AppCompatActivity(), View.OnClickListener {

    private lateinit var entryOne : EditText
    private lateinit var entryTwo : EditText
    private lateinit var cont : Button
    private lateinit var app : App

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_enter_name)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        entryOne = findViewById(R.id.name_one)
        entryTwo = findViewById(R.id.name_two)
        cont = findViewById(R.id.cont)
        cont.setOnClickListener(this)

        app = this.application as App

    }

    override fun onClick(v: View?) {
        if(v == cont) {
            app.setPOne(entryOne.text.toString())
            app.setPTwo(entryTwo.text.toString())
            val intent = Intent(this, GameFrag::class.java)
            intent.putExtra("one", entryOne.text.toString())
            intent.putExtra("two", entryTwo.text.toString())
            startActivity(intent)
        }
    }
}