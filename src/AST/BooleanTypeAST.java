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
public class BooleanTypeAST extends SimpleType{
    private Object t;
    
    public BooleanTypeAST(Object o){ 
        t=o;
    }    
    public BooleanTypeAST(){ 
        t=false;
    }

    public String getStringValue() {
        return t.toString();
    }    
    
    public Object visit(Visitor v, Object arg) {    
        return v.visitBooleanTypeAST(this,arg);
    }
}