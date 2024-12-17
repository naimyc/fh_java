package com;

import javax.swing.JOptionPane;

public class Rechteck {
	
	private double a, b;
	
	void set(double aWert, double bWert)
	{
		a = aWert;
		b = bWert;
	}
	
	public double getA()
	{
		return a;
	}
	public double getB()
	{
		return b;
	}
	
	int summe(int x, int y)
	{
		return x + y;
	}
	
	public boolean isQuadrat()
	{
		if(a == b)
			return true;
		else 
			return false;
	}
	
	public String getInhalt()
	{
		double a = inhalt();
		return "Der Flächeninhalt ist " + inhalt();
	}

	double inhalt() {
		double i;
		i = a * b;
		
		return i;
	}

	double diagonale() {
		double d;
		d = Math.sqrt(a * a + b * b);
		
		return d;
	}
}