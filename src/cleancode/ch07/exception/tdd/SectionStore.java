package cleancode.ch07.exception.tdd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SectionStore {

	public void retrieveSection(String sectionName) throws FileNotFoundException {
		try {
			FileInputStream stream = new FileInputStream(sectionName);
			// 이하생략
		} catch (FileNotFoundException e) {
			throw e;
		}
	}

}
