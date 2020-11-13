package fr.android.androidexercises

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(context: Context, private val books: List<Book>) : BaseAdapter() {

    // TODO create variable with LayoutInflater.from()
    private val layoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return books.size
    }

    override fun getItem(position: Int): Book? {
        return books[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {

        val view = if (convertView == null) {
            val newView = layoutInflater.inflate(R.layout.custom_view_item_book, parent, false)
            newView.tag = BookViewHolder(
                    newView.findViewById(R.id.nameTextView),
                    newView.findViewById(R.id.priceTextView))
            newView
        } else
            convertView

        val book = getItem(position)
        val bookViewHolder = (view?.tag as BookViewHolder)
        bookViewHolder.bookName.text = "${book?.name}"
        bookViewHolder.bookPrice.text = "${book?.price}"

        return view
    }

}

data class BookViewHolder(val bookName: TextView, val bookPrice: TextView)