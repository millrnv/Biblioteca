import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;        //lista de libros
    private String nombreBiblioteca;
    private String direccion;



    //constructor insertando parametros de nombreBiblioteca y direccion
    public Biblioteca(String nombreBiblioteca, String direccion){

        this.nombreBiblioteca = nombreBiblioteca;
        this.direccion = direccion;
        this.libros = new ArrayList<>();

    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public String getNombreBiblioteca(){
        return this.nombreBiblioteca;
    }

    public String getDireccion(){
        return this.direccion;

    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public boolean agregarLibro(Libro libro) {
        if (!libroExiste(libro)) {
            this.libros.add(libro);
            return true;
        } else {
            return false;
        }
    }

    public Libro buscarLibro(String nombre) {
        for (Libro libro : this.libros) {
            if (libro.dameNombre().equals(nombre)) {
                return libro;
            }
        }

        return null;
    }

    public List<Libro> buscarLibroPorAutor(String autor) {
        List<Libro> librosAutor = new ArrayList<Libro>();
        for (Libro libro : this.libros) {
            if (libro.dameAutor().equals(autor))
                librosAutor.add(libro);
        }
        return librosAutor;
    }
    public boolean libroExiste(Libro libro){
        for(Libro l : this.libros) {
            if(libro.getISBN().equals(l.getISBN())) {
                return true;
            }
        }

        return false;
    }
}





