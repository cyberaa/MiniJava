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
public class ArrayAllocationExpressionAST extends PrimaryExpression{
    
    public SimpleType st=null;
    public Expression ex=null;
    public ArrayAllocationExpressionAST(SimpleType nst,Expression nex) {
        this.st=nst;
        this.ex=nex;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitArrayAllocationExpressionAST(this,arg);
    }
}
