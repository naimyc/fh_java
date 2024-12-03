import javax.swing.*;
import java.util.Scanner;

class EmailScanner
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		//String emailStr = JOptionPane.showInputDialog("Insert your email");
		
		String emailStr = sc.next();
		boolean validMail = checkAts(emailStr);
		
		if(validMail)
			checkMail(emailStr);
	}
	
	static boolean checkAts(String email)
	{
		Scanner scAt = new Scanner(email).useDelimiter("@");
		
		int atsIncluded = 0;
		boolean validMail = true;
		
		while(scAt.hasNext()){
			scAt.next();
			atsIncluded++;
		}
		if(atsIncluded == 0)
			throw new Error("Invalid E-Mail: Add an \'@\' to your E-Mail!");
		else if(atsIncluded > 1)
			throw new Error("Invalid E-Mail: E-Mail can't contain more than one \'@\'");
		
		return validMail;
	}
	static String[] checkMail(String email)
	{
		Scanner scAt = new Scanner(email).useDelimiter("@");
		boolean checkBochum = email.contains("bochum");
		String[] mailData = new String[3];
		
		if(email.endsWith("@") || email.startsWith("@"))
			throw new Error("Invalid E-Mail: E-Mail cannot start or end with @");
		
		String vorMail = sc.next();
		sc.next();
		
		String nachMail = sc.next();
		
		System.out.printf("Vor der Email: %s\nNach der Email: %s\n", vorMail, nachMail);
		
		if(checkBochum)
			System.out.println(email.substring(email.length() -3));
		
		String modifiedMail = email.replace("@", "_at_");
		System.out.println(modifiedMail);
		
		mailData[0] = vorMail;
		mailData[1] = nachMail;
		mailData[2] = email;
		
		return mailData;
	}
}
