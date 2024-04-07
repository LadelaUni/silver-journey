
import java.util.Scanner;


public class P19 {

  
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        double x, y, z;
        System.out.println("Ingrese el valor de x");
        x = input.nextDouble();
        System.out.println("Ingrese el valor de y");
        y = input.nextDouble();
        System.out.println("Ingrese el valor de z");
        z = input.nextDouble();
        
        //Se multiplica e imprime 12 (2x2x3) por el valor de x*y*z
        System.out.println("El valor de 2x2y3z es " + 12*x*y*z);
    }
    
}
