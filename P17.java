
public class P17 {

    public static void main(String[] args) {
        // NO SE PUEDE, a menos que se indique que uno es la base y el otro, la altura.
        // Por ejemplo, dado un rectangulo de base 2 y altura 3, por ende, de área 6
        
        // Se establecen 2 lados del rectangulo con el valor de 2, lo cual es correcto
        int lado1, lado2, area;
        lado1 = 2;
        lado2 = 2;
        
        //Si se multiplican entre sí da 4, lo cual es incorrecto, ya que, de antemano sabemos que el área es 6
        area = lado1*lado2;
        System.out.println(area + "??");
        
        //Y dado que la base y la altura no son dependientes entre sí, es imposible saber el valor de una SOLO conociendo el valor de la otra en un rectángulo
        
    }
    
}
