
package unitec.proyecto.geometria;


public class Cuadrado {
    
    private float lado;
    
    public Cuadrado( float lado) throws NumeroNoNegativoException
    {
        ValidarValorNoNegativo.validar(lado);
        
        this.lado=lado;
        
    }
    
    public Cuadrado()
    {
        
    }

    public float getLado() 
    {
        return lado;
    }

    public void setLado(float lado) throws NumeroNoNegativoException
    {
         ValidarValorNoNegativo.validar(lado);
        this.lado = lado;
    }

    
    float calcularArea()
    {
        float area=lado*lado;
        return area;
    }

 
    
}
