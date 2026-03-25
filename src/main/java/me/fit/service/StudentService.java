package me.fit.service;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import me.fit.exception.StudentException;
import me.fit.model.Phone;
import me.fit.model.Student;

import java.util.List;

@Dependent
public class StudentService {

  @Inject
  private EntityManager em;

  @Transactional
  public Student createStudent(Student student) throws StudentException {
      if(student == null){
        throw new StudentException("Student nije proslijedjen");
      }
      if(student.getIme().isEmpty()){
        throw new StudentException("Ime je prazno");
      }
      if(student.getPrezime().isEmpty()) {
        throw new StudentException("Prezime je prazno");
      }

      return  em.merge(student);
  }

  @Transactional
  public List<Student> getAllStudents() throws StudentException{

    List<Student> students = em.createNamedQuery(Student.GET_ALL_STUDENTS, Student.class).getResultList();

    if(students.isEmpty()){
      throw new StudentException("Nema studenata.");
    }
    return students;
  }


  public List<Student> getStudentByName(String name) {
    List<Student> students = em.createNamedQuery(Student.GET_STUDENT_BY_NAME, Student.class).setParameter("imeS", name).getResultList();
    return  students;
  }


  public List<Phone> getPhonesByStudentId(Long id) {
    List<Phone> phones = em.createNamedQuery(Phone.GET_ALL_PHONES_FOR_STUDENT_ID, Phone.class).setParameter("id", id).getResultList();
    return  phones;
  }
}
