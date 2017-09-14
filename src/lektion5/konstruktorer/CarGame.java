package lektion5.konstruktorer;

public class CarGame {

	public static void main(String[] args) {
		Car nezhasCar = new Car("silver");

		System.out.println(nezhasCar.getSpeed());
		nezhasCar.setSpeed(247);
		System.out.println(nezhasCar.getSpeed());

	}

}
