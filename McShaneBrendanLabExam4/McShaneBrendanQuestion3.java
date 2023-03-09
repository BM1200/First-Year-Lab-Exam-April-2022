import java.util.Scanner;
public class McShaneBrendanQuestion3
{
	public static void main(String[] args)
	{
		//creating scanner
		Scanner keyboard = new Scanner(System.in);


		//getting fr=irst value
		System.out.print("Enter first value for 2D array: ");
		int first = keyboard.nextInt();


		int[][] table = {{first, first+1, first+2}, {first+3, first+4, first+5},{first+6,first+7,first+8}};

		//for lop for table
		for(int i = 0; i<table.length; i++)
		{

			System.out.println();
			System.out.print("Row "+i+ ": ");

			for(int j = 0; j<table[0].length; j++)
			{
				System.out.print( table[i][j] +"	");
			}


		}
		//used for editing rows
		System.out.println();
		System.out.println("Enter row to edit:");
		int row = keyboard.nextInt();
		System.out.println("Enter column to edit:");
		int column = keyboard.nextInt();

		//entering new value for row
		System.out.println();
		System.out.println("Enter new value row for row ");
		int value = keyboard.nextInt();

		System.out.println("The new element for that row is: " + value);

		table[row][column] = value;


		//for loop
		for(int y = 0; y<table.length; y++)
		{

			System.out.println();
			System.out.print("Row "+y+ ": ");

			for(int x = 0; x<table[0].length; x++)
			{
				System.out.print( table[y][x] +"	");
			}


		}

	}
}