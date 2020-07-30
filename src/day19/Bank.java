package day19;

import java.util.Scanner;

public class Bank {

	public static void open(Account account) {
		account.openAccount();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("which account");
		String choice = input.next();
		
		Account account = null;
		
		switch (choice) {
		case "current":
			account = new CurrentAccount();
			break;
		
		case "saving":
			account = new SavingAccount();
			break;

		default:
			System.out.println("wrong choice");
			break;
		}
		if (account != null) {
			open(account);
		}
		input.close();
				
	}
}
