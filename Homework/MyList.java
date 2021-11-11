package Homework;

public class MyList {

	String array[];

	public MyList(int size) {
		this.array = new String[size];
	}

	public MyList() {
		this.array = new String[0];
	}

	public String[] add(String addCities) {

		String[] tempCities = array;
		array = new String[array.length + 1];
		for (int i = 0; i < tempCities.length; i++) {
			array[i] = tempCities[i];
		}
		array[array.length - 1] = addCities;
		tempCities = array;

		return array;

	}

	public void remove(int index) {
		String[] tempCities = new String[array.length];
		for (int i = 0; i < tempCities.length; i++) {
			tempCities[i] = array[i];
		}
		array = new String[tempCities.length - 1];
		int counter = 0;
		for (int i = 0; i < array.length + 1; i++) {
			if (i == index) {
				continue;
			} else {
				array[counter] = tempCities[i];
			}
			counter++;
		}

	}

	public void remove(String cities) {
		String[] temp = new String[array.length];
		int counter = 0;
		for (int i = 0; i < temp.length; i++) {
			temp[i] = array[i];
		}
		
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == cities)
				counter++;
		}
		
		int resultIndex = 0;
		array = new String[temp.length - counter];
		
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != cities) {
				array[resultIndex] = temp[i];
				resultIndex++;
			} else {
				continue;
			}

		}
	}

	public boolean contains(String cities) {
		boolean status = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != cities)
				status = false;
			else
				status = true;
			break;
		}
		return status;
	}

	public String get(int index) {
		return array[index];
	}

	public void list() {
		for (String string : array) {
			System.out.println(string);
		}
	}

}