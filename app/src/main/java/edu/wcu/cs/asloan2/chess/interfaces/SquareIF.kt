package edu.wcu.cs.asloan2.chess.interfaces

import android.widget.ImageView

interface SquareIF {

    fun clear()

    fun setPiece(imv : ImageView)

    fun getPiece() : ImageView
}