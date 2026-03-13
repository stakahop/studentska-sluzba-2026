package me.fit.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@NamedQuery(name = Student.GET_ALL_STUDENTS, query = "Select s from Student s")
public class Student {

    public static final String GET_ALL_STUDENTS = "GetAllStudents";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)

    public Long id;

    public String ime;

    public String prezime;

    public Student(){

    }

  public void setId(Long id) {
    this.id = id;
  }

  public void setIme(String ime) {
    this.ime = ime;
  }

  public void setPrezime(String prezime) {
    this.prezime = prezime;
  }

  public Long getId() {
    return id;
  }

  public String getIme() {
    return ime;
  }

  public String getPrezime() {
    return prezime;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return Objects.equals(id, student.id) && Objects.equals(ime, student.ime) && Objects.equals(prezime, student.prezime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ime, prezime);
  }
}
