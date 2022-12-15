package algo;

import java.util.Scanner;

public class fibo {
	
	static int fibonacci(int num, Integer[] arr)
	{
		if(num == 0 || num == 1)
		{
			return 1;
		}
		if(arr[num]!= null)
		{
			return arr[num];
		}
		arr[num]=  fibonacci(num-2, arr) + fibonacci(num-1, arr);
		return arr[num];
	}
	
	public static void main(String[] args)
	{
		int num;
		System.out.print("Enter a number: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		Integer[] arr = new Integer[num +1];
		int fib = fibonacci(num,arr);
		System.out.println("fibonacci Number: "+ fib);
	}
}
