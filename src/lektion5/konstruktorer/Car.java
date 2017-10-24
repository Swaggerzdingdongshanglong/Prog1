package lektion5.konstruktorer;

/**
 * First class rn.
 * 
 * @author tobias.osterlin
 * @category car
 */
public class Car {
	private int numberOfDoors = 2;
	private int numberOfWheels = 4;
	private String color = "red";
	private String color2 = "black";
	private int antaletRattar = 1;
	private String carBrand = "Aston Martin One 77";
	private int speed = 0;

	public Car(String selectedColour) {
		color = selectedColour;
	}

	/**
	 * changing speed of the car.
	 * 
	 * @param newSpeed
	 *            int - new speed of "car"
	 */
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	/**
	 * returns the value of the speed variable
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * set new color
	 * @param newColor
	 */
	public void setColor(String newColor) {
		color = newColor;
		/**
		 * setting new color
		 */
	}

	public String getColor() {
		return color;

	}
}
