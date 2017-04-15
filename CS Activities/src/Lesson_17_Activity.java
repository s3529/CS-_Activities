
public class Lesson_17_Activity {
	
	public static void main(String[] args)
	{
		int[] test;
		test = new int[]{1, 2, 3, 4, 5};
		//System.out.println("answer is " + isSorted(test));
		System.out.println(binarySearch(test, 2));
	}

	public static boolean isSorted(int[] a)
	{
		boolean flag = true;
		for(int i = 0; i<a.length-1; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				//System.out.println(a[i] + " VS. " + a[j]);
				flag = (a[i]>a[j])? false : true;
				//System.out.println(flag);
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
		int min = 0;
		int max = a.length-1;
		int mid = (a.length-1)/2;
		int[] recursion = new int[(a.length-1)/2];
		if(isSorted(a) == true)
		{
			if(x == a[mid])
			{
				return mid;
			}
			else if(x == a[max])
			{
				return max;
			}
			else if(x == a[min])
			{
				return min;
			}
			else if(x > a[mid] && x < a[max])
			{
				for(int i = mid; i < max; i++)
				{
					recursion[i] = a[i];
				}
				binarySearch(recursion, x);
			}
			else if(x < a[mid] && x > a[min])
			{
				for(int i = min; i < mid; i++)
				{
					recursion[i] = a[i];
				}
				binarySearch(recursion, x);
			}
			else
			{
				return -1;
			}
			
		}
		else
		{
			for(int i = 0; i < a.length; i++)
			{
				if(a[i] == x)
					return i;
			}
		}
		return -1;
	}
}
