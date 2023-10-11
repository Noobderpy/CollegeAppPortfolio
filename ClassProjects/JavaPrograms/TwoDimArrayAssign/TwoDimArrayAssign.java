


public class TwoDimArrayAssign
{

	public static void main(String[] args)
	{
		// use the array below as the input array for the methods you write
		int[][] myArray = {{1,3,5,7}, {2,4,6,8}, {1,2,5,7}, {6,5,2,1}, {6,7,8,9}}; // 5 rows and 4 columns
		int[] myArray2 = {1, 1, 1, 1};
		printArray(findElement(myArray, 9));
		printArray(rowSums(myArray));
		printArray(colSums(myArray));
		printArray(sumOddCols(myArray));
		printArray(copy(myArray));
		printArray(appendRow(myArray, myArray2));


		// Illustrate the functionality of your methods by calling them and doing appropriate printouts.
		// This should be here inside the main method.
		// I provided a method to print out the contents of an array.


	}

	/* Write a method that takes a two-dimensional array of integers and
	a value as input and then returns the index of the item. Name the method findElement().
	*/
	public static int[] findElement(int[][] a, int findNum)
	{
		int[] xy = {-1, -1};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(a[i][j] == findNum)
				{
					xy[0] = i;
					xy[1] = j;
					return xy;
				}
			}
		}
		return xy;
	}

	/* Write a method that takes a two-dimensional array of integers
	as input and returns a one-dimensional array of integers containing the row sums. Name the method rowSums().
	*/
	public static int[] rowSums(int[][] a)
	{
		int[] rowSums = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			rowSums[i] = 0;
			for(int j=0; j<a[i].length; j++)
			{
				rowSums[i] += a[i][j];
			}
		}
		return rowSums;
	}

	/* Write a method that takes a two-dimensional array of integers
	as input and returns a one-dimensional array of integers containing the column sums. Name the method colSums().
	*/
	public static int[] colSums(int[][] a)
	{
		int[] colSums = new int[a[0].length];
		for(int i=0; i<a[0].length; i++)
		{
			colSums[i] = 0;
			for(int j=0; j<a.length; j++)
			{
				colSums[i] += a[j][i];
			}
		}
		return colSums;
	}

	/* Write a method that takes a two-dimensional array of integers
	as input and returns a one-dimensional array of integers containing the odd-numbered column sums.
	Name the method sumOddCols().
	*/
	public static int[] sumOddCols(int[][] a)
	{
		int[] colSums = new int[a[0].length];
		for(int i=0; i<a[0].length; i+=2)
		{
			colSums[i] = 0;
			for(int j=0; j<a.length; j++)
			{
				colSums[i] += a[j][i];
			}
		}
		return colSums;
	}
	/* Write a method that takes a two-dimensional array of integers as
	input and copies the values into a new two-dimensional array and returns the new array.
	Name the method copy().
	*/
	public static int[][] copy(int[][] a)
	{
		int[][] copyArray = new int[a.length][a[0].length];
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j<a[i].length; j++)
			{
				copyArray[i][j] = a[i][j];
			}
		}
		return copyArray;
	}

	public static int[][] appendRow(int[][] a, int[] a2)
	{
		int[][] appendedRow = new int[a.length + 1][a[0].length];
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				appendedRow[i][j] = a[i][j];
			}
		}
		for(int i = 0; i < appendedRow[0].length; i++)
		{
			appendedRow[a.length][i] = a2[i];
		}
		return appendedRow;
	}

	public static void printArray(int[][] someArray)
	{
		for(int i = 0; i < someArray.length; i++)
		{
			for(int j = 0; j < someArray[0].length; j++)
			{
				System.out.print(someArray[i][j] + "   ");
			}
			System.out.println();
		}
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
