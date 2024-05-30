package com.mycompany.gestionbiblioteca;

public class Biblioteca {    
    private LibroService libroservice;
    private PersonaService personaservice;
    private PersonaService autorservice;

    public Biblioteca(LibroService libroservice, PersonaService personaservice, PersonaService autorservice){
        this.libroservice = libroservice;
        this.personaservice = personaservice;
        this.autorservice = autorservice;
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
        if (!libroservice.ExisteLibro(nomLibro)) {
            autorservice.AgregarPersona(nombreAutor,dni);
            Persona i = autorservice.ObtenerPersona(dni);
            libroservice.AgregarLibro(nomLibro, genero, i);
        }else{
            System.out.println("\nEse Libro NO Existe");
        }
    }
    
    public void EliminarLibro(String nombre){
        libroservice.EliminarLibro(nombre);
    }
    
    public void BuscarLibroNombre(String nombre){
        libroservice.LibroNombre(nombre);
    }
    
    public void BuscarLibrosAutor(int dni){
        libroservice.LibrosAutor(autorservice.ExistePersona(dni),autorservice.ObtenerPersona(dni));
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
