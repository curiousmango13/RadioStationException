/* Name: Julia Smith
 * Date: May 27, 2020
 * Application, that creates an array of  six RadioStation objects by asking the user
 * to input call signs and carrier frequencies. It displays an appropriate message,
 *  when a RadioStation object is created successfully and also when one is not. 
 */
package twoExceptionsCopy;
import java.util.Scanner;


public class RadioStations {

	public static void main(String[] args) {
		String callSign;
		double carrierFrequency = 0;

		// scanner for user input storage
		Scanner userInput = new Scanner(System.in);
		
		// counter variable
		int x = 0;
		
		// creating Array
		RadioStation[] RadioStationArray = new RadioStation[6];

		// UI : Greeting 

		System.out.println("Hello! Let's get some information about Your favorite Radio Stations.");
		System.out.println("You will be prompted for call sign (for ex., WCDD) and carrier frequency (for ex., 99.5) "
				+ "\nfor each of them, so have this data handy! "
				+ "\nLet's begin!");

		//do loop runs 6 times to fill array with data		
		for (x = 0; x < 6; x++) {
			do {
				System.out.println("\nFor Station " + (x + 1));
				System.out.println("Please enter Call Sign (4 letters - all capitalized) and hit ENTER:");
				//scanning user input
				callSign = userInput.next();

				
				// catching exception if input is entered in wrong format
					try {
						RadioStation.checkCallSignInput(callSign);
							} catch (RadioStationCallSignException rscse) {
								rscse.printStackTrace();
								System.out.println("Information for Radio Station #" + (x + 1) + " was not stored."+
								"\nPlease check your input: call sign should consist of four capitalized letters only."
								+ " \nPlease try again. ");
							
						}
						

			} while (!(callSign.matches("^[A-Z]{4}")));// ask for entry again until complete

			
			do {
				System.out.println("Please enter frequency (decimal number) between 88.00 and 108.00 (inclusive) and hit ENTER:");
				//scanning user input
				carrierFrequency = userInput.nextDouble();
				
				// catching exception if input is entered in wrong format	
				try {
					RadioStation.checkCarrierFrequencyInput(carrierFrequency);
				} catch (RadioStationCarrierFrequencyException rscfe) {
					rscfe.printStackTrace();
					System.out.println("Information for Radio Station #" + (x + 1) + " was not stored."+
							"\nPlease check your input: carrier frequency is a decimal number between 88.00 and 108.00 (inlclusive)."
							+ "\nPlease try again");
				}
				
				
			} while ( (!(88.0 <= carrierFrequency && carrierFrequency <= 108.0)));// ask for entry again until complete
		

			//storing values in array using input and constructor
			RadioStationArray[x] = new RadioStation(callSign, carrierFrequency);
			System.out.println("Information about Radio Station #" + (x + 1) + " was stored successfully");
		}
			System.out.println("\n"+
					"\nYour Six Favorite Radio Stations were successfully saved. "
					+ "Please, see a complete entered information below:");
			for (x = 0; x < 6; x++) {
				System.out.println("Station # " + (x + 1) + "\n" + RadioStationArray[x].toString());
			}
			
	}
	
}