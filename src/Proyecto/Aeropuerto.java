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

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compañia[] getListaCompanias() {
        return listaCompanias;
    }

    public int getNumComponia() {
        return numComponia;
    }

    public Compañia getCompañia(int i){
        return listaCompanias[i];
    }

    public Compañia getCompañia(String nombre){
        boolean encontrado = false;
        int i = 0;
        Compañia c = null;
        while((!encontrado)&& (i<listaCompanias.length)){
            if(nombre.equals(listaCompanias.length)){
                encontrado=true;
                c = listaCompanias[i];
            }
            i++;

        }

        return c;
    }




}
