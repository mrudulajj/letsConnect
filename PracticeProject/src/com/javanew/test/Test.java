package com.javanew.test;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	// paranthisis problem (check karna hai dono side same hai k nahi)

	public static void main(String[] args) {
		System.out
				.println("----------------------------------start--------------------------------");
		// Input: exp = “[()]{}{[()()]()}” Output: Balanced
		// Input: exp = “[(])” Output: Not Balanced

		System.out.println("Input do");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Boolean b = isBallenced(input);

		if (b) {
			System.out.println("given string is balanced");
		} else {
			System.out.println("not balanced ");
		}

		System.out.println("--------------------------------fin------------------------------------------");
	}

	public static boolean isBallenced(String val) {

		Stack<Character> stack = new Stack<>();

		for (char bracket : val.toCharArray()) {
			System.out.println("wanted to test kya aata hai isme ..... " + bracket);

			if (bracket == '[' || bracket == '{' || bracket == '(') {
				stack.push(bracket);
			} else if (bracket == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if (bracket == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}
			else if (bracket == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}
			else {
				return false;
			}

		}

		return stack.isEmpty();
	}

}
