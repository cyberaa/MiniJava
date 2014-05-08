/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Contextual;
import AST.*;
/**
 *
 * @author administrador
 */
public class TablaRow {

  public String nombreID;
  public int nivel;
  public AST reference;
  
  public TablaRow(){
      
  }
  
  public TablaRow(String n, int ni, AST reference){
    nombreID = n;
    nivel = ni;
    this.reference = reference;
  }

  public String toString(){
    return new String( nombreID + " - " + nivel + " - " + reference);
  }
}
    

