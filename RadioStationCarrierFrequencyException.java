package twoExceptionsCopy;

public class RadioStationCarrierFrequencyException extends Exception {

	double carrierFrequency;

	// constructor, that receives a carrier frequency (for example, 101.1).
	RadioStationCarrierFrequencyException(double carrierFrequency) {
		super();
		this.carrierFrequency = carrierFrequency;
		System.out.println("PLease check your input: number should be within the range 88-108 (inclusive)");
	}

}
