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
public class VarDeclarationRepAST extends AST{
    
    public VarDeclarationRepAST vdr;
    public VarDeclarationAST vd;


    public Object visit(Visitor v, Object arg) {
        return v.visitVarDeclarationRepAST(this,arg);
    }
}
