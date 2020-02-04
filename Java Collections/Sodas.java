public class Sodas {

    private String manufacturer;

    private String soda;

    /**
     * 
     * @param manufacturer
     * @param soda
     */
    public Sodas(String manufacturer, String soda) {
        this.manufacturer = manufacturer;
        this.soda = soda;
    }

    public String toString() {
        return "Manufacturer: " + manufacturer + " Soda: " + soda;
    }
}