/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.*;

public class GenerarSuperficies {
    
    public static ArrayList<Superficies> obtenerFiguras()throws Exception{
     
        ArrayList<Superficies> figuritas=new ArrayList<Superficies>();
        //primero creamos cuadrados
        
        Cuadrado cu1=new Cuadrado(12);
        Cuadrado cu2=new Cuadrado(14);
        Cuadrado cu3=new Cuadrado(13);
        
        //crear 1 rectangulos
        
        Rectangulo re=new Rectangulo(12,14);

        //craer 2 trinagulos
         
        Triangulo tr1=new Triangulo(14,5);
        Triangulo tr2=new Triangulo(6,3);
        
        //crear 2 circulos
        Circulo cir1=new Circulo(45);
        Circulo cir2=new Circulo(12);
    
       //agregarlo al arraylist
        
        figuritas.add(cu1);
        figuritas.add(cu2);
        figuritas.add(cu3);
        figuritas.add(re);
        figuritas.add(tr1);
        figuritas.add(tr2);
        figuritas.add(cir1);
        figuritas.add(cir2);
        
        return figuritas;
    }
}
