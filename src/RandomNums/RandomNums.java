class RandomNums
{
	public static void main(String[] args)
	{
		double[][] dArr = new double[3][3];
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		
		double sum = 0;
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				dArr[i][j] = Math.random();
			}
			
		}
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(i == 0)
					sum1 += dArr[i][j];
				else if(i == 2)
					sum2 += dArr[i][j];
				else
					sum3 += dArr[i][j];
			}
		}
		
		System.out.printf("Summe Zeile 1: %.2f", sum1);
		System.out.printf("\nSumme Zeile 2: %.2f", sum2);
		System.out.printf("\nSumme Zeile 3: %.2f", sum3);
		
		sum = sum1 + sum2 + sum3;
		
		System.out.printf("\nSumme Gesamt: %.2f", sum);


		
	}
	
}