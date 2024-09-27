package springboot_boot_demo.controller;


import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot_boot_demo.beans.Student;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("students")
public class StudentController {

    static List<Student> students = new ArrayList<>();

    static {
        Student s1 = new Student(0, "naku", "teliyadhu");
        Student s2 = new Student(1, "naku", "telusu");
        students.add(s1);
        students.add(s2);
    }


    //  restapi  acts as api   localhost:8080/hello-world  -->  endpoint
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!!...";
    }


    //whenever you are working CRUD operations then database queries


    @GetMapping("")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok().body(students);
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentByID(@PathVariable("id") int studentID) {
        Student student = students.get(studentID - 1);
        return ResponseEntity.ok().body(student);
    }

    @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        //insert into students (fname,lname) values ();
        student.setId(students.size());
        students.add(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }


    @PutMapping("update/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable("id") int studentID) {
//        update students set() values() where id ='3';
        students.set(studentID, student);
        return ResponseEntity.ok(student);
    }


    @DeleteMapping("delete/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable("id") int studentID) {
        //delete student where id =2;
        Student student = students.remove(studentID);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }


}
