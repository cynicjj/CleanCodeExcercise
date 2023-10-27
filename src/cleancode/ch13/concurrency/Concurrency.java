package cleancode.ch13.concurrency;

public class Concurrency {

	// Future
	public String processRequest(String message) throws Exception {
		Callable<String> makeExternalCall = new Callable<String>() {
			public String call() throws Exception {
				String result = "";
				// make external request
				return result;
			}
		};
		Future<String> result = executorService.submit(makeExternalCall);
		String partialResult = doSomeLocalProcessing();
		return result.get() + partialResult;
	}

	/*
	 * CAS - Compare And Swap
	 */
	int variableBeingSet;

	void simulateNonBlockingSet(int newValue) {
		int currentValue;
		do {
			currentValue = variableBeingSet;
		} while (currentValue != compareAndSwap(currentValue, newValue));
	}

	int synchronized compareAndSwap(int currentValue, int newValue) {
		if(variableBeingSet == currentValue) {
			variableBeingSet = newValue;
			return currentValue;
		}
		return variableBeingSet; 
	}
}

public class ObjectWithValue {
	private int value;

	public void synchronized incrementValue() { 
		++value; 
	}

	public int getValue() {
		return value;
	}
}

public class ObjectWithValue2 {
	private AtomicInteger value = new AtomicInteger(0);

	public void incrementValue() {
		value.incrementAndGet();
	}

	public int getValue() {
		return value.get();
	}
}
