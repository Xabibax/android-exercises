package fr.android.androidexercises

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class BookActivity : AppCompatActivity() {

    private val bookName = "Garry Whopper"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        val messageTextView = findViewById<TextView>(R.id.messageTextView)
        messageTextView.text = bookName

        val sendNameButton = findViewById<Button>(R.id.sendNameButton)
        sendNameButton.setOnClickListener {
            setResult(RESULT_OK, Intent().putExtra("BOOK_NAME", bookName))
            this.finish()
        }
    }
}
