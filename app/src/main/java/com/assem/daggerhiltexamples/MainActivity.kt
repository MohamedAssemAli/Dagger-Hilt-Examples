package com.assem.daggerhiltexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject
import javax.inject.Singleton
//
//@AndroidEntryPoint
//class MainActivity : AppCompatActivity() {
//
//    // field injection
//    @Inject
//    lateinit var someClass: SomeClass
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        // field + constructor injection
//        println(someClass.doAThing())
//        println(someClass.doSomeOtherThing())
//        // scoping
//
//
//    }
//}
//
//@AndroidEntryPoint
//class MyFragment : Fragment() {
//    @Inject
//    lateinit var someClass: SomeClass
//}
//
//@ActivityScoped
//class SomeClass
//@Inject
//constructor(
//    // constructor injection
//    private val someOtherClass: SomeOtherClass,
//    // constructor injection problems
//    // you cannot inject third party as it's a dependency dagger doesn't know how to inject
//    private val gson: Gson
//) {
//    fun doAThing(): String {
//        return "Look I did a thing!"
//    }
//
//    fun doSomeOtherThing(): String {
//        return someOtherClass.doSomeOtherThing()
//    }
//}
//
//
//// constructor injection problems
//// you cannot inject constructor when you try to inject interface
//class SomeOtherClass
//@Inject
//constructor() {
//    fun doSomeOtherThing(): String {
//        return "Look I did a some other thing!"
//    }
//}
//
//class SomeInterfaceImp
//@Inject
//constructor() : SomeInterface {
//    override fun getAthing(): String {
//        return "get a thing imp"
//    }
//}
//
//
//interface SomeInterface {
//    fun getAthing(): String
//}