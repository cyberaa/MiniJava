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
public class IntegerTypeAST extends SimpleTypeAST{

    public IntegerTypeAST() {
    }
    public Object visit(Visitor v, Object arg) {    
        return v.visitIntegerTypeAST(this,arg);
    }
}