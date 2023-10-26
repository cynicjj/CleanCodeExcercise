package cleancode.ch02.name;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NameRefactoringExcercise {

	int d; // elapsed time in days

	private int[][] theList;

	public List<int[]> getThem() {
		List<int[]> list1 = new ArrayList<int[]>();
		for (int[] x : theList)
			if (x[0] == 4)
				list1.add(x);
		return list1;
	}

	String[] accountList;

	String product;
	String productData;
	String productInfo;

	Date genymdhms;

	public void getWorkDays() {
		int s = 0;
		int[] t = null;
		for (int j = 0; j < 34; j++) {
			s += (t[j] * 4) / 5;
		}
	}

	String m_name;

	public void eatMyShorts() {

	}

	private void printGuessStatistics(char candidate, int count) {
		String number;
		String verb;
		String pluralModifier;
		if (count == 0) {
			number = "no";
			verb = "are";
			pluralModifier = "s";
		} else if (count == 1) {
			number = "1";
			verb = "is";
			pluralModifier = "";
		} else {
			number = Integer.toString(count);
			verb = "are";
			pluralModifier = "s";
		}
		String guessMessage = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
//		print(guessMessage);
	}

	/*
	private void createPluralDependentMessageParts(int count) {
		if (count == 0) {
			thereAreNoLetters();
		} else if (count == 1) {
			thereIsOneLetter();
		} else {
			thereAreManyLetters(count);
		}
	}
	//*/
}
