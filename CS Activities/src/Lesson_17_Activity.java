import java.util.*;

public class Lesson_17_Activity
{
	public static void main(String[] args)
	{
		int[] test;
		test = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 10};
		// System.out.println("answer is " + isSorted(test));
		System.out.println(binarySearch(test, 8));
	}
	
	public static boolean isSorted(int[] a)
	{
		boolean flag = true;
		for(int i = 0; i < a.length - 1; i++ )
		{
			for(int j = i + 1; j < a.length; j++ )
			{
				// System.out.println(a[i] + " VS. " + a[j]);
				flag = (a[i] > a[j])? false: true;
				// System.out.println(flag);
				if(flag == false)
				{
					return flag;
				}
			}
		}
		return flag;
	}
	
	public static int binarySearch(int[] a, int x)
	{
		int answer = -1;
		
		if(isSorted(a) == true)
		{
			int length = a.length;
			int half = (a.length + a.length % 2) / 2;
			int minimum = a[0];
			int minIndex = 0;
			int maximum = a[length-1];
			int maxIndex = length-1;
			int median = a[length/2];
			int medIndex = length/2;
			
			System.out.println("minimum: " + minimum);
			System.out.println("median: " + median);
			System.out.println("maximum: " + maximum);
			System.out.println("length: " + length);
			System.out.println("half: " + half);
			
			if(x == maximum)
				answer = maxIndex;
			if(x == minimum)
				answer = minIndex;
			if(x == median)
				answer = medIndex;
			if(x < maximum && x > median)
			{
				
			}
			if(x < median && x > minimum)
			{
				
			}
		}
		
		return answer;
	}
}
