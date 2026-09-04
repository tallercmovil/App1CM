package com.amaurypm.kotlintest

import com.amaurypm.kotlintest.model.Student

fun Student.getFullNameUppercase() = "$name $lastname".uppercase()