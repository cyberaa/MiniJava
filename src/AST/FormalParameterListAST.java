/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AST;

/**
 *
 * @author Daniel
 */
public class FormalParameterListAST extends AST{
    public FormalParameterAST fp=null;
    public FormalParameterRestAST fpr=null;

    public FormalParameterListAST(FormalParameterAST a,FormalParameterRestAST b) {
        this.fp=a;
        this.fpr=b;
    }
    
    public Object visit(Visitor v, Object arg) {
        return v.visitFormalParameterListAST(this,arg);
    }
}
