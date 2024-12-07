import javax.swing.*;
import java.text.DecimalFormat;
class CelsiusKelvin
{
	public static void main(String[] args)
	{
		String[] s = eingabe();
		double k, c, k2, c2;
		
		if(s[1].toLowerCase().equals("celsius"))
		{
			c = Double.parseDouble(s[0]);
			k2 = celsiusToKelvin(c);
			ausgabe(c, k2);
		}
		else if(s[1].toLowerCase().equals("kelvin"))
		{
			k = Double.parseDouble(s[0]);
			c2 = kelvinToCelsius(k);
			ausgabe(k, c2);
		}
		else
		{
			throw new Error("Fehler: Schereiben Sie Kelvin oder Celsius");
		}
	}
	
	static String[] eingabe()
	{
		String[] s = JOptionPane.showInputDialog("Enter value!").split(" ");
		
		return s;
	}
	static double celsiusToKelvin(double c)
	{
		double k = c + 274.15;
		
		return k;
	}
	static double kelvinToCelsius(double k)
	{
		double c = k - 274.15;
		return c;
	}
	static void ausgabe(double c, double k)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		
		//c = Math.round(c * 100.0) / 100.0;
		//k = Math.round(k * 100.0) / 100.0;
		
		String cStr = df.format(c);
		String kStr = df.format(k);
		
		JOptionPane.showMessageDialog(null, cStr + " Celsius entsprechen " + kStr + " Kelvin.");
	}
}