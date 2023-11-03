import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int planta;
        int recorrido;

        do{
            System.out.println("Introduzca una planta (-1 para salir): ");
            planta = s.nextInt();

            recorrido = planta  ;
        }while(planta != -1);

        System.out.println(recorrido + 1);
    }
}
