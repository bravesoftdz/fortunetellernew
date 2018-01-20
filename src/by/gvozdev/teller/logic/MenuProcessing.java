package by.gvozdev.teller.logic;

import java.util.HashMap;

import by.gvozdev.teller.bean.Constant;

public class MenuProcessing {

	private String answerEnd;

	void clickingOption(int valueOption, int valuePetals) {

		if (valueOption == Constant.EXIT) {
			System.out.println("     Гадалка: Ну что же, прощай!");
			System.exit(0);
		} else if (valuePetals == 0) {
			System.out.println("--------------------------------------------------------\n\n\n");
			System.out.println("Надо брать другую рамашку!");
			Teller tl = new Teller();
			tl.tellerTalk();
		} else {
			HashMap<Integer, String[][]> answers = ListAnswer.createAnswer();
			String[][] arrAnswer = answers.get(valueOption);

			if (valuePetals > Constant.MAX) {
				int newValuePetals = valuePetals - Constant.MAX;
				answerEnd = arrAnswer[1][newValuePetals];
			} else {
				answerEnd = arrAnswer[1][valuePetals - 1];
			}

			AnswerFromTeller aft = new AnswerFromTeller();
			aft.answerFromTeller(answerEnd.toUpperCase());
		}

	}

}
