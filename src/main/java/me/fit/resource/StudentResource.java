package me.fit.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import me.fit.model.Student;
import me.fit.service.StudentService;

import java.util.List;

@Path("/student")
public class StudentResource {

    @Inject
    private StudentService studentService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/addStudent")
    public String addStudent(Student student) {
      studentService.createStudent(student);
      return "Hello RESTEasy";
    }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/getAllStudents")
  public Response getAllStudents() {
    List<Student> students = studentService.getAllStudents();
    return Response.ok().entity(students).build();
  }
}
