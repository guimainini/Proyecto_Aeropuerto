package Proyecto;

public class Aeropuerto {
    private String name;
    private String city;
    private String country;
    private Company companyList[] = new Company[10];
    private  int numCompany;

    //constructor
    public Aeropuerto(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.numCompany = 0;
    }
    //constructor 2
    public Aeropuerto(String name, String city, String country, Company c[]) {
        this.name = name;
        this.city = city;
        this.country = country;
        companyList = c;
        this.numCompany = c.length;
    }

    public void insertCompany(Company company){
        companyList[numCompany] = company;
        numCompany++;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Company[] getCompanyList() {
        return companyList;
    }

    public int getNumCompany() {
        return numCompany;
    }

    public Company getCompany(int i){
        return companyList[i];
    }

    public Company getCompany(String nombre){
        boolean found = false;
        int i = 0;
        Company c = null;
        while((!found)&& (i< companyList.length)){
            if(nombre.equals(companyList.length)){
                found=true;
                c = companyList[i];
            }
            i++;

        }

        return c;
    }




}
