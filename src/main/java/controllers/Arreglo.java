package controllers;

import models.Persona;
import views.ShowConsole;

public class Arreglo {
    ShowConsole showConsole = new ShowConsole();
    private Persona [] personas;
    public Persona[] leerPersonas () {
        showConsole.showMessage("---- INGRESO DE PERSONAS");
        int tam = showConsole.getTam();
        personas = new Persona[tam];
        for (int i = 0; i < tam; i++) {
            showConsole.showMessage("INGRESO DE PERSONA " + (i+1));
            personas[i]=new Persona(showConsole.getName(),showConsole.getEdad());
        }
        //imprimir(personas);
        return personas;
    }
    public Persona[] ordenarPorEdad(Persona[] personas) {
        showConsole.showMessage("\nOrdenando Personas ...\n");
        int n = personas.length;
        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (personas[j].getEdad() < personas[minIdx].getEdad()) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                Persona aux = personas[i];
                personas[i] = personas[minIdx];
                personas[minIdx] = aux;
            }
        }
        return personas;
    }
    public void imprimir(Persona[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " , ");
        }
    }



}
