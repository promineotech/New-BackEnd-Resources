/*
 * Copyright (c) 2023 Promineo Tech
 * Author:  Promineo Tech Academic Team
 * Subject:  People OOP Lab
 * Java Week 05 People OOP Lab Solution 
 */
package week05.week05People;

public class Week05PeopleLabSolution {

	public static void main(String[] args) throws Exception {

		
		System.out.println("-------------------------");
		System.out.println("Week 05 Object Lab\n    Class Creation: ");
		
		System.out.println("-------------------------");
		/*
		 *  1. Person Class:	
		 *		Create a class called Person with fields firstName, lastName, and age. 
		 * 			Make sure any age assigned must be valid (i.e. non negative and < 120)
		 */
		System.out.println("\nQuestion 1: Create Class & Instantiate\n ");
		
		/*
		 * Instantiate Person objects here
		 */
		
		try {
			Person invalidPerson1 = new Person("No", "Person", -1);
			invalidPerson1.describe();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Person invalidPerson2 = new Person("No", "Person", 140);
			invalidPerson2.describe();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Person validPerson;
		try {
			validPerson = new Person("A", "Person", 110);
			System.out.println();
			validPerson.describe();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		 *  2. Declare 2 Instances of Person:
		 *		Create 2 different instances of Person with different values for the fields.
		 */
		System.out.println("-------------------------");
		System.out.println("\nQuestion 2: Instantiate & call describe(): \n");

		/*
		 * Instantiate the object & call describe() here
		 */
		Person person1 = new Person("John", "Jones", 18);
		person1.describe();
		Person person2 = new Person("Mary", "Mallow", 22);
		System.out.println();
		person2.describe();

		
		
		/*
		 *  3. Who is Older?
		 *
		 *		Create and test a method that takes a two Persons and returns the firstName
		 * 			of the Person who is older.
		 */
		System.out.println("-------------------------");
		System.out.println("\nQuestion 3: Create & call a method  \n");
		System.out.println("The older person is:\n-------------------");

		/*
		 * Call to the new method here
		 */
		Person olderPerson = findOlder(person1, person2);
		olderPerson.describe();
		System.out.println("-------------------------");
	
	}

	/* 
	 * Method -- Question 3:
	 */
	private static Person findOlder(Person person1, Person person2) {
		if (person1.getAge() > person2.getAge()) {
			return person1;
		} else {
			return person2;
		}
	}

}
