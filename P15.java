
import java.util.Scanner;

public class P15 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        double precio, cantidad;
        System.out.println("Valor del producto(numerico)");
        precio = input.nextDouble();
        System.out.println("Cantidad que va a llevar(numerico)");
        cantidad = input.nextDouble();
        System.out.println("El precio a pagar es "+ cantidad*precio);
    }
    
}
