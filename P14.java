
import java.util.Scanner;

public class P14 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        double segundos, minutos, horas;
        System.out.println("Ingresa la cantidad de segundos");
        segundos = input.nextDouble();
        minutos = segundos/60;
        horas = minutos/60;
        System.out.println(segundos + " segundo(s) equivalen a " + minutos + " minuto(s), que equivalen a "  + horas + " hora(s)");

    }
}
