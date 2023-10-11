import java.util.Scanner;
import java.lang.Math;
public class TriangleDrew
{
	public static void main(String[] args)
	{
    Scanner input = new Scanner(System.in);
		int length1, length2, length3;
		boolean right = false;
		boolean real = false;
		System.out.println("Enter 3 side lengths: ");
		length1 = input.nextInt();
		length2 = input.nextInt();
		length3 = input.nextInt();

		if((Math.pow(length1, 2) + Math.pow(length2, 2)) == Math.pow(length3, 2) || (Math.pow(length3, 2) + Math.pow(length2, 2)) == Math.pow(length1, 2) || (Math.pow(length1, 2) + Math.pow(length3, 2)) == Math.pow(length2, 2))
		{
			right = true;
		}
		if((length1 + length2) > length3 && (length3 + length2) > length1 && (length1 + length3) > length2)
		{
			real = true;
		}
		System.out.println("The side lengths can create a right triangle: " + right);
		System.out.println("The side lengths can create a triangle: " + real);
	}
}
