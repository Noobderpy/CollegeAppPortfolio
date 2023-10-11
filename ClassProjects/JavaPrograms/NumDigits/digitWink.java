import java.util.*;
class digitWink{
	public static void main(String args[])throws Exception{
    Scanner input = new Scanner(System.in);
    int even = 0;
    int odd = 0;
    int stoInt = 0;
    System.out.println("Enter Int: ");
    String stringInt = String.valueOf(input.nextInt());
    for(int x = 0; x < stringInt.length(); x++)
    {
      stoInt = Integer.valueOf(stringInt.substring(x, x+1));
      if(stoInt % 2 == 0)
        even++;
      else
        odd++;
    }
    System.out.println("Odd: " + odd + " Even: " + even);
  }
}
