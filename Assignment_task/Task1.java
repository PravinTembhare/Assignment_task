package com.Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
private int rollno;
private String name;
private double marks;

	public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getMarks() {
	return marks;
}

public void setMarks(double marks) {
	this.marks = marks;
}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.rollno-this.rollno;
	}
}
	
public class Task1 {
public static void main(String[] args) {
	List<Student> sl=new ArrayList<>();
	Student Student_1=new Student();
	Student_1.setRollno(1);
	Student_1.setName("Pravin");
	Student_1.setMarks(100);
	
	Student Student_2=new Student();
	Student_2.setRollno(2);
	Student_2.setName("Raj");
	Student_2.setMarks(150);
	
	Student Student_3=new Student();
	Student_3.setRollno(3);
	Student_3.setName("Virat");
	Student_3.setMarks(170);
	sl.add(Student_1);
	sl.add(Student_2);
	sl.add(Student_3);
	Collections.sort(sl);
	for(Student s:sl) {
		System.out.println("Roll no "+s.getRollno());
		System.out.println("Name "+s.getName());
		System.out.println("Marks "+s.getMarks());
		System.out.println("-------------------------------------");
	}
	
}
}
