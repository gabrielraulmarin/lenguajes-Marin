
package serializacion;

import java.io.*;

public class PersistenciaUsuario {
   
    public void guardar(Usuario u)throws Exception{
        
       //este es el paso 1 que es crear el archivo
        File file=new File("D:\\archivaldo.yo");
       //paso 2 sacamos el archivo para llenarlo u escribirlo
        FileOutputStream  fos=new FileOutputStream(file);
       // paso 3 llenar el archivo con algo en este caso es un usuario  
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);
        oos.close();
    
    }
 
    public Usuario leer()throws Exception{
        
          File file=new File("D:\\archivaldo.yo");
          FileInputStream fis=new FileInputStream(file);
          ObjectInputStream ois=new ObjectInputStream(fis);
          Usuario u=new Usuario();
          u= (Usuario)ois.readObject();
          return u;
        
    }
    
}
