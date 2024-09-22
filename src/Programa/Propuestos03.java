package Programas;
import java.util.Scanner;
public class Propuestos03 {
    public static void main (String[] args) {
        //Declarar variables
        int num;
        String texto = "";
        Scanner lectura = new Scanner(System.in);
        //Ingreso de datos
        System.out.print("Ingrese un número del 1 al 6: ");
        //Proceso de datos
        num = lectura.nextInt();
        switch (num) {
            case 1: texto = "one"; break;
            case 2: texto = "two"; break;
            case 3: texto = "three"; break;
            case 4: texto = "four"; break;
            case 5: texto = "five"; break;
            case 6: texto = "six"; break;
        }
        //Salida de datos
        System.out.println(texto);
    }
}
