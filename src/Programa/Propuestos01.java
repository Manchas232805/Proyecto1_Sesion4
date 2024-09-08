package Programa;
import java.util.Scanner;
public class Propuestos01 {
    public static void main(String[] args) {
        //Declarar varibles
        int num;
        String mensaje = "";
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese un nÚmero del 1 al 5: ");
        num = lectura.nextInt();
        //Proceso de datos
        switch (num) {
            case 1:
                mensaje = "uno";
                break;
            case 2:
                mensaje = "dos";
                break;
            case 3:
                mensaje = "tres";
                break;
            case 4:
                mensaje = "cuatro";
                break;
            case 5:
                mensaje = "cinco";
                break;
        }
        //Salida de datos
        System.out.println(mensaje);
    }
}
