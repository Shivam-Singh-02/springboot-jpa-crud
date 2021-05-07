package com.shivam.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.controller.dao.CourseDao;
import com.shivam.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	public CourseServiceImpl() {
	
	}
	
	@Override
	public List<Course> getCourses() {
	
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(Long courseId) {

		return courseDao.getOne(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;	
	}
	
	
	@Override
	public void deleteCourse(long courseId) {
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
		
	}
	
}
 