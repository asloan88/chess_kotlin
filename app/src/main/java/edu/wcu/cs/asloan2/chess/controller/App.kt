package edu.wcu.cs.asloan2.chess.controller

import android.app.Application
import android.util.Log

class App : Application() {

    private var playerOne : String? = null
    private var playerTwo : String? = null

    override fun onCreate() {
        super.onCreate()
        Log.v("App", ">>>>>>>>>>>>>> name: ${playerOne}")
    }

    fun setPOne(name : String) {
        this.playerOne = name
    }

    fun getPOne() : String? {
        return this.playerOne
    }

    fun setPTwo(name : String) {
        this.playerTwo = name
    }

    fun getPTwo() : String? {
        return this.playerTwo
    }
 }