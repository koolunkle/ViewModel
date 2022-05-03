package com.sesac.androidpractice

import android.os.SystemClock
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.concurrent.thread

class MainViewModel : ViewModel() {
  var sum = 0
  fun calSum(): MutableLiveData<String> {
    val liveData = MutableLiveData<String>()
    thread {
      for (i in 1..10) {
        sum += i
        liveData.postValue(sum.toString())
        SystemClock.sleep(100)
      }
    }
    return liveData
  }
}