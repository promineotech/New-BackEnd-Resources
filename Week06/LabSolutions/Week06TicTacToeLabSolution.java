//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Tic Tac Toe Game - Lab
// Java Week 06 Lab  
//
package week06;

import java.util.Scanner;

// This solution implements Tic Tac Toe in the following way:
//
//		1. The gameBoard is declared as an Object, GameBoard, and is an array of 9 spaces.
//					a. display() prints the gameBoard
//					b. initialize() puts the position numbers in each square
//					c. checkWinStatus() declares a winner or a draw if conditions match
//					d. ifValidSetSquare() will put an "X" or an "O" into the square if it's a valid choice
//		2. At the beginning, winner variable is set to "", and the game continues until 
//				winner is set to "X", "O" or "draw" (the condition is winner != ""
//		3. This solution has Error Checking -- see the checkInput() method.
//		4. Because we allow the loop to continue with invalid input, we need a variable allSquares
//				to be incremented when a Square is filled.  The game ends when a winner is declared, or 
//				we have filled all 9 squares.
//		5. There is a beginning message, and an ending message.
//		6. checkWinStatus() is checked after every turn.
// 

public class Week06TicTacToeLabSolution {

	static String winner = "";
	static String player = "";

	//
	// Error Checking:
	//			Validate that input is a valid Square Number in the gameBoard (1-9)
	// 
	private static boolean checkInput(String readInput) {
		String[] validInput = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		for (String letter : validInput) {
			if (readInput.equals(letter)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		// Open a Scanner to read User Input to Play the Game
		Scanner in = new Scanner(System.in);
		GameBoard gameBoard = new GameBoard();
		// Initialize the gameBoard, AND the necessary variables.
		gameBoard.initialize();
		int squareNumber;
		int allSquares = 1;
		player = "X";
		
		// Print out Game Information & the initial game board
		System.out.println();
		System.out.println("-------------------------");
		System.out.println(" Welcome to Tic Tac Toe!");
		System.out.println("    First Turn:  X ");
		System.out.println("-------------------------");
		System.out.println();
		
		// Print out the gameBoard
		gameBoard.display();
		
		// Game Loop -- keeps running until a winner or draw is declared!
		while (winner.equals("") && (allSquares <= 9)) {
			// To enter the X Or O at the exact place on gameBoard.
			System.out.println(player + "'s turn -- enter a number designating the square to place an " + player + " in:");
			String readInput = in.nextLine();
			if (checkInput(readInput)) {
				squareNumber = Integer.valueOf(readInput);
				if (squareNumber > 0 && squareNumber <= 9) {			
					if (gameBoard.ifValidSetSquare(squareNumber, readInput, player)) {
						if (player.equals("X")) {
							player = "O";
						} else {
							player = "X";
						}	
						allSquares++;
						gameBoard.display();
						winner = gameBoard.checkWinStatus();
					} else {
						System.out.println("Square has already been filled.");
					}
				}
			} else {
				System.out.println("Invalid input.");
			}
		} 
		
		// Print End Of Game Message!
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("  Game Over:");
		if (winner.equals("draw")) {
			System.out.println("  This game is a " + winner + "!");
		} else {
			System.out.println("              " + winner + " wins!");
		}
		System.out.println("-------------------------");

		// Close the Scanner once the game is done!
		in.close();
	}

}
