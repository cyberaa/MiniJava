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
public class ThisExpressionAST extends PrimaryExpression{
    private Object t="this";

    public ThisExpressionAST() {
    }

    public String getStringValue() {
        return t.toString();
    }
    
    public Object visit(Visitor v, Object arg) {
        return v.visitThisExpressionAST(this,arg);
    }
}
