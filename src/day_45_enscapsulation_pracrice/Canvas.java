package day_45_enscapsulation_pracrice;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setName("Java Programming");
		
		List<String> teachers = new ArrayList<>();
		teachers.add("Vasya");
		teachers.add("Muradil");
		teachers.add("Muhtar");
		teachers.add("John");
		
		course1.setTeachers(teachers);
		System.out.println(course1.toString());
		
		
		List<String> students = new ArrayList<>();
		students.add("Mila");
		students.add("Lina");
		students.add("Ruslan");
		students.add("Vika");
		
		course1.setStudents(students);
		System.out.println("**************");
		System.out.println(course1.toString());
		
		course1.addTeacher("Maria");
		course1.addStudent("JohnLee");
		
		if (course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		if (course1.getStudents().contains("JohnLee")) {
			System.out.println("JohnLee is a student");
		}else {
			System.out.println("JohnLee is not a student");
		}
		
		System.out.println("*************");
		
		course1.removeTeacher("Murodil");
		course1.removeStudent("Ruslan");
		
		if (!course1.getTeachers().contains("Murodil")) {
			System.out.println("Murodil is removed succesfully");
		}else {
			System.out.println("Murodil is still a teacher");
		}
		
		if (!course1.getStudents().contains("Ruslan")) {
			System.out.println("Ruslan is removed succesfully");
		}else {
			System.out.println("Ruslan is still a student");
		}
		}
	}

