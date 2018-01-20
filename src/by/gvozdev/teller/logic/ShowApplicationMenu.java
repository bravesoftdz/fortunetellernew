package by.gvozdev.teller.logic;

import java.util.HashMap;

public class ShowApplicationMenu {

	void createAnswer() {

		HashMap<Integer, String[][]> answers = ListAnswer.createAnswer();
		int counterSize = answers.size();
		for (int i = 0; i < counterSize; i++) {

			if (answers.get(i + 1)[0][0] == "Попрощаться!") {
				System.out.println("     " + (i + 1) + "." + answers.get(i + 1)[0][0]);
				System.out.println("     -----");
				System.out.println("     На что будем гадать?");
			} else {
				System.out.println("     " + (i + 1) + "." + answers.get(i + 1)[0][0]);
			}

		}
	}

}
