package Proyecto;

public class Passenger {
    private String name;
    private String passport;
    private String nationality;

    public Passenger(String name, String passport, String nationality) {
        this.name = name;
        this.passport = passport;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getNacionalidad() {
        return nationality;
    }

    public void setNacionalidad(String nationality) {
        this.nationality = nationality;
    }
}