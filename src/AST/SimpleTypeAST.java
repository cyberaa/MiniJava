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
public class SimpleTypeAST extends Type{
    
    public SimpleType st;

    public SimpleTypeAST(SimpleType st) {
        this.st = st;
    }

    public Object visit(Visitor v, Object arg) {
        return v.visitSimpleTypeAST(this,arg);
    }
    
}
