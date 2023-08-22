package com.hibernate.domain;

import jakarta.persistence.*;

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
}
