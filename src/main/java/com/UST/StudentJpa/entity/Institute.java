package com.UST.StudentJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Institute {
    @Id
    @GeneratedValue
    private Long id;
    private String instituteName;
    @ElementCollection
    private List<String> courses;
    private String location;
    @ElementCollection
    private List<String> courseWithPrice;
}
