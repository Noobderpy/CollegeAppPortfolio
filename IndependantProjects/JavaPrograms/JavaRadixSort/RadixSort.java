import java.util.*;
class RadixSort{
	public static void main(String args[])throws Exception{
    final int ARRAYSIZE = 1000000;
    final int MAXNUM = 1000000;

    int[] sortArray = new int[ARRAYSIZE];
		randomizeArray(sortArray, MAXNUM);
    sort(sortArray);
    printArray(sortArray);
  }

  public static void randomizeArray(int[] a, int maxNum)
  {
    for(int i=0; i<a.length; i++)
    {
			Random rng = new Random();
      a[i] = rng.nextInt(maxNum);
    }
  }

  public static void sort(int[] a)
  {
		int maxDigit = Integer.toString(findMax(a)).length();
		for(int i=1; i <= maxDigit; i++)
		{
			int[] countArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			int[] copy = new int[a.length];
			for(int j=0; j < a.length; j++)
			{
				String num = Integer.toString(a[j]);
				if(i <= num.length())
				{
					countArray[Integer.parseInt(String.valueOf(num.charAt(num.length() - i)))]++;
				}
				else
				{
					countArray[0]++;
				}
			}
			countArray[0]--;
			rollingSum(countArray);
			for(int j = a.length; j >= 1; j--)
			{
				String num = Integer.toString(a[j - 1]);
				int holder = 0;
				if(i <= num.length())
				{
					holder = Integer.parseInt(String.valueOf(num.charAt(num.length() - i)));
				}
				copy[countArray[holder]] = a[j - 1];
				countArray[holder]--;
			}
			copyArray(copy, a);
		}
  }

	public static void copyArray(int[] copy, int[] a)
	{
		for(int i = 0; i<copy.length; i++)
		{
			a[i] = copy[i];
		}
	}

	public static int findMax(int[] a)
	{
		int max = a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i] > a[0])
			{
				max = a[i];
			}
		}
		return max;
	}

	public static void rollingSum(int[] a)
	{
		for(int i=1; i<a.length; i++)
		{
			a[i] = a[i] + a[i-1];
		}
	}

	public static void printArray(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
