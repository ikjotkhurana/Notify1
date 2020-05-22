package com.example.notify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class AddNotesActivity : AppCompatActivity() {

    private lateinit var  titleED:EditText
    private lateinit var descriptionED:EditText
    private lateinit var saveNotesBtn:Button
    private lateinit var realm: Realm


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_notes)
    //init views

        realm = Realm.getDefaultInstance()
        titleED = findViewById(R.id.title_EditText)
        descriptionED = findViewById(R.id.description_EditText)
        saveNotesBtn = findViewById(R.id.saveNotesbtn)

        // onclick listner

        saveNotesBtn.setOnClickListener {

            addNotesTODB()
        }



    }

    private fun addNotesTODB() {
        // auto increment ID
        try {
            realm.beginTransaction()
            val currentIdNumber = realm.where(Notes::class.java).max("id")
            var nextID:Int? = null

            nextID = if(currentIdNumber==null){
                     0
            }else{
                currentIdNumber.toInt() + 1
            }

        }catch (e:Exception){

        }

    }
}
