package com.assem.daggerhiltexamples.mindorks_example.data.repository

import com.assem.daggerhiltexamples.mindorks_example.data.api.ApiHelper
import javax.inject.Inject


/**
 * Created by Mohamed Assem Ali on 12/22/2020.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 * Company: Orchtech
 */
class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}