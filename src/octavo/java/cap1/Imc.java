
package octavo.java.cap1;

/**
 *
 * @author T-107
 */
public class Imc
{

   private float estatura;
   private float peso;
    public void setPeso(float peso)
    {
        this.peso=peso;
    }
    public void seEstatura(float estatura)
    {
        this.estatura=estatura;
    }
    
    public float calcular()
  
    {
        
    return  peso/(estatura*estatura); 
      
    }
 }
