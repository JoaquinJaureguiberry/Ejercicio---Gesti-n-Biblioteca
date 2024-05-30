package com.mycompany.gestionbiblioteca;

import java.util.ArrayList;
import java.util.List;

public class PersonaService {
    private List<Persona> personas;

    public PersonaService() {
        this.personas = new ArrayList<>();
    }
    
    public void AgregarPersona(String nombre, int dni){
        if (!ExistePersona(dni)) {
            personas.add(new Persona(nombre,dni));
        }
    }
    
    public void EliminarCliente(int dni){
        if (ExistePersona(dni)) {
            personas.remove(IndicePersona(dni));
            System.out.println("Cliente ELIMINADO\n");
        }else{
            System.out.println("\nERROR no existe el DNI: " + dni);
        }
    }
    
    public boolean ExistePersona(int dni){
        boolean existe = false;
        for (Persona i: personas) {
            if (i.getDni()==dni) {
                return existe = true;
            }
        }
        return existe;
    }
    
    public int IndicePersona(int dni){
        int indice = 0;
        for (Persona i: personas) {
            if (i.getDni()==dni) {
                return indice;
            }
            indice++;
        }
        return indice;
    }
    
    public Persona ObtenerPersona(int dni){
        Persona p = new Persona();
        for (Persona i: personas) {
            if (i.getDni()==dni) {
                return i;
            }
        }
        return p;
    }
    
    public void ListarPersonas(){
        System.out.println("\nLa Lista Personas es:");
        int sum = 1;
        for (Persona i: personas) {
            System.out.println(" " + sum++ + "- " + i.toString());
        }
    }
}
