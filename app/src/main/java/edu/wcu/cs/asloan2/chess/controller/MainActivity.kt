package edu.wcu.cs.asloan2.chess.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.wcu.cs.asloan2.chess.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var twoP : Button
    private lateinit var fourP : Button
    private lateinit var settings : Button
    private lateinit var rules : Button
    private lateinit var app : App

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        app = this.application as App

        twoP = findViewById(R.id.two_p)
        twoP.setOnClickListener(this)
        fourP = findViewById(R.id.four_p)
        fourP.setOnClickListener(this)
        settings = findViewById(R.id.settings)
        settings.setOnClickListener(this)
        rules = findViewById(R.id.rules)
        rules.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            twoP -> {
                val intent = Intent(this, EnterName::class.java)
                startActivity(intent)
            }
        }
    }
}