package twoExceptionsCopy;

public class RadioStation {

	// variables
	String callSign;
	double carrierFrequency;

	// constructor requiring values for both fields.
	public RadioStation(String callSign, double carrierFrequency) {

		this.setCallSign(callSign);
		this.setCarrierFrequency(carrierFrequency);

	}

	// method that throws a RadioStationCallSignException if the call sign does not
	// consist of four letters ( all capitalized).
	public static void checkCallSignInput(String callSign) throws RadioStationCallSignException {

		if ((!(callSign.matches("^[A-Z]{4}")))) {
			throw new RadioStationCallSignException(callSign);

		} else {
			System.out.println("Call Sign was entered sucessfully");
		}
	}

	// method that throws a RadioStationCarrierFrequencyException if the carrier
	// frequency is not between 88 and 108 inclusive.
	public static void checkCarrierFrequencyInput(double carrierFrequency)
			throws RadioStationCarrierFrequencyException {

		if (!(88.0 <= carrierFrequency && carrierFrequency <= 108.0)) {
			throw new RadioStationCarrierFrequencyException(carrierFrequency);
		} else {
			System.out.println("Carrier Frequency was entered sucessfully");
		}
	}

//setters and getters
	public String getCallSign() {
		return getCallSign();
	}

	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	public double getCarrierFrequency() {
		double carrierFrequency = 0;
		return carrierFrequency;
	}

	public void setCarrierFrequency(double carrierFrequency) {
		this.carrierFrequency = carrierFrequency;
	}

	// toString method displays all information for station
	public String toString() {
		String result;
		result = "Radio Station with call sign:" + callSign + " and carrier frequency: " + carrierFrequency;
		return result;
	}
}
