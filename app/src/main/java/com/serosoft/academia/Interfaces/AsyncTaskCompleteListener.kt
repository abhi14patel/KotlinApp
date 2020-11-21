package com.serosoft.academia.Interfaces

interface AsyncTaskCompleteListener {
    fun onTaskComplete(result: HashMap<String, String>?)
}