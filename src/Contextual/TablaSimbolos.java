/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Contextual;

import java.util.ArrayList;
import AST.*;
/**
 *
 * @author administrador
 */
public class TablaSimbolos {
    
    private int nivel = -1;
    private ArrayList tabla;

    public TablaSimbolos(ArrayList tabla) {
        this.tabla = tabla;
    }
    
     public boolean enter(String n, AST p_decl){
    
    Tabla simbolo = new Tabla(n,nivel,p_decl);
    
    int cont = tabla.size()-1;
    if (cont != -1){
      while(cont >= 0){
        Tabla temp = (Tabla)tabla.get(cont);
        if(temp.nivel == this.nivel){
          if(temp.nombreID.equals(simbolo.nombreID))
            return false;  
        }
        cont--;
      }
    }
    tabla.add(simbolo);
    
    return true;
  }
     

     public Tabla retrieve(String n){
    
         int cont = tabla.size()-1;
         while( (cont>=0) && ((Tabla)tabla.get(cont)).nivel >= 0){
             Tabla temp = (Tabla)tabla.get(cont);
         if(temp.nombreID.equals(n))
             return ((Tabla)tabla.get(cont));
      cont--;  
    }
    return null;  
  }
  
  public void openScope(){
    nivel++;
  }
  
    public void closeScope(){
    //sacar todos los ids de nivel actual de la tabla
    int cont = tabla.size()-1;
    while((cont >= 0)&&
          (((Tabla)tabla.get(cont)).nivel == this.nivel)){
      tabla.remove(cont);
      cont--;  
    }
    nivel--;
  }
    
    public String toString(){
    int cont = tabla.size()-1;
    StringBuffer out = new StringBuffer();
    
    if (cont != -1){
      while(cont >= 0){
        out.append((tabla.get(cont)).toString());
        out.append("\n");
        cont--;  
      }
    }
    else
      out.append("Tabla VacÌa!!!");
    
    return out.toString();
  }
    
}
