package proyecto_area;


public class Rectangulo {
    
    float base;
    float altura;

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    float area_rec(){
        
        float area = base*altura;
        return area;
    }
    
    float perimetro_rec(){
        
        float perimetro = altura+base+altura+base;
        return perimetro;
    }
    
}
