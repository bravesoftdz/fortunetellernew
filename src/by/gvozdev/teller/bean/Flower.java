package by.gvozdev.teller.bean;

import java.util.Random;

public abstract class Flower {

	private String name; // name flower
	private String colorBud; // color bud
	@SuppressWarnings("unused")
	private int petals; // count of petals in flower (random)
	private String colorStem; // color of stem
	private int heightStem; // height of stem

	public Flower(String name, String colorBud, int petals, String colorStem, int heightStem) {
		this.name = name;
		this.colorBud = colorBud;
		this.colorStem = colorStem;
		this.heightStem = heightStem;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColorBud() {
		return colorBud;
	}

	public void setColorBud(String colorBud) {
		this.colorBud = colorBud;
	}

	public int getPetals() {
		Random rnd = new Random();
		int max = Constant.MAX;
		int min = Constant.MIN;
		int number = min + rnd.nextInt(max + 1);
		return number;
	}

	public void setPetals(int petals) {
		// this.petals = petals;
	}

	public String getColorStem() {
		return colorStem;
	}

	public void setColorStem(String colorStem) {
		this.colorStem = colorStem;
	}

	public int getHeightStem() {
		return heightStem;
	}

	public void setHeightStem(int heightStem) {
		this.heightStem = heightStem;
	}

}
