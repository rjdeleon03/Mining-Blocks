package com.rjdeleon.miningblocks.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rjdeleon.miningblocks.R
import com.rjdeleon.miningblocks.domain.model.Point
import com.rjdeleon.miningblocks.domain.model.Rectangle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun isPointInsideRect(point: Point, rect: Rectangle): Boolean {
        if (point.x >= rect.left
            && point.x <= rect.right
            && point.y >= rect.top
            && point.y <= rect.bottom
        ) {
            return true
        }
        return false
    }
}