package twoExceptionsCopy;

public class RadioStationCallSignException extends Exception {
	String callSign;

	// constructor, that receives a radio station's call sign (for example, WJRR).
	RadioStationCallSignException(String callSign) {
		super();
		this.callSign = callSign;
	}

}
