package main.java.dao;

import main.java.model.Courses;
import main.java.model.Groups;

import java.util.List;

public interface CourseDao extends CrudRepository<Courses, Integer>{

    void saveAll(List<Courses> groups);

    List<Courses> findByStudentId(Integer studentId);
}