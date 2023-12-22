package com.example.courseregistration.domain.lecture.controller

import com.example.courseregistration.domain.lecture.dto.LectureResponse
import com.example.courseregistration.domain.lecture.dto.UpdateLectureRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/courses/{courseId}/lectures")
@RestController
class LectureController {

    @GetMapping
    fun getLectureList(@PathVariable courseId: Long): ResponseEntity<List<LectureResponse>> {
        TODO("not implemented")
    }

    @GetMapping("/{lectureId}")
    fun getLecture(@PathVariable courseId: Long,
                   @PathVariable lectureId: Long): ResponseEntity<LectureResponse> {
        TODO("not implemented")
    }

    @PutMapping("/{lectureId}")
    fun updateLecture(@PathVariable courseId: Long,
                      @PathVariable lectureId: Long,
                      @RequestBody updateLectureRequest: UpdateLectureRequest
    ): ResponseEntity<LectureResponse> {
        TODO("not implemented")
    }

    @DeleteMapping("/{lectureId}")
    fun removeLecture(@PathVariable courseId: Long,
                      @PathVariable lectureId: Long): ResponseEntity<Unit> {
        TODO("not implemented")
    }
}