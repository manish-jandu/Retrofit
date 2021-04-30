package com.manishjandu.retrofit

import retrofit2.Response
import retrofit2.http.GET

interface TodoApi{

    @GET("/todos")
    suspend fun getTodo():Response<List<Todo>>

}