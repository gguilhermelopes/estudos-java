package com.hibernate.domain;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "TB_REGISTRATION")

public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "registration_seq")
    @SequenceGenerator(
            name = "registration_seq",
            sequenceName = "sq_registration_seq",
            initialValue = 1,
            allocationSize = 1
    )
    private Long id;
    @Column(name = "CODE", length = 10, nullable = false, unique = true)
    private String code;
    @Column(name = "REGISTRATION_DATE", nullable = false)
    private Instant date;
    @Column(name = "VALUE", nullable = false)
    private Double value;
    @Column(name = "STATUS", nullable = false)
    private String status;
    @ManyToOne
    @JoinColumn(
            name = "COURSE_ID",
            foreignKey = @ForeignKey(name= "fk_course_registration"),
            referencedColumnName = "id",
            nullable = false
    )
    private Course course;
    @OneToOne
    @JoinColumn(
            name = "STUDENT_ID",
            foreignKey = @ForeignKey(name = "fk_student_registration"),
            referencedColumnName = "id",
            nullable = false
    )
    private Student student;

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

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
