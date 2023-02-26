package exercice_2;

/**
 * Cette classe représente une température en degrés Celsius et Fahrenheit.
 * Elle permet de convertir une température en Celsius en une température en Fahrenheit.
 */
public class Temperature {
    private int temperature; // température en degrés Celsius
	
	/**
     * Constructeur pour la classe Temperature.
     * @param temperature température en degrés Celsius
     */
	public Temperature(int temperature) {
		this.temperature = temperature;
	}
	
	/**
     * Retourne la température en degrés Celsius.
     * @return la température en degrés Celsius
     */
	public int getCelsius() {
		return temperature;
	}

	/**
     * Retourne la température en degrés Fahrenheit.
     * @return la température en degrés Fahrenheit
     */
	public int getFahrenheit() {
		return 9*(temperature)/5 + 32;
	}

	 /**
     * Retourne une chaîne de caractères qui représente la température en degrés Fahrenheit et Celsius.
     * @return une chaîne de caractères qui représente la température en degrés Fahrenheit et Celsius
     */
	@Override
	public String toString() {
		return "La température est de " + getFahrenheit() +" degrés Fahrenheit" + " ou de " + getCelsius() + " degrés Celsius.";
	}
}
