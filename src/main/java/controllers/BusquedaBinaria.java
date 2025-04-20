package controllers;

import models.Persona;
import views.ShowConsole;

public class BusquedaBinaria {
    private Persona[] personas;
    private ShowConsole showConsole;
    private Arreglo arreglo;

    public BusquedaBinaria(Persona[] personas) {
        this.personas = personas;
        showConsole = new ShowConsole();
        arreglo = new Arreglo();
    }
    public int buscarPersonaPorEdad(int edad) {
        personas = arreglo.ordenarPorEdad(personas);
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int central = (bajo + alto) / 2;
            for (int i = bajo; i <= alto; i++) {
                System.out.print(personas[i].getEdad() + " | ");
            }
            System.out.print("\n\tbajo = " + bajo + "\talto = " + alto + "\tcentro = " + central +"\tvalorCentro = " + personas[central].getEdad());
            if (personas[central].getEdad() == edad) {
                System.out.println("\t-- ENCONTRADO");
                return central;
            }
            if (personas[central].getEdad() < edad) {
                System.out.println("\t--> DERECHA");
                bajo = central + 1;
            } else {
                System.out.println("\t<-- IZQUIERDA");
                alto = central - 1;
            }
        }
        return -1;
    }
    public void mostrarPersonaPorEdad () {
        showConsole.showMessage("----- BUSCAR PERSONA POR EDAD ------");
        int edadToFind = showConsole.getEdad();
        int index = buscarPersonaPorEdad(edadToFind);
        if (index == -1) {
            showConsole.showMessage("No se Encontro a la persona con la edad de " + edadToFind);
        }
        else {
            showConsole.showMessage("La Persona con edad de "+edadToFind+" es " + personas[index].getNombre());
        }
    }
}
