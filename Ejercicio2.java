import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int nota;
        int aprobado = 0;
        int suspenso = -1;
        double numeroNotas = -1;
        int sumaNotas = 1;

        do{
            System.out.println("Introduzca una nota (-1 para salir): ");
            nota = s.nextInt();
            if(nota >= 5) {
                aprobado++;
            }
            else{
                suspenso++;
            }
            numeroNotas++;
            sumaNotas = sumaNotas+nota;
        }while(nota != -1);

        System.out.println("La media es " + sumaNotas/numeroNotas);
        System.out.println("Aprobados: " + aprobado + " - " + "Suspensos: " + suspenso);
    }
}
