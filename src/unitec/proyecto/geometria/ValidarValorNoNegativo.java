
package unitec.proyecto.geometria;


public class ValidarValorNoNegativo {
    
    public static void validar(float valor)throws NumeroNoNegativoException{
        
        if(valor<0)throw new NumeroNoNegativoException();
            
            
        
    } 
}
