package me.fit.service;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import me.fit.model.Student;

import java.util.List;

@Dependent
public class StudentService {

  @Inject
  private EntityManager em;

  @Transactional
  public Student createStudent(Student student){
      return em.merge(student);
  }

  @Transactional
  public List<Student> getAllStudents(){
    return em.createNamedQuery(Student.GET_ALL_STUDENTS, Student.class).getResultList();
  }


}
