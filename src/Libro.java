class Libro {

    private String nombre;
    private String autor;
    private String editorial;


    public Libro(String nombre, String autor, String editorial) {

        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;

    }

    public String dameNombre() {
        return this.nombre;

    }

    public String dameAutor() {
        return this.autor;

    }

    public String dameEditorial() {
        return this.editorial;

    }

    public void setNombre(){
        this.nombre = nombre;

    }

    public void setAutor(){
        this.autor = autor;

    }

    public void setEditorial(){
        this.editorial = editorial;

    }

}
