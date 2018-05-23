package com.veterinapp.model;

public class Contacto {

        public String nombre;
        public String apellido;
        public String direccion;
        public String email;
        public String motivo;
        public boolean mostrar;
        public int codigo;

        public Contacto(){

        }

        public Contacto(String nombre, String apellido,String direccion, String email, String motivo,
                        boolean mostrar, int codigo){
            this.nombre=nombre;
            this.apellido=apellido;
            this.apellido=direccion;
            this.email=email;
            this.motivo=motivo;
            this.mostrar=mostrar;
            this.codigo=codigo;

    }

}


