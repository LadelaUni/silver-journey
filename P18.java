
import java.util.Scanner;


public class P18 {


    public static void main(String[] args) {
        var input = new Scanner (System.in);
        double longitud_del_lado, area, perimetro;
        System.out.println("Ingrese la longitud del lado del cuadrado(cm)");
        longitud_del_lado = input.nextDouble();
        
        //Se multiplica la longitud del lado por si misma y se establece como el área
        area = longitud_del_lado*longitud_del_lado;
        
        //Se multiplica la longitud del lado por 4 y se establece como el perímetro
        perimetro = 4*longitud_del_lado;
        
        //Se imprime el área y el perímetro
        System.out.println("El perimetro del cuadrado es " + perimetro + " y su area es " + area);
               
    }
    
}
