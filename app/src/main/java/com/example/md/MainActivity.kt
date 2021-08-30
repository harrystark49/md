package com.example.md

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.md.R.id.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tool: Toolbar = findViewById(tool)
        tool.setTitle("harry")
        tool.inflateMenu(R.menu.menu)
        tool.setOnMenuItemClickListener {

            when (it.itemId) {
                R.id.save1 -> {
                    Toast.makeText(this, "harrystark", Toast.LENGTH_SHORT).show()
                }

            }
            true
        }

    }
}
