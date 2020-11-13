package fr.android.androidexercises

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

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
        return if (convertView == null) {
            val newView = layoutInflater.inflate(R.layout.item_view_book, parent, false)
            getItem(position)?.let { (newView as BookItemView).bindView(it) }
            newView
        } else
            convertView
    }

}

data class BookViewHolder(val cover: ImageView, val title: TextView)