package arrays;//sorting in ascending order
import java.util.Scanner;

class Array9 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = s.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter array elements");
		int i;
		for (i = 0; i < size; i++)
		{
			arr[i] = s.nextInt();
		}

		System.out.println("Before sorting array elements are");

		for (i = 0; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}

		int j, t;
		for (i = 0; i < size - 1; i++)
		{
			for (j = i + 1; j < size; j++)
			{
              //replace > with < in if loop we get sorting in descending order 

				if (arr[i] > arr[j]){
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}

		System.out.println("\nAfter sorting array elements are");

		for (i = 0; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}