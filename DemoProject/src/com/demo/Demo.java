package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		System.out.println("hello world");
		Student student = new Student();
		student.setFirstname("eclipse");
		student.setStudentId(101);
		List<String> list =  new ArrayList<String>();
		list.add("vani");
		list.add("shilpa");
		list.add("jothi");
		list.add(student.toString());
		System.out.println(list);
	}

}
