package com;

public class Studierender {
	private String name, matrikelnummer;
	
	Studierender(String name, String mtrNummer)
	{
		this.name = name;
		this.matrikelnummer = mtrNummer;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	void setMatrikelnummer(String matrikelnummer)
	{
		this.matrikelnummer = matrikelnummer;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getMatrikelnummer()
	{
		return this.matrikelnummer;
	}

}
