public class Sodas {

    private String manufacturer;

    private String soda;

    /**
     * Constructor for Sodas
     * @param manufacturer
     * @param soda
     */
    public Sodas(String manufacturer, String soda) {
        this.manufacturer = manufacturer;
        this.soda = soda;
    }

    /**
     * returns a String
     */
    public String toString() {
        return "Manufacturer: " + manufacturer + " Soda: " + soda;
    }
}