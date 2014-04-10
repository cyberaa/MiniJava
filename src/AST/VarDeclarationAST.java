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
    public TypeAST t;
    public IdentifierAST  id;

    public VarDeclarationAST(TypeAST t, IdentifierAST id) {
        this.t = t;
        this.id = id;
    }

    
    public Object visit(Visitor v, Object arg) {
        return v.visitVarDeclarationAST(this,arg);
    }
    
}
