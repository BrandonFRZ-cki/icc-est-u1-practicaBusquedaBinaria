import controllers.Arreglo;
import controllers.BusquedaBinaria;
import models.Persona;

public class App {
    public static void main(String[] args) {
        Arreglo arreglo = new Arreglo();
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria(arreglo.leerPersonas());
        busquedaBinaria.mostrarPersonaPorEdad();

    }
}
