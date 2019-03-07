/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: Mar 04 2018
 * Created for: ICS4U
 * comment
 *
 ****************************************************************************/

import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {
		// user input
		System.out.println("Enter a number:");
		
		Scanner userInput = new Scanner(System.in);
		int userNum = userInput.nextInt();
		
		//gets input from user for stack
		MrCoxallStack userStack = new MrCoxallStack();
		
		System.out.println(userStack.push(userNum) + userStack.print());
	}
}
