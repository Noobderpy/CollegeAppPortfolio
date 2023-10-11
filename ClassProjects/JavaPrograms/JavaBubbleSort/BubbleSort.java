import java.util.*;
public class BubbleSort{
	public static void main(String args[])throws Exception{
    final int ARRAYSIZE = 100;
    final int MAXNUM = 2147483647;
    int[] sortArray = new int[ARRAYSIZE];
    randomizeArray(sortArray, MAXNUM);
    sort(sortArray);
    printArray(sortArray);

  }

  public static void randomizeArray(int[] a, int maxNum)
  {
    Random rng = new Random();
    for(int i=0; i<a.length; i++)
    {
      a[i] = rng.nextInt(maxNum);
    }
  }

  public static void sort(int[] a)
  {
    int holder = 0;
    int runs = 0;
    while(!sorted(a))
    {
      runs++;
      for(int i = 0; (i+runs) < a.length; i++)
      {
        if(a[i] > a[i+1])
        {
          printArray(a);
          holder = a[i];
          a[i] = a[i+1];
          a[i+1] = holder;

        }
      }
    }
  }

  public static boolean sorted(int[] a)
  {
    boolean sorted = true;
    for(int i = 0; (i+1) < a.length; i++)
    {
      if(a[i] > a[i+1])
      {
        sorted = false;
        break;
      }
    }
    return sorted;
  }

  public static void printArray(int[] a)
  {
    for(int i=0; i< a.length; i++)
    {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
}
