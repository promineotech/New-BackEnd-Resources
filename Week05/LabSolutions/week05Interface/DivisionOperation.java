/*
 * Copyright (c) 2023 Promineo Tech
 * Author:  Promineo Tech Academic Team
 * Subject:  Week 05 Interface Lab 
 * Java Week 05 Interface Lab Solution
 */ 
package week05.week05Interface;

public class DivisionOperation implements MathOperation {

	@Override
	public double evaluate(double num1, double num2) {
		return num1/num2;
	}

}
