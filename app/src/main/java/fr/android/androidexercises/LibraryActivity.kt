package fr.android.androidexercises

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class LibraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        // TODO Get image view and load image form URL
        Picasso.get()
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Harry_Potter_wordmark.svg/440px-Harry_Potter_wordmark.svg.png")
                .into(findViewById<ImageView>(R.id.downloadImageView))
    }

}
