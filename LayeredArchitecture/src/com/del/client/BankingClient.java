package com.del.client;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingClient {
	private BankingService bService;

	public BankingClient() {
		bService = new BankingServiceImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user id and pass");
		String user_id=scanner.next();
		String pass=scanner.next();
		scanner.nextLine();
		boolean ifSuccess=bService.authenticate(user_id,pass);
		if(ifSuccess==false)
			System.out.println("Invalid user name and password.");
		else {
			
			int choice = 0;
			while (true) {
				choice = getChoice(scanner);
				switch (choice) {
				case 1:
					System.out.println("**Deposit Amount**");
					System.out.println("Enter deposit amount");
	
					try {
						double amount = scanner.nextDouble();
						bService.depositAmount(amount);
					} catch (BankingException e) {
						System.err.println(e.getMessage());
					} catch (InputMismatchException e) {
						System.err.println(e.getMessage());
						scanner.nextLine();
					}
					break;
				case 2:
					System.out.println("**Withdraw Amount**");
					System.out.println("Enter withdraw amount");
	
					try {
						double amount1 = scanner.nextDouble();
						bService.withdrawAmount(amount1);
					} catch (BankingException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
	
					} catch (InputMismatchException e) {
						System.err.println(e.getMessage());
						scanner.nextLine();
					}
					break;
				case 3:
					System.out.println("**Check Amount**");
					double balance = bService.getBalance();
					System.out.println("balance: " + balance);
	
					break;
				case 4:
					quitProgram();
					break;
				default:
					System.out.println("Incorrect option chosen.");
				}
			}
		}
	}

	private void quitProgram() {
		// TODO Auto-generated method stub
		System.out.println("Exiting..Bye");
		System.exit(0);
	}

	private int getChoice(Scanner scanner) {
		// TODO Auto-generated method stub
		int choice = 0;
		System.out.println("Banking System");
		System.out.println("1. Deposit amount");
		System.out.println("2. Withdraw amount");
		System.out.println("3. Check balance");
		System.out.println("4. Quit program");
		try {
			choice = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Enter correct number.");
			scanner.nextLine();
		}
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new BankingClient();
	}

}
