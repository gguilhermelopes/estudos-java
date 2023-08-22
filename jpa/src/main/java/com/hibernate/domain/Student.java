package com.hibernate.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;


import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "TB_STUDENT")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(
            name = "student_seq",
            sequenceName = "sq_student_seq",
            initialValue = 1,
            allocationSize = 1
    )
    private Long id;
    @Column(name = "CODE", length = 10, nullable = false, unique = true)
    private String code;
    @Column(name = "name", nullable = false)
    private String name;
    @OneToOne(mappedBy = "student")
    private Registration registration;

    @ManyToMany
    @Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.MERGE})
    @JoinTable(
            name = "TB_STUDENT_COMPUTER",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "computer_id")}
    )
    private List<Computer> computers;

    public Student(){
        this.computers = new ArrayList<Computer>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public void addComputers(Computer computer){
        this.computers.add(computer);
    }
}
