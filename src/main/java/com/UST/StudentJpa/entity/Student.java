package com.UST.StudentJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Student_Details")
public class Student {
    @Id
    private Long id;
    private String name;
    private String email;
    private String phoneNo;
    private String qualification;
    private String experience;
    @ElementCollection
    private List<String> course;
    private String address;
    private String comments;
}
