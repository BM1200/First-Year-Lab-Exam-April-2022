import java.util.Scanner;
public class McShaneBrendanQuestion2
{
	public static void main(String[] args)
	{
		//creating scanner
		Scanner keyboard = new Scanner(System.in);




		//creating array
		int[] numDays = new int[7];

		//for loop
		for(int i =0; i<numDays.length; i++)
		{
			int total=0;

			//asking for number of customers per day
			System.out.println("Enter number of customers for day " + i);
			numDays[i] = keyboard.nextInt();

			System.out.println(numDays[i]);
			total ++;
			total = numDays[i];
			System.out.println("The total is: " + total);

		}

	}
}