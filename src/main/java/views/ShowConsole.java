package views;

import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);

    public void showMessage(String mensaje){
        System.out.println(mensaje);
    }
    public String getName(){
        System.out.print("\tIngrese el nombre de la persona → ");
        String nombre = scanner.next();
        return nombre;
    }
    public int getEdad(){
        int edad = 0;
        do{
            System.out.print("\tIngrese la edad → ");
            edad = scanner.nextInt();
            if(edad < 0){
                showMessage("El edad no puede ser negativo");
            }
        }while (edad<0);

        return edad;
    }
    public int getTam(){
        System.out.print("\tIngrese el numero de personas que desea listar → ");
        int tam = scanner.nextInt();
        return tam;
    }


}
