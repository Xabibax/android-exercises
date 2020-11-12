package fr.android.androidexercises

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class BookActivity : AppCompatActivity() {

    companion object {
        const val BOOK = "BOOK"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        val book: Book = intent.getParcelableExtra(BOOK) ?: Book()

        val authorTextView = findViewById<TextView>(R.id.authorTextView)
        authorTextView.text = book.author

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        nameTextView.text = book.name
    }

}
