
package figuras;


public class Triangulo {
    float base;
    float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Triangulo() {
    }

    public Triangulo(float altura) {
        this.altura = altura;
    }
    
    public float CalcularArea(){
        
      return (base*altura)/2;  
    }
}
