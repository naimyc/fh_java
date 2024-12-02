import javax.swing.*;
class Valid_Email
{
	public static void main(String[] args)
	{
		String emailStr = JOptionPane.showInputDialog("Insert your email");
		
		boolean validMail = checkAts(emailStr);
		
		if(validMail)
			checkMail(emailStr);
	}
	
	static boolean checkAts(String email)
	{
		char[] emailChars = email.toCharArray();
		int atsIncluded = 0;
		boolean validMail = true;
		
		for(int i = 0; i < emailChars.length; i++)
		{
			if(emailChars[i] == '@')
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
		int at_pos = email.indexOf("@");
		boolean checkBochum = email.contains("bochum");
		String[] mailData = new String[3];
		
		if(email.endsWith("@") || email.startsWith("@"))
			throw new Error("Invalid E-Mail: E-Mail cannot start or end with @");
		
		String vorMail = email.substring(0, at_pos);
		String nachMail = email.substring(at_pos+1);
		
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
