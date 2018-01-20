package by.gvozdev.teller.logic;

import java.util.HashMap;

public class ListAnswer {

	public static HashMap<Integer, String[][]> createAnswer() {

		HashMap<Integer, String[][]> answers = new HashMap<Integer, String[][]>();
		answers.put(1, new String[][] { { "Попрощаться!" }, {} });// 0
		answers.put(2, new String[][] { { "Любовь" },
				{ "Вам повезет в любви", "Любви увы нет", "Будет большая любовь", "Вы скоро кого то встретите" } });// 1
		answers.put(3, new String[][] { { "Удача" },
				{ "Соро найдете клад", "Ну не везет вам.", "Получите наследство.", "Вы поступите в лабу EPAM." } });// 2
		answers.put(4, new String[][] { { "Богатство" },
				{ "Вам увеличат ЗП", "Потратите деньги", "Получите наследство", "Выиграете машину" } });// 3
		answers.put(5, new String[][] { { "Отношения" }, { "Увас все будет хорошо", "Не ладится у вас в отношениях",
				"Ждите пополнение в семье", "Вы скоро найдете кого-то" } });// 3

		return answers;

	}

}
