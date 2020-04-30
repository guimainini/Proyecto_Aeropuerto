package Proyecto;


public class Company {
    private String name;
    private Flight listaFlies[] = new Flight[10];
    private int numFly = 0;

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, Flight v[]){
        this.name = name;
        listaFlies = v;
        numFly = v.length;
    }

    public void insertFlight(Flight flight){
        listaFlies[numFly] = flight;
        numFly++;
    }

    public String getName() {
        return name;
    }

    public int getNumFly() {
        return numFly;
    }

    public Flight getVuelo(int i){
        return listaFlies[i];
    }

    public Flight getVuelo(String id){
        boolean found = false;
        int i=0;
        Flight v=null;
        while((!found)&&(i< listaFlies.length)){
            if(id.equals(listaFlies[i].getIdentifier())){
                found = true;
                v = listaFlies[i];
            }
            i++;
        }
        return v;
    }
}