
package figuras;


public class Circulo implements Superficies {
    
    float Radio;

    public float getRadio() {
        return Radio;
    }

    public void setRadio(float Radio) {
        this.Radio = Radio;
    }

    public Circulo() {
    }

    public Circulo(float Radio) {
        this.Radio = Radio;
    }
    
    public float CalcularArea() {
        System.out.print("El area del Circulo es:");
        
        return 3.1416f*Radio*Radio;
    }
}

