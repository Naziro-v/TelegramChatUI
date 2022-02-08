package com.nazirov.telegramui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager= (GridLayoutManager(this,1))

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Chat>) {

        var  adapter = ChatAdapter(this,chats)
        recyclerView!!.adapter = adapter

    }
    fun getAllChats() : ArrayList<Chat> {
        var chats:ArrayList<Chat> = ArrayList<Chat>()

        chats.add(Chat(R.drawable.img_2,"Nazirov ELmurod", "Yes , you are good at peogramming"))
        chats.add(Chat(R.drawable.img_3,"Muhammad Soli", "Hi , Bro "))
        chats.add(Chat(R.drawable.img_4,"Nurmuhammad", " I am going to shopping tomorrow"))
        chats.add(Chat(R.drawable.img_5,"Abdulaziz", "yes , of cource"))
        chats.add(Chat(R.drawable.img_6,"Og`abekDev", " Did you finish homework?"))
        chats.add(Chat(R.drawable.img_7,"Doston Aka", "I will work for Facebook next year"))
        chats.add(Chat(R.drawable.img_8,"Samandar", "I come back to Tashkent"))
        chats.add(Chat(R.drawable.img_9,"Azizbek", "???????"))
       chats.add(Chat(R.drawable.img_2,"Nazirov ELmurod", "Yes , you are good at peogramming"))
        chats.add(Chat(R.drawable.img_3,"Muhammad Soli", "Hi , Bro "))
        chats.add(Chat(R.drawable.img_4,"Nurmuhammad", " I am going to shopping tomorrow"))
        chats.add(Chat(R.drawable.img_5,"Abdulaziz", "yes , of cource"))
        chats.add(Chat(R.drawable.img_6,"Og`abekDev", " Did you finish homework?"))
        chats.add(Chat(R.drawable.img_7,"Doston Aka", "I will work for Facebook next year"))
        chats.add(Chat(R.drawable.img_8,"Samandar", "I come back to Tashkent"))
        chats.add(Chat(R.drawable.img_9,"Azizbek", "???????"))
        chats.add(Chat(R.drawable.img_2, "Nazirov ELmurod", "Yes , you are good at peogramming"))
        chats.add(Chat(R.drawable.img_3, "Muhammad Soli", "Hi , Bro "))
        chats.add(Chat(R.drawable.img_4, "Nurmuhammad", " I am going to shopping tomorrow"))
        chats.add(Chat(R.drawable.img_5, "Abdulaziz", "yes , of cource"))
        chats.add(Chat(R.drawable.img_6, "Og`abekDev", " Did you finish homework?"))
        chats.add(Chat(R.drawable.img_7, "Doston Aka", "I will work for Facebook next year"))
        chats.add(Chat(R.drawable.img_8, "Samandar", "I come back to Tashkent"))
        chats.add(Chat(R.drawable.img_9, "Azizbek", "???????"))


        return chats
    }
}