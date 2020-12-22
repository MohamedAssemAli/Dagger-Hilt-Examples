package com.assem.daggerhiltexamples.mindorks_example.data.model

import com.squareup.moshi.Json

/**
 * Created by Mohamed Assem Ali on 12/22/2020.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 * Company: Orchtech
 */
data class User(
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "name")
    val name: String = "",
    @Json(name = "email")
    val email: String = "",
    @Json(name = "avatar")
    val avatar: String = ""
)