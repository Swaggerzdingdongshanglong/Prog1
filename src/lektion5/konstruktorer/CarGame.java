package lektion5.konstruktorer;

/**
 * 
 * @author tobias.osterlin
 *
 */
public class CarGame {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Creates a object of a car sk vi ger färgen röd
		Car nezhasCar = new Car("silver");

		// skriver ut och hämtar bilens hanstighet
		System.out.println(nezhasCar.getSpeed());
		// sätter vilens hastighet
		nezhasCar.setSpeed(247);
		// skriver ut och hämtar bilens hastighet igen
		System.out.println(nezhasCar.getSpeed());

	}

}
