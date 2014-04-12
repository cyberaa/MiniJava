/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minijava;

import AST.AST;
import java.io.StringReader;
import MiniJavaParser.*;

/**
 *
 * @author Daniel
 */
public class Controlador {    
    Editor GUI;    
    public Controlador(Editor nn)
    {
        GUI=nn;
    }
    public AST ParseProgram(String filepos) throws Exception{
        MiniJavaParser P=  new MiniJavaParser(new java.io.FileInputStream(filepos));
        AST raiz = P.Goal();        
        return raiz;
    }
}
