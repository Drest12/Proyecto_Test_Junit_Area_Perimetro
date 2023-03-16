package proyecto_area;

/**
 *
 * @author Antony
 */
public class Proyecto_Area {

    public static void main(String[] args) {
        
       Rectangulo rectangulo = new Rectangulo (15,10);
       if(rectangulo.altura==0||rectangulo.base==0){
           System.out.println("Error no se puedo calcular");
           
       }
       else{
           System.out.println("El area del rectangulo es....."+rectangulo.area_rec());
           System.out.println("El Perimetro del rectangulo es....."+rectangulo.area_rec());
       }
       
       Triangulo triangulo = new Triangulo (15,15,10);
       if(triangulo.lado1==0||triangulo.lado2==0||triangulo.lado3==0){
           System.out.println("Error no se pudo calcular");
       }
       else{
           System.out.println("El area del triangulo es......"+triangulo.area_tri());
           System.out.println("El Perimetro del triangulo es....."+triangulo.perimetro_tri());
       }
       
    }
    
}
