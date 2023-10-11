import java.util.*;
public class OneDimArrayAssign
{

	public static void main(String[] args)
	{
		// use the array below as the input array for the methods you write
		int[] myArray = {2,14,3,4,7,9,12,11,3,42,17,6,9,4};

			System.out.println(everyOtherSum(myArray, 2));
			reverseElements(myArray);
			printArray(myArray);
			int[] myArray2 = copyArray(myArray);
			printArray(myArray2);
			eightReplace(myArray);
			printArray(myArray);


		//System.out.println(reverseElements(myArray, 0));
		// Illustrate the functionality of your methods by calling them and doing appropriate printouts.
		// This should be here inside the main method.
		// I provided a method to print out the contents of an array.

	}


	/* Write a method that takes an array of integers as input and finds the sum of every other value starting
	with the first value in the array. Name the method everyOtherSum().
	*/
	public static int everyOtherSum(int[] someArray, int everyOtherWhat)
	{
		int tot=0;
		for(int i=0; i<someArray.length; i += everyOtherWhat)
		{
			tot += someArray[i];
		}
		return tot;
	}

	/*Write a method that takes an array of integers as input and replaces every value greater than 8 with the number 8
	Name the method eightReplace().
	*/
	public static void eightReplace(int[] someArray)
	{

		for(int i=0; i<someArray.length; i++)
		{
			if(someArray[i] > 8)
				someArray[i] = 8;
		}
	}
	/*Write a method that takes an array of integers as input and copies it into a new array and then returns the new array
	Name the method copyArray().
	*/
	public static int[] copyArray(int[] someArray)
	{
		int[] array2 = new int[someArray.length];
		for(int i=0; i<someArray.length; i++)
		{
			array2[i] = someArray[i];
		}
		return array2;
	}

	/*Write a method that takes an array of integers as input and reverses the elements in the array without using another array
	Name the method reverseElements().
	*/
	public static void reverseElements(int[] someArray)
	{
		for(int i = 0; i<(someArray.length/2); i++)
		{
			int holder = someArray[i];
			someArray[i] = someArray[someArray.length-(i+1)];
			someArray[someArray.length-(i+1)] = holder;
		}

		/*if(iteration<(someArray.length-2))
		{
			reverseElements(someArray, iteration + 1);
		}
		someArray[iteration] = someArray[someArray.length - (iteration+1)];

		/*if(iteration == 0)
		{
			return someArray;
		}*/
		//Collections.reverse(Arrays.asList(someArray));
		//System.out.println(Arrays.asList(someArray));
    //return (Arrays.asList(someArray));
	}

	public static void printArray(int[] someArray)
	{
		for(int i = 0; i < someArray.length; i++)
		{
			System.out.print(someArray[i] + "   ");
		}
		System.out.println();
	}

}
