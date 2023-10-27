package cleancode.ch07.exception.port;

public class Connector {

	public void connect() {
		ACMEPort port = new ACMEPort(12);
		try {
			port.open();
		} catch (DeviceResponseException e) {
			reportPortError(e);
			logger.log("Device response exception", e);
		} catch (ATM1212UnlockedException e) {
			reportPortError(e);
			logger.log("Unlock exception", e);
		} catch (GMXError e) {
			reportPortError(e);
			logger.log("Device response exception");
		} finally {

		}
	}

	public void connect2() {
		LocalPort port = new LocalPort(12);
		try {
			port.open();
		} catch (PortDeviceFailure e) {
			reportError(e);
			logger.log(e.getMessage(), e);
		} finally {

		}
	}
}
