package Proyecto;

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private Compañia listaCompanias[] = new Compañia[10];
    private  int numComponia;

    //constructor
    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numComponia = 0;
    }
    //constructor 2
    public Aeropuerto(String nombre, String ciudad, String pais,Compañia c[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaCompanias = c;
        this.numComponia = c.length;
    }

    public void insertarCompania(Compañia compañia){
        listaCompanias[numComponia] = compañia;
        numComponia++;
    }





}
