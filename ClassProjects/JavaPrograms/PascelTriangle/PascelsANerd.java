class PascelsANerd{
	public static void main(String args[])throws Exception{

    printArray(pascel(3));

  }

	public static int[] pascel(int n)
	{
		int[] output = new int[n+1];
		if(n==0)
		{
			output[0] = 1;
			return output;
		}
			for(int i=0; i<output.length; i++)
			{
				if(i > 0 && i < n)
				{
					output[i] = makeRow(n - 1, i) + makeRow(n - 1, i-1);
				}
				else if(i == 0)
				{
					output[i] = makeRow(n - 1, i);
				}
				else
				{
					output[i] = makeRow(n-1, i-1);
				}
			}
		return output;
	}

	public static int makeRow(int n, int c)
	{
		int output = 1;
		if(n==0)
		{
			output = 1;
			return output;
		}
		if(c > 0 && c < n)
		{
			output = makeRow(n - 1, c) + makeRow(n - 1, c-1);
		}
		else if(c == 0)
		{
			output = makeRow(n - 1 , c);
		}
		else
		{
			output = makeRow(n-1, c-1);
		}
		return output;
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
