class Fibonacci
{
	public static void main(String[] args)
	{
		int n = 8;
		
		int i = 0;
		
		int[] fZahlen = new int[10];
		
		
		int a1 = 1;
		int a2 = 1;
		
		int summe = 0;
		
		while(i > fZahlen.length)
		{
			summe = a1 + a2;
			
			a1 = a2;
			a2 = summe;
			
		}
	}
	
}