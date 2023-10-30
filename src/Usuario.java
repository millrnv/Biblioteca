public class Usuario {

    private String nombre;
    private String rut;
    private int nTelefonico;

    public Usuario(String nombre, String rut, int nTelefonico){

        this.nombre = nombre;
        this.rut = rut;
        this.nTelefonico = nTelefonico;

    }

    public String getNombre(){
        return nombre;

    }

    public String getRut(){
        return rut;
    }

    public int getnTelefonico(){
        return nTelefonico;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setRut(String rut){
        this.rut = rut;
    }

    public void setnTelefonico(int nTelefonico){
        this.nTelefonico = nTelefonico;
    }


}
