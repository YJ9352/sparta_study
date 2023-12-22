package com.example.courseregistration.domain.course.dto

data class CourseResponse(
    val id: Long,
    val title: String,
    val description: String?,
    val status: String,
    val maxApplicants: Int,
    val numApplicants: Int,
)

//fun main(args: Array<String>) {
//    val courseResponse1 = CourseResponse(
//        id = 1L,
//        title = "abc",
//        description = null,
//        status = "CLOSED",
//        maxApplicants = 30,
//        numApplicants = 30
//    )
//
//    val courseResponse2 = CourseResponse(
//        id = 1L,
//        title = "abcde",
//        description = null,
//        status = "CLOSED",
//        maxApplicants = 30,
//        numApplicants = 30
//    )
//
//    val (id, title, description) = courseResponse
//    println(courseResponse1 == courseResponse2)
//}