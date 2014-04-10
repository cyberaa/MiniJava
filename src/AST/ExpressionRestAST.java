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
public class ExpressionRestAST extends AST{
    public ExpressionAST ex=null;

    public ExpressionRestAST(ExpressionAST nex) {
        this.ex=nex;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitExpressionRestAST(this,arg);
    }
}
