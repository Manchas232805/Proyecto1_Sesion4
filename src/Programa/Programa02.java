package Programa;
import java.util.Scanner;
public class Programa02 {
    public static void main (String[] args) {
        int num;
        String dia = "";
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese un número del (1 al 7): ");
        num = lectura.nextInt();
        //Proceso de datos
        switch (num) {
            case 1: dia = "Lunes"; break;
            case 2: dia = "Martes"; break;
            case 3: dia = "Miercoles"; break;
            case 4: dia = "Jueves"; break;
            case 5: dia = "Viernes"; break;
            case 6: dia = "Sábado"; break;
            case 7: dia = "Domingo"; break;
        }
        //Salida de datos
        System.out.println("El nombre del día de la semnaa es : " + dia);
    }
}
