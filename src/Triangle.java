import java.text.DecimalFormat;
class Triangle
{
	
	public static void main(String[] args)
	{
		double g = tanBerechnen(30, 12);
		DecimalFormat df = new DecimalFormat("#.##");
		
		double x = toRadian(4.0), y= Math.toRadians(4.0); 
		System.out.printf("X: %f, Y: %f", x, y);
		System.out.printf("\nDie Höhe des Baums ist %s",  df.format(g));
		
		/*
		
		s c t
		G A G 
		/ / /
		H H A 
		
		Für die Aufgabe:
		
		Gegenkathete / Ankathete  = tan(alpha) | * Hypotenuse
		tan(alpha) * Ankathete = Gegenkathete 
		
		*/
		
	}
	
	static double toRadian(double degree)
	{
		return (degree * Math.PI / 180 ) ;
	}
	
	static double cosBerechnen(double alpha, double a)
	{
		alpha = toRadian(alpha);
		return Math.cos(alpha) * a;
	}
	
	static double sinBerechnen(double alpha, double h)
	{
		
		alpha = toRadian(alpha);
		return Math.sin(alpha) * h;
	}
	
	static double tanBerechnen(double alpha, double a)
	{
	alpha = toRadian(alpha);
	return Math.tan(alpha) * a;
	}
		
}