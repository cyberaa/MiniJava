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
public class IntegerTypeAST extends SimpleType{
    private Object Value=null;
    
    public IntegerTypeAST() {
    }

    public IntegerTypeAST(Object v) {
        this.Value=v;
    }

    public String getStringValue() {
        return Value.toString();
    }
    
    public Object visit(Visitor v, Object arg) {    
        return v.visitIntegerTypeAST(this,arg);
    }
}