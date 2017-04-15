public class Lesson_15_Activity {

	public static void main(String[] args) {
		String[] list = { "against", "forms", "belief", "government", "democratic", "movement", "understanding" };
		sortAndPrint(list);
	}

	public static void sortAndPrint(String[] list) 
	{
		int min;
		String temp;

		for (int i = 0; i < list.length - 1; i++) 
		{
			min = i;
			for (int j = i + 1; j < list.length; j++) 
			{
				if (list[min].compareTo(list[j]) >= 0)
				{
					min = j;
				}
			}
			temp = list[min];
			list[min] = list[i];
			list[i] = temp;

		}
		for (int i = 0; i <list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
	}

}
