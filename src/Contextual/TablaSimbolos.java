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
    private ArrayList<TablaRow> ASTtable;

    public TablaSimbolos() {
        ASTtable = new ArrayList<TablaRow>();
    }

    public TablaRow enter(String name, AST p_decl) {
        TablaRow nn = new TablaRow(name, nivel, p_decl);
        ASTtable.add(nn);
        return nn;
    }
    
    public boolean getIdentifier(String arg){
        boolean result=false;
        for(int i=0;i<ASTtable.size();i++)
            if((ASTtable.get(i).nombreID==arg)&&(ASTtable.get(i).nivel<=nivel))
                result= true;
        return result;
    }
    
    public TablaRow retrieve(String n) {
        int cont = ASTtable.size() - 1;
        while ((cont >= 0) && ((TablaRow) ASTtable.get(cont)).nivel >= 0) {
            TablaRow temp = (TablaRow) ASTtable.get(cont);
            if (temp.nombreID.equals(n)) {
                return ((TablaRow) ASTtable.get(cont));
            }
            cont--;
        }
        return null;
    }

    public void openScope() {
        nivel++;
    }

    public void closeScope() {
        //sacar todos los ids de nivel actual de la tabla
        int cont = ASTtable.size() - 1;
        while ((cont >= 0)
                && (((TablaRow) ASTtable.get(cont)).nivel == this.nivel)) {
            ASTtable.remove(cont);
            cont--;
        }
        nivel--;
    }

    public String toString() {
        int cont = ASTtable.size() - 1;
        StringBuffer out = new StringBuffer();
        if (cont != -1) {
            while (cont >= 0) {
                out.append((ASTtable.get(cont)).toString());
                out.append("\n");
                cont--;
            }
        } else {
            out.append("Tabla VacÌa!!!");
        }
        return out.toString();
    }
}
