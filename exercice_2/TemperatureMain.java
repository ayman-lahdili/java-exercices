package exercice_2;


/**
 * class pour tester la class Temperature
 */
public class TemperatureMain {
	public static void main(String[] args) {
		System.out.println(new Temperature(50));
		//OUT: La température est de 122 degrés Fahrenheit ou de 50 degrés Celsius.
		
		System.out.println(new Temperature(0));
		//OUT: La température est de 32 degrés Fahrenheit ou de 0 degrés Celsius.
		
		System.out.println(new Temperature(-50));
		//OUT: La température est de -58 degrés Fahrenheit ou de -50 degrés Celsius.
		
		System.out.println(new Temperature(250));
		//OUT: La température est de 482 degrés Fahrenheit ou de 250 degrés Celsius.
	}
}
