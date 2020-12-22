package com.assem.daggerhiltexamples.mindorks_example.data.api

import com.assem.daggerhiltexamples.mindorks_example.data.model.User
import retrofit2.Response
import retrofit2.http.GET

// https://blog.mindorks.com/dagger-hilt-tutorial

/**
 * Created by Mohamed Assem Ali on 12/22/2020.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 * Company: Orchtech
 */
interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}