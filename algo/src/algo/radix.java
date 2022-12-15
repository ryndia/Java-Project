package algo;

public class radix{
	
	public static int[] countsort(int[] arr, int exp)
	{
		int[] output = new int[arr.length];
		int max = 0, min = 1000000000;
		for(int i = 0; i< arr.length; i++){
			if(((arr[i]/exp) % 10)> max){max = ((arr[i]/exp) % 10);}
			if(((arr[i]/exp) % 10)< min){min = ((arr[i]/exp) % 10);}
		}
		int range[] = new int[max - min + 1];
		
		for(int i = 0; i< arr.length; i++){
			range[((arr[i]/exp) % 10)- min]++;
		};
		
		for(int i = range.length-1;i>=1; i--){
			range[i] = range[i-1];
		}
		range[0] = 0;
		
		for(int i = 1; i< range.length; i++){
			range[i] = range[i] + range[i-1];
		}

		for(int i = 0; i< arr.length; i++){
			output[range[((arr[i]/exp) % 10) - min]]= arr[i];
			range[((arr[i]/exp) % 10)- min]++;
		}
		
		for(int i = 0; i< output.length; i++)
		{
			System.out.print(output[i] + " ");
		}
		System.out.print("\n");
		return output;
	}
	
	static public void radixsort(int[] arr)
	{
		int max = 0;
		for(int i = 0; i< arr.length; i++){
			if(arr[i]> max){max = arr[i];}
		}
		for(int exp = 1; max/exp > 0; exp*=10)
		{
			arr = countsort(arr, exp);
		}
	}
	
	static public void main(String[] args)
	{
		int arr[] = new int[5];
		arr[0] = 110;
		arr[1] = 16;
		arr[2] = 520;
		arr[3] = 23;
		arr[4] = 2;
		radixsort(arr);
	}
}