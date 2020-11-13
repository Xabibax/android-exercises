package fr.android.androidexercises

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.squareup.picasso.Picasso

class BookItemView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
        LinearLayout(context, attrs, defStyleAttr) {

    override fun onFinishInflate() {
        super.onFinishInflate()
        // TODO findViewById()

    }

    fun bindView(book: Book) {
        // TODO setText()//
        Picasso.get()
            .load(book.cover)
            .into(findViewById<ImageView>(R.id.coverImageView))
        findViewById<TextView>(R.id.titleTextView).text = book.title
    }

    override fun callOnClick(): Boolean {
        return super.callOnClick()
    }
}
