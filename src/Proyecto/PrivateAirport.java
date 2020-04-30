package Proyecto;

public class PrivateAirport extends Aeropuerto{
    private String companiesList[] = new String[10];
    private int numCompany;

    public PrivateAirport(String nombre, String ciudad, String country) {
        super(nombre, ciudad, country);
    }

    public PrivateAirport(String name, String city, String country, Company[] c, String e[]) {
        super(name, city, country, c);
        this.companiesList = e;
        numCompany = e.length;
    }

    public void insertCompany(String e[]){
        this.companiesList = e;
        this.numCompany = e.length;
    }

    public void insertOneCompany(String e){
        companiesList[numCompany] = e;
        numCompany++;
    }

    public String[] getCompaniesList() {
        return companiesList;
    }

    public int getNumCompany() {
        return numCompany;
    }
}
