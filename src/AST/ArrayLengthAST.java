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
public class ArrayLengthAST extends ExpressionAST{
    public PrimaryExpression ex=null;
    public ArrayLengthAST(PrimaryExpression ex1) {
        this.ex=ex1;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitArrayLengthAST(this,arg);
    }
}

