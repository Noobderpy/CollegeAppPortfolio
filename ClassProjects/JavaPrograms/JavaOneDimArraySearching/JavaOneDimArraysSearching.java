import java.util.Random;
import java.util.Scanner;

public class JavaOneDimArraysSearching
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		Scanner scanObject = new Scanner(System.in);

		// declare and initialize some arrays
		int[] myArray1 = new int[10];
		String[] myArray2 = {"this", "is", "a", "story", "about", "a", "man", "named", "jed"};
		int[] mySortedArray = {2, 5, 7, 12, 15, 23, 45, 74, 89};
		String[] mySortedArray2 = {"apple", "butter", "candy", "dog", "elephant"};


		// fill the array with random values between 1 and the length of the array, there may be duplicates in the array
		for(int i = 0; i < myArray1.length; i++)
		{
			myArray1[i] = generator.nextInt(myArray1.length + 1);
		}


		// print out the contents of the array
		printArray(myArray1);
		System.out.println();


		// Now we will do a linear search on an array to find the index of an item the user would like to find.
		System.out.println("What integer between 1 and 10 would you like to search for in my array?");
		int yourInteger = scanObject.nextInt();
		int theIndex = linearSearch1(myArray1, yourInteger);
		System.out.println("The index of " + yourInteger + " is " + theIndex + " . ");



		// Below is a linear search on an array in which we return a reference to the object we are looking for instead of the index.
		// Of course, this only applies to arrays that contain objects
		String theFoundObject = linearSearch2(myArray2, "man");
		System.out.println("The object we found is " + theFoundObject);



		// Below is a binary search on an array to find the index of an item the user would like to find.
		System.out.println("Which of the following numbers would you like to find? 2, 5, 7, 12, 15, 23, 45, 74, 89");
		yourInteger = scanObject.nextInt();
		theIndex = binarySearch(mySortedArray, yourInteger);
		System.out.println("The index of " + yourInteger + " is " + theIndex + " . ");

		theIndex = binarySearch2(mySortedArray2, "butter");
		System.out.println("The index of " + "butter" + " is " + theIndex + " . ");
	}


	public static void printArray(int[] someArray)
	{
		for(int i = 0; i < someArray.length; i++)
		{
			System.out.print(someArray[i] + "   ");
		}
	}


	public static int linearSearch1(int[] someArray, int target)
	{
		int index = -1; // default value for index in the array

		for(int i = 0; i < someArray.length; i++)
		{
			if(someArray[i] == target)
			{
				index = i;
				break;
			}
		}
		return index;
	}


	public static String linearSearch2(String[] someArray, String target)
	{
		String foundObject = null; // default value for index in the array

		for(int i = 0; i < someArray.length; i++)
		{
			if(someArray[i].equals(target))
			{
				foundObject = someArray[i];
				break;
			}
		}
		return foundObject;
	}

	// Below is a binary search. How does it work? Why does it work? What are pre-requisites for it to work properly?
	public static int binarySearch(int[] someArray, int target)
	{
		int count = 0;

		int index = -1; // default value for index in the array
		int upper = someArray.length - 1;
		int lower = 0;
		int middle = (lower + upper) / 2; // the reference point for the search that will be updated every loop cycle
		boolean notFound = true;

		while(notFound && middle >= 0 && middle <= someArray.length)
		{
			count++;

			if(someArray[middle] < target)
				lower = middle + 1;
			else
				if(someArray[middle] > target)
					upper = middle - 1;
				else
				{
					notFound = false;
					index = middle;
				}
			System.out.println("So far, we have done " + count + " comparisons.");
			middle = (lower + upper) / 2;
		}
		return index;
	}

	public static int binarySearch2(String[] someArray, String target)
	{
		int count = 0;

		int objFound = -1; // default value for index in the array
		int upper = someArray.length - 1;
		int lower = 0;
		int middle = (lower + upper) / 2; // the reference point for the search that will be updated every loop cycle
		boolean notFound = true;

		while(notFound && middle >= 0 && middle <= someArray.length)
		{
			count++;

			if(someArray[middle].compareTo(target) < 0)
				lower = middle + 1;
			else
				if(someArray[middle].compareTo(target) > 0)
					upper = middle - 1;
				else
				{
					notFound = false;
					objFound = middle;
				}
			System.out.println("So far, we have done " + count + " comparisons.");
			middle = (lower + upper) / 2;
		}
		return objFound;
	}


}
