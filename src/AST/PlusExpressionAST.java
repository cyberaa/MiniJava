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
public class PlusExpressionAST extends Expression{
    public PrimaryExpression pex1=null;
    public PrimaryExpression pex2=null;
    public PlusExpressionAST(PrimaryExpression ex1,PrimaryExpression ex2) {
        this.pex1=ex1;
        this.pex2=ex2;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitPlusExpressionAST(this,arg);
    }
}
