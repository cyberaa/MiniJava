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
public class TypeArrayTypeAST extends Type{    
    public SimpleType at;

    public TypeArrayTypeAST(SimpleType st0) {
        this.at = st0;
    }

    public Object visit(Visitor v, Object arg) {    
        return v.visitArrayTypeAST(this,arg);
    }
    
}
