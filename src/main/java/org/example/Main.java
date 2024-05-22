package org.example;


public class Main {


    public static void main(String[] args) {
        System.out.println("hola mundo");

    }

    static class Usuario {
        private int id;
        private String nombre;

        public Usuario(int id, String nombre) {
            this.id = id;
            this.nombre = nombre;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setName(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Usuario{" +
                    "id=" + id +
                    ", Nombre='" + nombre + '\'' +
                    '}';
        }
    }
}