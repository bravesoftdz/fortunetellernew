package by.gvozdev.teller.logic;

import java.util.ArrayList;
import java.util.List;

import by.gvozdev.teller.bean.Chamomile;
import by.gvozdev.teller.bean.Flower;

public class CreateList {

	public static List<Flower> initializationList() {
		List<Flower> list = new ArrayList<Flower>();
		list.add(new Chamomile("Chamomile", "White", 0, "Green", 15));

		return list;
	}

}
