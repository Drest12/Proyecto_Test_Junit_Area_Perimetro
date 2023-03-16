package proyecto_area;

/**
 *
 * @author Antony
 */
public class Triangulo {
    
    float lado1;
    float lado2;
    float lado3;

    public Triangulo() {
    }

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    float area_tri(){
        
        float area = (lado1*lado2)/2;
        return area;
    }
    
    float perimetro_tri(){
        
        float perimetro = (lado1+lado2+lado3);
        return perimetro;
    }
    
}
