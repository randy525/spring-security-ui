package com.endava.springcursuniv.service;

import com.endava.springcursuniv.model.Student;
import com.endava.springcursuniv.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    
    private final StudentRepository studentRepository;
    
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    public List<Student> getStudentsByName(String name) {
        return studentRepository.findByName(name);
    }
    
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
    
    public Optional<Student> findStudent(long id) {
        return studentRepository.findById(id);
    }
    
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }
    
    public void removeStudent(Student student) {
        studentRepository.delete(student);
    }
    
}
