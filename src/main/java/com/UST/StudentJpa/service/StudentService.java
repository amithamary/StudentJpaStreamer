package com.UST.StudentJpa.service;

import com.UST.StudentJpa.entity.Student;
import com.UST.StudentJpa.entity.Student$;
import com.UST.StudentJpa.repository.StudentRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;
    @Autowired
    private JPAStreamer jpaStreamer;



    public List<Student> addAlldetails(List<Student> student) {
        return repo.saveAll(student);
    }

    public List<Student> getAlldetails() {
        return repo.findAll();
    }



       public Long getStudentCountForCourses(List<String> course) {

           return jpaStreamer.stream(Student.class)
                   .flatMap(student -> student.getCourse().stream())
                   .filter(courses -> course.contains(courses))
                   .distinct()
                   .count();
       }

    public List<Student> getAdd(String add) {
        return jpaStreamer.stream(Student.class)
                .filter(Student$.address.equal(add))
                .collect(Collectors.toList());
    }
}
