// import javax.swing.*;
class SumNumbers
{
	public static void main(String[] args)
	{
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Gebe eine Zahl ein!"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Gebe eine Zahl ein!"));

		int sum = 0;
		if(j < i)
			System.out.println("Ungueltige Zahlen: Erste Zahl soll kleiner als die zweite sein!");
		else {
			
			while(i < j)
			{
				if(i % 2 == 0)
					{
						sum += i;
						System.out.println(i);
					}
				i++;
			}
			System.out.println(sum);
		}
			
	}
}