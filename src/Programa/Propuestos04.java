package Programa;
import java.util.Scanner;
public class Propuestos04 {
    public static void main (String[] args) {
        //Declarar variables
        int num;
        String texto = "";
        Scanner lectura = new Scanner(System.in);
        //Ingreso de datos
        System.out.print("Ingrese un número (1,2,3,4,6,12): ");
        num = lectura.nextInt();
        //Proceso de datos
        switch (num) {
            case 1: texto = "mensual"; break;
            case 2: texto = "bimestral"; break;
            case 3: texto = "trimestral"; break;
            case 4: texto = "cuatrimestral"; break;
            case 6: texto = "semestral"; break;
            case 12: texto = "anual"; break;
            default: texto = "Número no valido"; break;
        }
        //Salida de datos
        System.out.print(texto);
    }
}
