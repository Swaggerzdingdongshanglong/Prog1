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
		// Creates a object of a car sk vi ger f�rgen r�d
		Car nezhasCar = new Car("silver");

		// skriver ut och h�mtar bilens hanstighet
		System.out.println(nezhasCar.getSpeed());
		// s�tter vilens hastighet
		nezhasCar.setSpeed(247);
		// skriver ut och h�mtar bilens hastighet igen
		System.out.println(nezhasCar.getSpeed());

	}

}
