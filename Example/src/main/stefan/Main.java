package main.stefan;
import java.util.Scanner;
public class Main {
	
	/**
	 * @param args
	 */
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
//		 String str = "0123456789"; 
//		 int n = 1000000; 
//		 GFG.nPermute(str.toCharArray(), n);
		int[] myIntegers = getIntegers(5);
		for(int i = 0; i < myIntegers.length; i++) {
			System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
		}
		System.out.println("Average of numbers is: " + getAverage(myIntegers));
	}	
	
	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integer values.\r"	);
		int[] values = new int[number];
		
		for(int i = 0; i < number; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static double getAverage(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double)sum/(double)arr.length;
	}
}
