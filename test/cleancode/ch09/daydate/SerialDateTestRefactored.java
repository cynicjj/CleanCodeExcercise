package cleancode.ch09.daydate;

public class SerialDateTestRefactored {

	/*
	void _5월31일에_1달을_더하면_6월30일() {
		SerialDate _5월31일 = SerialDate.createInstance(31, 5, 2004);

		SerialDate actual = SerialDate.addMonths(1, _5월31일);

		SerialDate _6월30일 = SerialDate.createInstance(30, 6, 2004);
		assertTrue(actual.isEqualTo(_6월30일));
	}

	void _5월31일에_2달을_더하면_7월31일() {
		SerialDate _5월31일 = SerialDate.createInstance(31, 5, 2004);

		SerialDate actual = SerialDate.addMonths(2, _5월31일);

		SerialDate _7월31일 = SerialDate.createInstance(31, 7, 2004);
		assertTrue(actual.isEqualTo(_6월30일));
	}

	void _5월31일에_1달을_더하고_또_1달을_더하면_7월30일() {
		SerialDate _5월31일 = SerialDate.createInstance(31, 5, 2004);

		SerialDate actual;
		actual = SerialDate.addMonths(1, _5월31일);
		actual = SerialDate.addMonths(1, _5월31일);

		SerialDate _7월30일 = SerialDate.createInstance(30, 7, 2004);
		assertTrue(actual.isEqualTo(_7월30일));
	}
	// */
}
