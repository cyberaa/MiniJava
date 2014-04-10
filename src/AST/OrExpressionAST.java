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
public class OrExpressionAST extends ExpressionAST{
    public PrimaryExpressionAST pex1=null;
    public PrimaryExpressionAST pex2=null;
    public OrExpressionAST(PrimaryExpressionAST ex1,PrimaryExpressionAST ex2) {
        this.pex1=ex1;
        this.pex2=ex2;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitOrExpressionAST(this,arg);
    }
}
