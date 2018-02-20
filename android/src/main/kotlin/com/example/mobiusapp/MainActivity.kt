package com.example.mobiusapp

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import com.revolut.domain.models.RevolutCardImpl
import io.reactivex.android.schedulers.AndroidSchedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById<View>(R.id.fab) as FloatingActionButton
        fab.setOnClickListener {
            val card = RevolutCardImpl("id.android", AndroidSchedulers.mainThread())
            card.printIdAsync()
            card.runAsync {
                println("Card id = ${card.id}, thread = ${Thread.currentThread().name}")
            }
        }
    }

}
