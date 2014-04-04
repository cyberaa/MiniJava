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
public class FormalParameterListRestAST extends FormalParameterList{
    
    public FormalParameterList fpl;
    public FormalParameterRestAST fpr;

    public FormalParameterListRestAST(FormalParameterList fpl, FormalParameterRestAST fpr) {
        this.fpl = fpl;
        this.fpr = fpr;
    }

    public Object visit(Visitor v, Object arg) {
        return v.visitFormalParameterListRestAST(this,arg);
    }
    
}
