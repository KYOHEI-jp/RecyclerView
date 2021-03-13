package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieList = arrayListOf<Movie>(
            Movie("Captain America", 9),
            Movie("Iron man", 5),
            Movie("Thor", 9),
            Movie("Incredible Hulk", 4),
            Movie("Guardians", 3),
            Movie("Avengers", 8),
            Movie("Avengers: Age of Ultron", 6),
            Movie("Thor: The Dark World", 7)

        )

        val recyclerAdapter = RecyclerAdapter(movieList)
        recyclerView.adapter = recyclerAdapter

    }
}