import java.util.Scanner;
public class Numbers
{
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
public static void main (String[] args)
{
	Comparable[] intList;
	int size;
	Scanner scan = new Scanner(System.in);
	System.out.print ("\nHow many integers do you want to sort? ");
	size = scan.nextInt();
	intList = new Comparable[size];
	System.out.println ("\nEnter the numbers...");
	for (int i = 0; i < size; i++)
		intList[i] = scan.nextInt();
	
    //Sorting.selectionSort(intList);
    Sorting.insertionSort(intList);
	System.out.println ("\nYour numbers in sorted order...");

	for (int i = 0; i < size; i++)
		System.out.print(intList[i] + " ");
	
	}
}