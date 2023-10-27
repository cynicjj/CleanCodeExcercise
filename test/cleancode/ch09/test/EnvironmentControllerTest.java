package cleancode.ch09.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnvironmentControllerTest {

	/*
	public void turnOnLoTempAlarmAtThreashold() throws Exception {
		hw.setTemp(WAY_TOO_COLD);
		controller.tic();
		assertTrue(hw.heaterState());
		assertTrue(hw.blowerState());
		assertFalse(hw.coolerState());
		assertFalse(hw.hiTempAlarm());
		assertTrue(hw.loTempAlarm());
	}

	@Test
	public void turnOnCoolerAndBlowerIfTooHot() throws Exception {
		tooHot();
		assertEquals("hBChl", hw.getState());
	}

	@Test
	public void turnOnHeaterAndBlowerIfTooCold() throws Exception {
		tooCold();
		assertEquals("HBchl", hw.getState());
	}

	@Test
	public void turnOnHiTempAlarmAtThreshold() throws Exception {
		wayTooHot();
		assertEquals("hBCHl", hw.getState());
	}

	@Test
	public void turnOnLoTempAlarmAtThreshold() throws Exception {
		wayTooCold();
		assertEquals("HBchL", hw.getState());
	}

	public String getState() {
		String state = "";
		state += heater ? "H" : "h";
		state += blower ? "B" : "b";
		state += cooler ? "C" : "c";
		state += hiTempAlarm ? "H" : "h";
		state += loTempAlarm ? "L" : "l";
		return state;
	}
	//*/
}
