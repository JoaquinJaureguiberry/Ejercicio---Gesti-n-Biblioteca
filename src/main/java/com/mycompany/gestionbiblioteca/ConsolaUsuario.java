package com.mycompany.gestionbiblioteca;

import java.util.Scanner;

public class ConsolaUsuario {
    private Biblioteca biblioteca;
    private Scanner scanner;
    private int teclado, dni;
    private String nomLibro, nomPersona, genero;
    
    public ConsolaUsuario(Biblioteca biblioteca){
        this.biblioteca = biblioteca;
        this.scanner = new Scanner(System.in);
        this.teclado = teclado = 0;
    }
    
    public void run(){
        for (int i = 0; i < 1;) {
            Menu();
            pedirTeclado();
            switch (teclado){
                case 1:
                    AgregarLibro();
                    break;
                case 2:
                    EliminarLibro();
                    break;
                case 3:
                    LibroNombre();
                    break;
                case 4:
                    LibrosAutor();
                    break;
                case 5:
                    AgregarCliente();
                    break;
                case 6:
                    EliminarCliente();
                    break;
                case 7:
                    i++;
                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta.");
                    break;
            }
        }
    }
    
    private int pedirTeclado(){
        return teclado = scanner.nextInt();
    }
    
    private void Menu(){
        System.out.println("""
                           ------------------------------
                             GESTI\u00d3N BIBLIOTECA
                           ------------------------------
                             1 - Agregar un libro
                             2 - Eliminar un libro
                             3 - Buscar un libro por el nombre
                             4 - Buscar todos los libros de un autor
                             5 - Agregar un cliente
                             6 - Eliminar un cliente
                             7 - Salir
                           ------------------------------
                             Seleccione una opción:
                           """);
    }
    
    private void AgregarLibro(){
        System.out.println("Coloque el nombre del Libro:");
        nomLibro = scanner.next();
        System.out.println("Coloque el género del Libro:");
        genero = scanner.next();
        System.out.println("Coloque el nombre del Autor");
        nomPersona = scanner.next();
        System.out.println("Coloque el DNI del Autor, sin puntos:");
        dni = scanner.nextInt();
        biblioteca.AgregarLibro(nomLibro, genero, nomPersona, dni);
        biblioteca.ListarLibros();
    }
    
    private void EliminarLibro(){
        biblioteca.ListarLibros();
        System.out.println("Coloque el Nombre del Libro a Eliminar: ");
        nomLibro = scanner.next();
        biblioteca.EliminarLibro(nomLibro);
    }
    
    private void LibroNombre(){
        System.out.println("\nColoque el Nombre del Libro:");
        nomLibro = scanner.next();
        biblioteca.BuscarLibroNombre(nomLibro);
    }
    
    private void LibrosAutor(){
        System.out.println("\nColoque el DNI del Autor:");
        dni = scanner.nextInt();
        biblioteca.BuscarLibrosAutor(dni);
    }
    
    private void AgregarCliente(){
        System.out.println("Coloque el nombre del Cliente:");
        nomPersona = scanner.next();
        System.out.println("Coloque el DNI del Cliente, sin puntos:");
        dni = scanner.nextInt();
        biblioteca.AgregarPersona(nomPersona, dni);
        biblioteca.ListarPersonas();
    }
    
    private void EliminarCliente(){
        biblioteca.ListarPersonas();
        System.out.println("Coloque el N° de DNI del Cliente a eliminar:");
        dni = scanner.nextInt();
        biblioteca.EliminarCliente(dni);
    }
}
