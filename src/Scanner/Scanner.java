import java.util.Scanner;

class ScannerA
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in).useDelimiter("\'");
		String num = sc.next();
		
		System.out.println(num);
		sc.close();
	}
	
}