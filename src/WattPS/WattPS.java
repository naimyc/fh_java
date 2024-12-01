import java.text.DecimalFormat;
class WattPS
{
	static DecimalFormat df = new DecimalFormat("#.##");
	public static void main(String[] args)
	{
		double ps = umrechenenPS(735.5);
		double w = umrechenenW(2.0);
		
		double[] el = appendElements(ps, w);
		readElements(el);
	}
	
	static double umrechenenPS(double w)
	{
		double ps = w / 735.5;
		
		System.out.printf("%s W entsprechen %s PS", df.format(w), df.format(ps));
		return ps;
	}
	static double umrechenenW(double ps)
	{
		double w = ps * 735.5;
		
		System.out.printf("\n%s PS entsprechen %s W", df.format(ps), df.format(w));
		
		return w;
	}
	static double[] appendElements(double w, double ps)
	{
		double[] el = new double[2];
		
		el[0] = w;
		el[1] = ps;
		
		return el;
	}
	
	static void readElements(double[] el)
	{
		System.out.println("\n\nElements:");
		for(double e : el)
		{
		System.out.println(e);
		}
	}
}