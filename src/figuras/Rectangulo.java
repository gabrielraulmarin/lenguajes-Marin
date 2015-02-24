
package figuras;


public class Rectangulo {
    private float LadoMayor;
    private float LadoMenor;

    public Rectangulo() {
    }

    public Rectangulo(float LadoMayor, float LadoMenor) {
        this.LadoMayor = LadoMayor;
        this.LadoMenor = LadoMenor;
    }
    
    public float CalcularArea(){
        return LadoMayor*LadoMenor;
    }

    public float getLadoMayor() {
        return LadoMayor;
    }

    public void setLadoMayor(float LadoMayor) {
        this.LadoMayor = LadoMayor;
    }

    public float getLadoMenor() {
        return LadoMenor;
    }

    public void setLadoMenor(float LadoMenor) {
        this.LadoMenor = LadoMenor;
    }
    
}
