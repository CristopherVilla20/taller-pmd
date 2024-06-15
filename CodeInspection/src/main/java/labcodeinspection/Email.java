package labcodeinspection;

import java.util.Locale;

public class Email {

	private final String m_firstName; 
	private final String m_lastName;
	private String password;
	private String department;
	private final int defaultpasswordLength = 8;
	private String email;

	/**
	*Constructor
	*
	* @author Cristopher Villa
	*/
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}
	
	/**
	*Show info
	*
	* @author Cristopher Villa
	*/

	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	
	/**
	*SELECT DEPARTMENT
	*@param department choice
	*
	* @author Cristopher Villa
	*/

	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
            throw new IllegalArgumentException("Invalid department choice: " + depChoice);
		
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	
	/**
	*Generate an e-mail
	*
	*
	* @author Cristopher Villa
	*/

	public void generateEmail() {
	    this.password = this.randomPassword(this.defaultpasswordLength);
	    this.email = this.m_firstName.toLowerCase(Locale.ENGLISH) + this.m_lastName.toLowerCase(Locale.ENGLISH) + "@" + this.department + ".espol.edu.ec";
	}

}
