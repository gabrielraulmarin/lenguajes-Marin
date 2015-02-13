/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

/**
 *
 * @author T-107
 */
public class Cuadrado {
    private float lado;
    
    public Cuadrado( float lado)
    {
        
        this.lado=lado;
    }
    
    public Cuadrado()
    {
        
    }

    public float getLado() 
    {
        return lado;
    }

    public void setLado(float lado)
    {
        this.lado = lado;
    }

    
    float calcularArea()
    {
        float area=lado*lado;
        return area;
    }

 
    
}
