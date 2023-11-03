import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int numero = s.nextInt();
        int numeroNuevo = 0;

        for(int i = 0; numeroNuevo<=numero-3; i++ ){
            if(numero%2 == 0){
                numeroNuevo = 10+i*5;
                System.out.print(numeroNuevo+",");
            }else {
                numeroNuevo = 10+i*3;
                System.out.print(numeroNuevo+",");
            }
        }
    }
}
