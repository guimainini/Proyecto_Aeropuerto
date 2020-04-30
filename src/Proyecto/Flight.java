package Proyecto;

public class Flight {
    private String identifier;
    private String originCity;
    private String destinationCity;
    private double price;
    private int MaxNumPassengers;
    private int currentNumPassengers;
    private Passenger listPassenger [];

    public Flight(String identifier, String originCity, String destinationCity, double price, int MaxNumPassengers) {
        this.identifier = identifier;
        this.originCity = originCity;
        this.destinationCity = destinationCity;
        this.price = price;
        this.MaxNumPassengers = MaxNumPassengers;
        this.currentNumPassengers = 0;
        this.listPassenger = new Passenger[MaxNumPassengers];
    }

    public void insertPassenger(Passenger passenger){
        listPassenger[currentNumPassengers] = passenger;
        currentNumPassengers++;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getOriginCity() {
        return originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxNumPassengers() {
        return MaxNumPassengers;
    }

    public int getCurrentNumPassengers() {
        return currentNumPassengers;
    }
    //sobrecarga de metodos
    public Passenger getPassenger(int i){
        return  listPassenger[i];
    }

    //sobrecarga de metodos
    public Passenger getPassenger(String pasaporte){
        boolean found = false;
        int i=0;
        Passenger pas=null;

        while((!found)&&(i< listPassenger.length)){

                //pasaporte == listaPasajeros[i].getPasaporte()

            if(pasaporte.equals(listPassenger[i].getPassport())){
                found = true;
                pas = listPassenger[i];
            }
            i++;
        }
        return pas;
    }






}
