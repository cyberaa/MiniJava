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
public class IntegerLiteralAST extends PrimaryExpression{
    private Object value;

    public IntegerLiteralAST(Object value) {
        this.value = value;
    }
    
    public Object visit(Visitor v, Object arg) {
        return v.visitIntegerLiteralAST(this,arg);
    }
}
