package com.shivam.services;

import java.util.List;

import com.shivam.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(Long courseId);
	
	public Course addCourse(Course course);

	public void deleteCourse(long parseLong);

}
