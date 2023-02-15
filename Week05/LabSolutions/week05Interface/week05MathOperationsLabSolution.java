/*
 * Copyright (c) 2023 Promineo Tech
 * Author:  Promineo Tech Academic Team
 * Subject:  Week 05 Interface Lab 
 * Java Week 05 Interface Lab Solution
 */ 
package week05.week05Interface;

public class week05MathOperationsLabSolution {

	public static void main(String[] args) {
		/*
		 *  MathOperation Interface:
		 *  
		 *
		 *		1. Create an Interface called MathOperation with a method called evaluate that
		 * 			takes two doubles and returns a double.
		 *
		 * 		2. Create four implementing classes:
		 *					a. AdditionOperation
		 *					b. SubtractionOperation
		 * 					c. MultiplicationOperation
		 *					d. DivisionOperation
		 *
		 * 		3. Create a method that takes a MathOperation and two doubles as parameters 
		 *					and returns the result of calling the evaluate method on 
		 *					the MathOperation with the two doubles
		 *
		 *		4. Test your code
		 *
		 */
		
		System.out.println("-------------------------");
		System.out.println("Week 05 Interface Lab\n      Math Operations: ");
		
		System.out.println("-------------------------");
		System.out.println("Question 1: Create Interface");
		System.out.println("-------------------------");
		System.out.println("Question 2: Create Implementing Classes");		
		/*
		 * Instantiate your implementing classes here
		 */
		AdditionOperation adding = new AdditionOperation();
		SubtractionOperation subtracting = new SubtractionOperation();
		MultiplicationOperation multiplying = new MultiplicationOperation();
		DivisionOperation dividing = new DivisionOperation();
		
		
		System.out.println("-------------------------");
		System.out.println("Question 3: Create Method");
		System.out.println("-------------------------");
		System.out.println("Question 4: Test Your Code");
		/*
		 * Test your code here:
		 * 		- Declare two double variables
		 *      - Call your new method, with all 4 implementing classes
		 *      					  and the two variables.
		 *      - Don't forget to print out the result returned by the method
		 */

		double number1 = 3.5, number2 = 1.5;

		System.out.println("   Parameters:");
		System.out.println("\tParameter 1: " + number1);
		System.out.println("\tParameter 2: " + number2);
		
		/* 
		 * Calls to the method using implementing classes
		 */		
		System.out.println("   Results:");
		
		System.out.print("\t2a - Addition:  ");
		/*
		 * Put call to method using addition here
		 */
		System.out.println(operation(adding, number1, number2));

		System.out.print("\t2b - Subtraction:  ");
		/*
		 * Put call to method using subtraction here
		 */
		System.out.println(operation(subtracting, number1, number2));

		System.out.print("\t2c - Multiplication:  ");
		/*
		 * Put call to method using multiplication here
		 */
		System.out.println(operation(multiplying, number1, number2));

		System.out.print("\t2d - Division:  ");
		/*
		 * Put call to method using division here
		 */
		System.out.println(operation(dividing, number1, number2));

		System.out.println("-------------------------");

	}
	
	/*
	 * Method -- Question 3:
	 */
		private static double operation(MathOperation operation, double number1, double number2) {
			return operation.evaluate(number1, number2);
		}

}