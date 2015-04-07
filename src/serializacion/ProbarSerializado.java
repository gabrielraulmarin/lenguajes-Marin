
package serializacion;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ProbarSerializado {

    
    public static void main(String[] args) {
       //creamos un usuario
        Usuario u=new Usuario();
              u.setEmail("rapido@gmail.com");  
              u.setNombre("Juan Carlos");  
              u.setSueldo(40000);  
              PersistenciaUsuario pu=new PersistenciaUsuario();
        try {
            pu.guardar(u);
            System.out.println("Usuario guardado con exito");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
