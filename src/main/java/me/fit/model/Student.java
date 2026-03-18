package me.fit.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NamedQuery(name = Student.GET_ALL_STUDENTS, query = "Select s from Student s")
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode
public class Student {

    public static final String GET_ALL_STUDENTS = "GetAllStudents";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
    private Long id;

    public String ime;

    public String prezime;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private List<Phone> phones = new ArrayList<>();



}
