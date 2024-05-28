package com.mycompany.gestionbiblioteca;

public class Biblioteca {    
    private LibroService libroservice;
    private PersonaService personaservice;

    public Biblioteca(LibroService libroservice, PersonaService personaservice){
        this.libroservice = libroservice;
        this.personaservice = personaservice;
    }

    public LibroService getLibroservice() {
        return libroservice;
    }

    public void setLibroservice(LibroService libroservice) {
        this.libroservice = libroservice;
    }

    public PersonaService getPersonaservice() {
        return personaservice;
    }

    public void setPersonaservice(PersonaService personaservice) {
        this.personaservice = personaservice;
    }

    //-----------------------------------------------
    //Metodos para gestionar Libros
    //-----------------------------------------------
    public void AgregarLibro(String nomLibro,String genero, String nombreAutor, int dni){
        AgregarPersona(nombreAutor,dni);
        Persona i = personaservice.ObtenerPersona(dni);
        libroservice.AgregarLibro(nomLibro, genero, i);
    }
    
    public void EliminarLibro(String nombre){
        libroservice.EliminarLibro(nombre);
    }
    
    public void BuscarLibroNombre(String nombre){
        libroservice.LibroNombre(nombre);
    }
    
    public void BuscarLibrosAutor(int dni){
        libroservice.LibrosAutor(personaservice.ExistePersona(dni),personaservice.ObtenerPersona(dni));
    }
    
    public void ListarLibros(){
        libroservice.ListarLibros();
    }
    //-----------------------------------------------
    //Metodos para gestionar Personas
    //-----------------------------------------------
    public void AgregarPersona(String nombre, int dni){
        personaservice.AgregarPersona(nombre, dni);
    }
    
    public void EliminarCliente(int dni){
        personaservice.EliminarCliente(dni);
    }
    
    public void ListarPersonas(){
        personaservice.ListarPersonas();
    }
}
