import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca un número impar mayor o igual a 1: ");
        int numero = s.nextInt();
        char caracter = 'X';
        char blanco = ' ';


        if(numero%2 !=0) {
            System.out.println(caracter);
        }else {
            System.out.println("Número no válido ");
        }
    }
}
