import javax.swing.*;

class A
{
	public static void main(String[] args)
	{
	String s = "Programmieren in Java 1";
	String[] sarray = s.split(" ");
	
	for(String e : sarray)
		System.out.println(e);
	}
}