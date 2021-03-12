package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movie = Movie("Captain America", 9)
        var movieList: ArrayList<Movie> = ArrayList()
        movieList.add(Movie("Iron man", 5))
        movieList.add(Movie("Thor", 9))
        movieList.add(Movie("Incredible Hulk", 4))
        movieList.add(Movie("Guardians", 3))
        movieList.add(Movie("Avengers", 8))
        movieList.add(Movie("Avengers: Age of Ultron", 6))
        movieList.add(Movie("Thor: The Dark World", 7))

        Log.d("MainActivity", movieList.toString())

    }
}