package by.gvozdev.teller.logic;

import java.util.Scanner;

public class UserInput {

	private int userChoice;

	@SuppressWarnings("resource")
	public String inputNameUser() {
		System.out.println("     Как тебя зовут?");
		Scanner scanner = new Scanner(System.in);
		String nameUser = scanner.nextLine();
		return nameUser;
	}

	@SuppressWarnings("resource")
	public int inputMenuUser() {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			userChoice = scanner.nextInt();
			return userChoice;
		} else {
			return 0;
		}
	}

}
