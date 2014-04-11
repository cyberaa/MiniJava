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
public class ArrayTypeAST extends Type{    
    public SimpleType st;

    public ArrayTypeAST(SimpleType st0) {
        this.st = st0;
    }

    public Object visit(Visitor v, Object arg) {    
        return v.visitArrayTypeAST(this,arg);
    }
    
}
