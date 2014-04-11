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
public class AssigmentRestAST extends Statement{
    public Type t=null;
    public Expression ex=null; 

    public AssigmentRestAST(Type t) {
        this.t=t;
    }
    public AssigmentRestAST(Expression ex) {
        this.ex=ex;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitAssigmentRestAST(this,arg);
    }
}
