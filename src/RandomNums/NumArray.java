import javax.swing.*;
class NumArray
{
	public static void main(String[] args)
	{
		String nStr = JOptionPane.showInputDialog("Enter your number");
		int n = Integer.parseInt(nStr);
		int[] nArray = new int[n + 1];
		
		for(int i = nArray.length -1; i >= 0; i--)
		{
			nArray[i] = i;
		}
		
		for(int e : nArray)
			System.out.println(e);
	}
}