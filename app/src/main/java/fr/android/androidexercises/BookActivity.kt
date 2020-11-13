package fr.android.androidexercises

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class BookActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.book_view)
        val isbn = findViewById<TextView>(R.id.isbnTextView)
        val cover = findViewById<ImageView>(R.id.coverImageView)
        val title = findViewById<TextView>(R.id.titleTextView)
        val price = findViewById<TextView>(R.id.priceTextView)
    }
}