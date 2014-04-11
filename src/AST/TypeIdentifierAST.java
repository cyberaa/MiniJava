/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AST;

/**
 *
 * @author administrador
 */
public class TypeIdentifierAST extends Type{
    
    private Object id;

    public TypeIdentifierAST(Object id) {
        this.id = id;
    }
    
public Object visit(Visitor v, Object arg) {
    return v.visitTypeIdentifierAST(this,arg);
}
    
}
