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
public class CharConstantAST extends PrimaryExpression{
    private Object value;

    public CharConstantAST(Object value) {
        this.value = value;
    }

    public CharConstantAST() {
    }

    public String getStringValue() {
        return value.toString();
    }
    
    public Object visit(Visitor v, Object arg) {
        return v.visitCharConstantAST(this,arg);
    }
}
