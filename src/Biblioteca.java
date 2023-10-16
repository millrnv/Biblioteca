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

    public boolean agregarLibro(String nombre, String autor, String editorial, String ISBN){
        if(buscarLibro(nombre, autor, editorial, ISBN) == null){
            Libro libro = new Libro(nombre, autor, editorial, ISBN);
            this.libros.add(libro);
            return true;
        }
        else{
            return false;
        }
    }
    public Libro buscarLibro(String nombre, String autor, String editorial, String ISBN){
        for(Libro libro : this.libros){
            if(libro.getISBN().equals(ISBN) && libro.dameNombre().equals(nombre)&& libro.dameAutor().equals(autor)&&libro.dameEditorial().equals(editorial)) {
                return libro;
            }
        }
        return null;
    }



    public List<Libro> buscarLibroPorAutor(String autor){
        List<Libro> librosAutor = new ArrayList<Libro>();
        for(Libro libro : this.libros){
            if(libro.dameAutor().equals(autor))
                librosAutor.add(libro);
        }
        return librosAutor;
    }




    public void libroExiste(){


    }



}



