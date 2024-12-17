package com;

public class Punkt {
	int xyz[];
	
	Punkt(int x, int y, int z)
	{
		xyz = new int[3];
		xyz[0] = x;
		xyz[1] = y;
		xyz[2] = z;
	}
	
	Punkt()
	{
		xyz = new int[3];
		
		xyz[0] = 55;
		xyz[1] = 1;
		xyz[2] = 23;
	}
	
	void setX(int i)
	{
		xyz[0] = i;
	}
	void setY(int i)
	{
		xyz[1] = i;
	}
	void setZ(int i)
	{
		xyz[2] = i;
	}
	
	
	int getX()
	{
		return xyz[0];
	}
	int getY()
	{
		return xyz[1];
	}
	int getZ()
	{
		return xyz[2];
	}
	

}
