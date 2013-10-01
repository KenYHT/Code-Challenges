package evernote;

import java.io.*;

public class Solution {
	int n; //number of elements in the array
	int inputArray[]; //array of inputs
	
	public Solution() {
		n = 0;
		inputArray = null;
	}
	
	public static void main(String args[]) throws Exception {
		Solution solution = new Solution();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		solution.n = Integer.parseInt(in.readLine());
		solution.inputArray = new int[solution.n];
		int product = 1;
		
		for (int i = 0; i < solution.n; i++) {
			int input = Integer.parseInt(in.readLine());
			solution.inputArray[i] = input;
			product *= solution.inputArray[i];
		}
		
		for (int i = 0; i < solution.n; i++) {
			solution.inputArray[i] = product / solution.inputArray[i];
			System.out.println(solution.inputArray[i]);
		}
	}
}
