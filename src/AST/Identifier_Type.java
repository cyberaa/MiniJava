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
public class Identifier_Type extends Type{
    private Object t;
    public Identifier_Type(Object t) {
        this.t=t;
    }  
    public Identifier_Type() {
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitIdentifier_Type(this,arg);
    }  
}
