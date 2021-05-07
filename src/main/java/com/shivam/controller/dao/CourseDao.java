package com.shivam.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
