
import static java.lang.Math.PI;
import java.util.Scanner;


public class P16 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        double radio;
        System.out.println("Ingrese el radio del circulo(cm)");
        radio = input.nextDouble();
        
        // Se multiplica PI por el cuadrado del radio dado y se imprime el producto
        System.out.println("El radio del circulo es " + PI*radio*radio);
    }
    
}
