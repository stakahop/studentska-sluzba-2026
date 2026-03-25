package me.fit.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NamedQuery(name = Student.GET_ALL_STUDENTS, query = "Select  s.id, s.ime, s.prezime from Student s")
@NamedQuery(name = Student.GET_STUDENT_BY_NAME, query = "Select  s from Student s where s.ime = :imeS")
public class Student {

    public static final String GET_ALL_STUDENTS = "GetAllStudents";
    public static final String GET_STUDENT_BY_NAME = "GetStudentByName";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
    private Long id;

    private String ime;

    private String prezime;

    public Student() {

    }

  public Student(Long id, String ime, String prezime) {
    this.id = id;
    this.ime = ime;
    this.prezime = prezime;
  }

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private List<Phone> phones = new ArrayList<>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getIme() {
    return ime;
  }

  public void setIme(String ime) {
    this.ime = ime;
  }

  public String getPrezime() {
    return prezime;
  }

  public void setPrezime(String prezime) {
    this.prezime = prezime;
  }

  public List<Phone> getPhones() {
    return phones;
  }

  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Student student)) return false;
    return Objects.equals(id, student.id) && Objects.equals(ime, student.ime) && Objects.equals(prezime, student.prezime) && Objects.equals(phones, student.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ime, prezime, phones);
  }

  @Override
  public String toString() {
    return "Student{" +
      "id=" + id +
      ", ime='" + ime + '\'' +
      ", prezime='" + prezime + '\'' +
      ", phones=" + phones +
      '}';
  }
}
