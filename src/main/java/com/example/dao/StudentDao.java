package com.example.dao;

import java.util.Collection;

import com.example.entity.Student;

/**
 * Created by User on 02-Jul-17.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void addStudent(Student student);
}
