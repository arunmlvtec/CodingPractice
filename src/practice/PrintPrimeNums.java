/**
 * n prime number less than n
 * 
 * input: positive integer n output: arraylist of integers from 1 to n (n
 * exclusive) n = 21 loop through 2 to < 21. for i = 2 isPrime(2)
 * 
 * check for 2 as n.
 */
package practice;

import java.util.*;

public class PrintPrimeNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> out = storePrimeNums(n);
		for (int i : out) {
			System.out.println(i);
		}
		sc.close();
	}

	public static ArrayList<Integer> storePrimeNums(int n) {
		if (n <= 1)
			return null;
		ArrayList<Integer> out = new ArrayList<Integer>();

		for (int i = 2; i < n; i++) {
			if (isPrime(i, out))
				out.add(i);
		}

		return out;
	}

	public static boolean isPrime(int k, ArrayList<Integer> out) {
		for (int i : out) {
			if (k % i == 0) {
				return false;
			}
		}
		return true;
	}
}