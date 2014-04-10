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
public class FormalParameterRestAST extends AST{    
    public FormalParameterAST fp;
    public FormalParameterRestAST(FormalParameterAST fpl) {
        this.fp = fpl;
    }

    public Object visit(Visitor v, Object arg) {
        return v.visitFormalParameterRestAST(this,arg);
    }
}
