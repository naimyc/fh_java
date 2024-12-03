public class Buch
{
	 String titel;
	 String autor;
	 double preis;
	 String waerung;

	// Konstruktor
	
	// Get
	public String getTitle()
	{
		return this.titel;
	}
	public String getAutor()
	{
		return this.autor;
	}
	public String getWaehrung()
	{
		return this.waerung;
	}
	public double getPreis()
	{
		return this.preis;
	}
	
	// Set 
	public void setTitle(String title)
	{
		this.titel = title;
	}
	public void setAutor(String a)
	{
		this.autor = a;
	}
	public void setWaehrung(String w)
	{
		this.waerung = w;
	}
	public void setPreis(double p)
	{
		this.preis = p;
	}
	
}

class BuchTest
{
	public static void main(String[] args)
	{
		
	Buch b01 = new Buch();
	
	b01.setTitle("A");
	b01.setAutor("A Author");
	b01.setWaehrung("$");
	b01.setPreis(324.0);
	
	Buch b02 = new Buch();
	
	b01.setTitle("B");
	b01.setAutor("B Author");
	b01.setWaehrung("");
	b01.setPreis(324.0);
	
	String t = b01.getTitle();
	String a = b01.getAutor();
	String w = b01.getWaehrung();
	double p = b01.getPreis();
	
	String t2 = b01.getTitle();
	String a2 = b01.getAutor();
	String w2 = b01.getWaehrung();
	double p2 = b01.getPreis();
	
	}	
}