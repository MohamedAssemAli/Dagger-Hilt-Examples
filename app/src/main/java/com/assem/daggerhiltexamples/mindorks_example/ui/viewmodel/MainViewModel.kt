package com.assem.daggerhiltexamples.mindorks_example.ui.viewmodel

import androidx.lifecycle.*
import com.assem.daggerhiltexamples.mindorks_example.data.api.ApiHelper
import com.assem.daggerhiltexamples.mindorks_example.data.model.User
import com.assem.daggerhiltexamples.mindorks_example.data.repository.MainRepository
import com.assem.daggerhiltexamples.mindorks_example.utils.NetworkHelper
import com.assem.daggerhiltexamples.mindorks_example.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel

import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    private val _users = MutableLiveData<Resource<List<User>>>()
    val users: LiveData<Resource<List<User>>>
        get() = _users

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            _users.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepository.getUsers().let {
                    if (it.isSuccessful) {
                        _users.postValue(Resource.success(it.body()))
                    } else _users.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } else _users.postValue(Resource.error("No internet connection", null))
        }
    }
}