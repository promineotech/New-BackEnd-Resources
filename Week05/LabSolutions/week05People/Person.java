/*
 * Copyright (c) 2023 Promineo Tech
 * Author:  Promineo Tech Academic Team
 * Subject:  People OOP Lab
 * Java Week 05 People OOP Lab
 */
package week05.week05People;

public class Person {
	String firstName;	
	String lastName;
	int age;
	
	Person(String firstName, String lastName, int age) throws Exception {
		this.firstName = firstName;
		this.lastName = lastName;
		if (age < 120 && age > 0) {
			this.age = age;
		} else {
			throw new Exception(age + " is not a valid age.");
		}
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if (age < 120 && age > 0) {
			this.age = age;
		} else {
			throw new Exception(age + " is not a valid age.");
		}
		
	}


	public void describe() {
		System.out.println("My name is: " + this.firstName + " " + this.lastName);
		System.out.println("Age: " + this.age);
	}
}
