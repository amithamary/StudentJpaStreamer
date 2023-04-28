package com.UST.StudentJpa.controller;

import com.UST.StudentJpa.entity.Student;
import com.UST.StudentJpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService service;
    @PostMapping("/add")
    public List<Student> addAlldetails(@RequestBody List<Student> student){
        return service.addAlldetails(student);
    }
    @GetMapping("/get")
    public List<Student> getAlldetails() {
       return service.getAlldetails();
    }

    @GetMapping("/student/{courses}")
    public Long getStudentCountForCourses(@RequestParam List<String> course) {

        return service.getStudentCountForCourses(course);

    }
    @GetMapping("getaddress/{address}")
    public List<Student> getList(@PathVariable String address) {
        return service.getAdd(address);
    }
}
