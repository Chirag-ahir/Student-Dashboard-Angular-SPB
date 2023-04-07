package com.miit.student.controller;

//learn from here: https://www.youtube.com/watch?v=fUNyaKDgJd4&list=PLZTETldyguF0ogvkEzN-p6b73dXgCBhn9&index=18&ab_channel=LearnProgrammingYourself
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miit.student.model.Student;
import com.miit.student.service.StudentService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/registerStudent")
	public Student registerStudent(@RequestBody Student student) {
		return studentService.registerStudent(student);
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents(){
		return studentService.getStudents();		
	}
	
	@DeleteMapping("/deleteStudent")
	public void deleteStudent(@RequestParam Integer id) {
		studentService.deleteStudent(id);
	}
	
	@PutMapping("/updateStudents")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
}
