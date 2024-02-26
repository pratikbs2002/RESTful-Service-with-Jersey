package com.example;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/students")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentResource {

    private static List<Student> students = new ArrayList<>();
    // Student student = new Student(1, "Pratik", 90);

    // public StudentResource() {
    // students.add(student);
    // }

    @GET
    public List<Student> getStudents() {
        return students;
    }

    @POST
    public void addStudent(Student student) {
        students.add(student);
    }

    @PUT
    @Path("/{id}")
    public void updateStudent(@PathParam("id") int id, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.set(i, updatedStudent);
                return;
            }
        }
        throw new NotFoundException("Student with ID " + id + " not found");
    }

    @DELETE
    @Path("/{id}")
    public void deleteStudent(@PathParam("id") int id) {
        Student foundStudent = null;
        for (Student student : students) {
            if (student.getId() == id) {
                foundStudent = student;
                break;
            }
        }
        if (foundStudent != null) {
            students.remove(foundStudent);
        } else {
            throw new NotFoundException("Student with ID " + id + " not found");
        }
    }
}
