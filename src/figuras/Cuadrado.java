
package figuras;

public class Cuadrado implements Superficies {
    float Lado;

    public float getLado() {
        return Lado;
    }

    public void setLado(float Lado) {
        this.Lado = Lado;
    }

    public Cuadrado() {
    }

    public Cuadrado(float Lado) {
        this.Lado = Lado;
    }
    
   public float CalcularArea(){
       
       System.out.print("El area del Cuadrado es: ");
       
       return Lado*Lado;
   } 
}
