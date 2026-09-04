package com.amaurypm.kotlintest.model

data class Student(
    var id: Long,
    var name: String,
    var lastname: String
){
    fun getFullName() = "$name $lastname"
}
