package cleancode.ch13.concurrency;

import java.util.Iterator;

public class IntegerIterator implements Iterator<Integer> {
	private Integer nextValue = 0;

	public synchronized boolean hasNext() {
		return nextValue < 100000;
	}

	public synchronized Integer next() {
		if (nextValue == 100000)
			throw new IteratorPastEndException();
		return nextValue++;
	}

	public synchronized Integer getNextValue() {
		return nextValue;
	}
}

public class User {

	void iterate() {
		IntegerIterator iterator = new IntegerIterator();
		while (iterator.hasNext()) {
			int nextValue = iterator.next();
			// do something with nextValue
		}
	}
}
