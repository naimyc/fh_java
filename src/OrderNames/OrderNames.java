import javax.swing.*;
import java.util.Scanner;
class OrderNames
{
	public static void main(String[] args)
	{
		
		String n01 = JOptionPane.showInputDialog("Enter your first Name!").toUpperCase();
		String n02 = JOptionPane.showInputDialog("Enter your second Name!").toUpperCase();
		
		Scanner sc01 = new Scanner(n01);
		Scanner sc02 = new Scanner(n02);
		
		String name01 = sc01.next();
		String name02 = sc02.next();
		
		/*
		String surName01, surName02;
		
		if(sc01.hasNext())
		{
			sc01.useDelimiter("");
			surName01 = sc01.next();
		}
		
		if(sc02.hasNext())
		{
			sc02.useDelimiter("");
			surName02 = sc02.next();
		}
		*/
		
		System.out.println(name01.compareTo(name02));
		
		if(name01.compareTo(name02) < 0)
			System.out.println("Erste Name ist größer!");
		else if(name02.compareTo(name01) < 0)
			System.out.println("Zweite Name ist größer!");
		else
			System.out.println("Namen sind gleich!");
		
		
		orderNames(name01, name02);
		
		int[] difference = compareNames(name01, name02);
		
	}
	static void orderNames(String name01, String name02)
	{
		
	}
	static int compareNames(String name01, String name02)
	{
		char[] name01Arr = name01.toCharArray();
		char[] name02Arr = name02.toCharArray();
		
		int differencePos = -1;
		
		int min = Math.min(name01Arr.length, name02Arr.length);
		
		LABEL:
		for(int i = 0; i < min; i++)
		{
				if(name01Arr[i] != (name02Arr[i]))
				{
					differencePos = i;
					break LABEL;
				}
		}
		
		return differencePos;
	}
}