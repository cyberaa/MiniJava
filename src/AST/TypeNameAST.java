/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AST;
import java.util.ArrayList;

/**
 *
 * @author administrador
 */
public class TypeNameAST extends AST{
    public ArrayList<IdentifierAST> id=new ArrayList<IdentifierAST>();

    public TypeNameAST(ArrayList<IdentifierAST>  id) {
        this.id = id;
    }
    
    public Object visit(Visitor v, Object arg) {
        return v.visitTypeNameAST(this,arg);
    }
    
}