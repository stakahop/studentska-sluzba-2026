package me.fit.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import me.fit.exception.StudentException;
import me.fit.model.Phone;
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
    public Response addStudent(Student student) {
      try {
        studentService.createStudent(student);
      } catch (StudentException e) {
          return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
      }
      return Response.ok().build();
    }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/getAllStudents")
  public Response getAllStudents() {
    List<Student> students = null;
    try {
      students = studentService.getAllStudents();
    } catch (StudentException e) {
      return Response.status(Response.Status.NO_CONTENT).entity(e.getMessage()).build();
    }
    return Response.ok().entity(students).build();
  }

  @GET
  @Path("/getStudentByName")
  @Produces(MediaType.APPLICATION_JSON)
  public Response getStudentByName(@QueryParam("name") String name){
      List<Student> students = studentService.getStudentByName(name);
      return Response.ok().entity(students).build();
  }

  @GET
  @Path("/getPhonesByStudentId")
  @Produces(MediaType.APPLICATION_JSON)
  public Response getPhonesByStudentId(@QueryParam("id") Long id){
    List<Phone> phones = studentService.getPhonesByStudentId(id);

    return Response.ok().entity(phones).build();
  }

}
