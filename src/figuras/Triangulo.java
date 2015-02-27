
package figuras;


public class Triangulo implements Superficies{
    float base;
    float altura;

    public float getBase() {
        return base;
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
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
        System.out.print("El area del Triangulo es: ");
      return (base*altura)/2;  
    }
}
