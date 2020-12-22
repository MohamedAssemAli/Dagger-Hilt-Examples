package com.assem.daggerhiltexamples.mindorks_example.data.api

import com.assem.daggerhiltexamples.mindorks_example.data.model.User
import retrofit2.Response
import javax.inject.Inject


/**
 * Created by Mohamed Assem Ali on 12/22/2020.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 * Company: Orchtech
 */
class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {
    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()
}