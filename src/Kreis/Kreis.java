package com;

public class Kreis {
	
	double x, y, radius;
	String color;
	
	Kreis(double x, double y, double radius, String color)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	
	Kreis(double x, double y, double radius)
	{
		this.x = x;
		this.y = y;
		
		this.radius = radius;
		this.color = "keine Farbe";
	}
	Kreis()
	{
		this.color = "keine farbe";
	}
	
	void setValues(double x, double y, double radius, String color)
	{
		
	}
	void getValues()
	{
		System.out.printf("X: %.2f\t Y: %.2f\t Radius: %.2f\t Color: %s\n", x, y, radius, color);
	}
}
