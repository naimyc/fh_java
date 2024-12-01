import javax.swing.*;
class DegreeToRadian {
	public static void main(String[] args)
	{
	double radian = 0, radian2;
	String degreeStr = JOptionPane.showInputDialog("Enter your degree");
	
	double degree = Double.parseDouble(degreeStr);
	radian = ((degree)/2) * Math.PI;
	radian2 = Math.toRadians(degree);
	
	System.out.println(radian);
	System.out.println(radian2);
	}
}