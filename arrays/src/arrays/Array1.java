package arrays;
import java.util.Scanner;

public class Array1 
{
	public static void main(String[] args)
	{
		

		Scanner s = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = s.nextInt();
		int array[] = new int[size];

		System.out.println("Enter array elements");
		int i;
		for (i = 0; i < size; i++)
		{
			array[i] = s.nextInt();
		}

		
		System.out.println("Array elements are");

		for (i = 0; i < size; i++) 
		{
			System.out.println(array[i]);
		}
	}
}
