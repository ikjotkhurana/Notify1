package com.example.notify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var addNotes: FloatingActionButton
    private lateinit var notesRV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init views
        addNotes = findViewById(R.id.addNotes)
        notesRV = findViewById(R.id.notesRV)

        //onclick add notes button

        addNotes.setOnClickListener {

            val intent = Intent(this, AddNotesActivity::class.java)
            startActivity(intent)

        }
    }
}


//Test push by advait to check access.