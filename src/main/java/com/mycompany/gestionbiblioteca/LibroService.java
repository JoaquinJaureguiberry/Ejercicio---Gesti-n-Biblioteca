
package com.mycompany.gestionbiblioteca;

import java.util.ArrayList;
import java.util.List;

public class LibroService {
    private List<Libro> libros;
    
    public LibroService(){
        this.libros = new ArrayList<>();
    }
    
    public void AgregarLibro(String nombreLibro, String genero, Persona autor){
        libros.add(new Libro(nombreLibro,genero,autor));
    }
    
    public void EliminarLibro(String nombre){
        if (ExisteLibro(nombre)) {
            libros.remove(IndiceLibro(nombre));
            System.out.println("\nEl Libro fue Eliminado.");
        }else{
            System.out.println("\nERROR ese nombre de Libro no EXISTE");
        }
    }
    
    public void LibroNombre(String nombre){
        if (ExisteLibro(nombre)) {
            Libro i = ObtenerLibro(nombre);
            System.out.println("\nLos datos del Libros son:");
            System.out.println(i.toString());
        }else{
            System.out.println("\nERROR ese Nombre NO Existe");
        }
    }
    
    public void LibrosAutor(boolean existe, Persona autor){
        if (existe) {
            ListarLibrosAutor(autor);
        }else{
            System.out.println("ERROR no Existe ese Nombre");
        }
    }
    
    public boolean ExisteLibro(String nombre){
        boolean existe = false;
        for (Libro i: libros) {
            if (i.getNombre().equals(nombre)) {
                return existe = true;
            }
        }
        return existe;
    }
    
    public int IndiceLibro(String nombre){
        int indice = 0;
        for (Libro i: libros) {
            if (i.getNombre().equals(nombre)) {
                return indice;
            }
            indice++;
        }
        return 0;
    }
    
    public Libro ObtenerLibro(String nombre){
        Libro obj = new Libro();
        for (Libro objeto: libros) {
            if (objeto.getNombre().equals(nombre)) {
                return objeto;
            }
        }
        return obj;
    }
    
    public void ListarLibrosAutor(Persona autor){
        System.out.println("Los Libros del " + autor.getNombre() + " son:");
        for (Libro i : libros) {
            if (i.getAutor().equals(autor)) {
                System.out.println(i.toString());
            }
        }
    }
    
    public void ListarLibros(){
        System.out.println("\nLa Lista Libros es:");
        int sum = 1;
        for (Libro i: libros) {
            System.out.println(" " + sum++ + "- " + i.toString());
        }
    }
}