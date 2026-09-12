package com.example.Project_Management_System.service;

import com.example.Project_Management_System.entity.Student;
import com.example.Project_Management_System.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }


    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}