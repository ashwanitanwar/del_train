package del.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import del.service.MobileService;
import del.service.MobileServiceImpl;

public class MobileClient {
	private MobileService mService;

	public MobileClient() {
		mService = new MobileServiceImpl();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		System.out.println("Welcome to Mobile Payment System");
		System.out.println("Enter login");
		String login = scan.nextLine();
		System.out.println("Enter password");
		String password = scan.nextLine();
		boolean loginSuccess = mService.authenticate(login, password);
		if (loginSuccess) {
	    	System.out.println("Mobile number:" + mService.getMobile());
			System.out.println("Pending due amount:" + mService.getDue());
			int input = getInput(scan);
			if (input == 1) {
				System.out.println("Please enter the amount to pay.");
				double amount = 0;
				try {
					amount = scan.nextDouble();
					mService.billPayment(amount);
					System.out.println("Successful payment");
					System.out.println("Mobile Number: " + mService.getMobile());
					System.out.println("Payment made: " + amount);
					System.out.println("Pending Amount: " + mService.getDue());

				} catch (InputMismatchException e) {
					System.err.println("Enter number only");
					scan.nextLine();

				}
			} else {
				System.err.println("Exiting now.");
				System.exit(0);
			}
		} else {
			System.out.println("Either login or password is wrong");
		}
	}

	private int getInput(Scanner scan) {
		System.out.println("Please enter 1 to make payment or any other number to exit");
		int input = 0;
		try {
			input = scan.nextInt();
		} catch (InputMismatchException e) {
			scan.nextLine();
		}
		return input;

	}

	public static void main(String[] args) {
		new MobileClient();
	}
}