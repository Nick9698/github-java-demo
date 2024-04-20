package com.nick;

import com.entities.Student;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Hello World !!!\n");
		Student s1 = new Student(1645079, "Nikhil");
		System.out.println(s1.getRollNo());
		System.out.println(s1.getName());
	}

}
