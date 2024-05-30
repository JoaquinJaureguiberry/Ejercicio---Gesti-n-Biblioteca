package com.mycompany.gestionbiblioteca;


public class GestionBiblioteca {

    public static void main(String[] args) {
        LibroService libroservice = new LibroService();
        PersonaService personaservice = new PersonaService();
        PersonaService autorservice = new PersonaService();
        Biblioteca biblioteca = new Biblioteca(libroservice, personaservice, autorservice);
        ConsolaUsuario consola = new ConsolaUsuario(biblioteca);
        consola.run();
    }
}
