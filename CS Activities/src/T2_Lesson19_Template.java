
/*
 * Lesson 19 - Unit 8 - 2-D Array
 */

import java.io.*;

class T2_Lesson19_Template
{

	public static void randomizeScores(int ts[][])
	{
		for (int y = 0; y < ts.length; y++)
		{
			for (int x = 0; x < ts[0].length; x++)
			{
				ts[y][x] = (int) (40 * Math.random() + 60);
			}
		}
	}

	public static void print(int ts[][])
	{
		for (int y = 0; y < ts.length; y++)
		{
			for (int x = 0; x < ts[0].length; x++)
			{
				System.out.print(ts[y][x] + "\t");
			}
			System.out.println();
		}
	}

	public static void calcAverages(int ts[][], double a[])
	{
		for (int i = 0; i < ts.length; i++)
		{
			double sum = 0;
			for (int c = 0; c < ts[0].length; c++)
			{
				sum += ts[i][c];
			}
			a[i] = sum / ts[0].length;
		}
	}

	public static void printAvg(double a[])
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "\t");
		}
	}

	public static boolean improving(int a[])
	{
		for (int i = 1; i < a.length; i++)
		{
			if (a[i] <= a[i - 1])
			{
				return false;
			}
		}
		return true;
	}

	public static void studentsImproving(int ts[][], boolean[] b)
	{
		for(int i = 0; i < ts.length; i++)
		{
			b[i] = improving(ts[i]);
		}
	}
	
	public static void printImprove(boolean []b)
	{
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i] + "\t");
		}
	}
	
	public static double averageTest(int ts[][], int x)
	{
		double sum = 0;
		double average;
		
		for(int i = 0; i < ts.length; i++)
		{
			sum += ts[i][x-1];
		}
		average = (sum/ts.length);
		return average;
	}

	public static void main(String str[]) throws IOException
	{
		int grid[][] = new int[25][4];
		double average[] = new double[25];
		boolean better[] = new boolean[25];

		print(grid);
		randomizeScores(grid);
		System.out.println("Randomized: ");
		print(grid);
		calcAverages(grid, average);
		System.out.println("Averages: ");
		printAvg(average);
		studentsImproving(grid, better);
		System.out.println("\nImproving? ");
		printImprove(better);
		for(int i = 1; i <= grid[0].length; i++)
		{
			System.out.println("\nAverage for Test #" + i + " :\n" + averageTest(grid, i));
		}
	}

}

/*
 * 0 1 2 3 0 00 01 02 03 1 10 11 12 13 2 20 21 22 23 3 30 31 32 33
 * 
 * int grid [] [] = new int [4] [3]; // [rows] [columns]
 * 
 * grid [1][2] = 7; grid [2][0] = 19;
 * 
 */