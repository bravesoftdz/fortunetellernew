package by.gvozdev.teller.logic;

import by.gvozdev.teller.bean.*;

public class Teller {

	private int countPetals;
	private String namePetals;
	@SuppressWarnings("unused")
	private String answerNameUser;
	private int answerMenuUser;

	// Получаем имя цветка и количество лепестков
	public void tellerTalk() {

		for (Flower value : CreateList.initializationList()) {
			countPetals = value.getPetals();
			namePetals = value.getName();
		}

		System.err.println("     Гадать будем на \"" + namePetals + "\".");// Кол-во лепестков: " + countPetals);

		// Гадалка запрашивает имя пользователя
		UserInput eventInputName = new UserInput();
		answerNameUser = eventInputName.inputNameUser();

		// Выводи меню программы
		ShowApplicationMenu eventShowMenu = new ShowApplicationMenu();
		eventShowMenu.createAnswer();

		// Гадалка спрашивает на что гадать
		UserInput eventInputOption = new UserInput();
		answerMenuUser = eventInputOption.inputMenuUser();

		MenuProcessing btn = new MenuProcessing();
		btn.clickingOption(answerMenuUser, countPetals);

	}

}
