class Bibliotecario {

        private String nombre;
        private String rut;
        private String direccion;
        private int id;

        public Bibliotecario(String nombre, String rut, String direccion, int id){

            this.nombre = nombre;
            this.rut = rut;
            this.direccion = direccion;
            this.id = id;


        }

        public String getNombre(){
            return nombre;
        }

        public String getRut(){
            return rut;
        }

        public String getDireccion(){
            return direccion;
        }

        public int getId(){
            return id;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }


        public void setRut(String rut){
            this.rut = rut;
        }


        public void setDireccion(String direccion){
            this.direccion = direccion;
        }


        public void setId(int id){
            this.id = id;
        }


}




