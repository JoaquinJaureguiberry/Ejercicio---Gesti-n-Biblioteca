package com.mycompany.gestionbiblioteca;


public class Libro {    
    private String nombre;
    private String genero;
    private Persona autor;
   
    public Libro(){
    }

    public Libro(String nombre, String genero, Persona autor) {
        this.nombre = nombre;
        this.genero = genero;
        this.autor = autor;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        return "Libro -> " + "Nombre: " + nombre + ", Género: " + genero + ", Autor( " + autor + ")";
    }
}
