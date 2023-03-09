//needed for scanner
import java.util.Scanner;
import java.io.*;
//creating class file
public class McShaneBrendanQuestion1
{
	public static void main(String[] args) throws IOException //used for file reading
	{
		//file object
		File words = new File("words.txt");
		Scanner inputFile = new Scanner(words);

		Scanner keyboard = new Scanner(System.in); //keyboard input

		//creating array
		String[] lines = new String[1000];

		//for loop for printing array
		for(int i =0; i<=999; i++)
		{
			lines[i] = inputFile.nextLine();
			System.out.println(lines[i]);
		}

	}
}