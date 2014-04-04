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
public class VarDeclarationAST extends AST{
    public Type ty;
    public Object id;

    public VarDeclarationAST(Type ty, Object id) {
        this.ty = ty;
        this.id = id;
    }
    
    public Object visit(Visitor v, Object arg) {
        return v.visitVarDeclarationAST(this,arg);
    }
    
}
