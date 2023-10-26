package cleancode.ch07.exception.tdd;

import java.io.FileNotFoundException;

import org.junit.Test;

public class SectionStoreTest {

	@Test(expected = FileNotFoundException.class)
	public void testRetrieveSection() throws Exception {
		SectionStore sectionStore = new SectionStore();
		sectionStore.retrieveSection("invalid file name");
	}

}
