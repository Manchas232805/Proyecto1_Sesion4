package Programa;
import java.util.Scanner;
public class Programa04 {
    public static void main (String[] args) {
        //Declarar variables
        int num;
        String mensaje = "";
        Scanner lectura = new Scanner(System.in);
        //Ingreso de datos
        System.out.println("Ingrese un número del 1 al 12: ");
        num = lectura.nextInt();
        //Proceso de datos
        switch (num) {
            case 1:
            case 2:
            case 3:
                mensaje = "Verano";
                break;
            case 4:
            case 5:
            case 6:
                mensaje = "Otoño";
                break;
            case 7:
            case 8:
            case 9:
                mensaje = "Invierno";
                break;
            case 10:
            case 11:
            case 12:
                mensaje = "Primavera";
                break;
            default:
                mensaje = "No es un número del 1 al 12";
        }
        //Salida de datos
        System.out.println("La estacion que corresponde es: " + mensaje);
    }
}
