package Proyecto;

public class PublicAirport extends Aeropuerto {
    private double grant;

    public PublicAirport(String name, String city, String country) {
        super(name, city, country);
    }

    public PublicAirport(String name, String city, String country, Company[] c, double grant) {
        super(name, city, country, c);
        this.grant = grant;
    }

    public PublicAirport(String name, String city, String country, double grant) {
        super(name, city, country);
        this.grant = grant;
    }

    public double getGrant() {
        return grant;
    }
}
