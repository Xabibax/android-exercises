package fr.android.androidexercises

import retrofit2.Call
import retrofit2.http.GET

interface HenriPotierService {
    // TODO Method GET books which return a List<Book>
    @GET("/books")
    fun listBooks(): Call<List<Book>>
}
