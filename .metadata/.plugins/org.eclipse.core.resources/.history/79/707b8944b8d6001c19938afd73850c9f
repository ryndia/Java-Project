package algo;

public class fibonacci {
	
	public static int fibo(int x, int[] arr)
	{
		if(x == 1 || x == 0)
		{
			return 1;
		}
		if(arr[x] != 0)
		{
			return arr[x];
		}
		int temp =  fibo(x-1,arr) + fibo(x-2,arr);
		arr[x] = temp;
		return temp;
	}
	
	public static void main(String args)
	{
		int x = 5;
		int arr[] = new int[x+1];
		int result = fibo(10,arr);
		System.out.print(result);
	}
}