package context;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Entrada de datos
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        //Salida
        System.out.println("Hola, " + nombre);

        //Cierre Scanner
        sc.close();
    }
}