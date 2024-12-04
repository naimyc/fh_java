class Fibonacci
{
	public static void main(String[] args)
	{
		int n = 8;	
		
		int a1 = 0;
		int a2 = 1;
		
		int summe = 0;
		
		while(summe < n)
		{
			System.out.println(a1);
			
			summe = a1 + a2;
			
			a1 = a2;
			a2 = summe;
			
		}
	}
	
}