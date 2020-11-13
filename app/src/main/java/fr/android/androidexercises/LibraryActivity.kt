package fr.android.androidexercises

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class LibraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        // Plant logger cf. Android Timber
        //Timber.plant(Timber.DebugTree())

        // TODO build Retrofit
        val url = "http://henri-potier.xebia.fr/books/"
        val retrofit = Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        // TODO create a service
        val service = retrofit.create(HenriPotierService::class.java)

        // TODO listBooks()
        val booksRequest = service.listBooks()

        // TODO enqueue call and display book title
        val context = this;
        booksRequest.enqueue(object : Callback<List<Book>> {
            override fun onResponse(call: Call<List<Book>>, response: Response<List<Book>>) {
                val allBooks = response.body()
                if (allBooks != null) {
                    // TODO log books
                    for (b in allBooks) {
                        println(b)
                    }
                    // TODO display book as a list
                    findViewById<ListView>(R.id.bookListView).adapter = BookAdapter(context, allBooks)
                }
            }
            override fun onFailure(call: Call<List<Book>>, t: Throwable) {
                error("KO")
            }
        })
    }

}
