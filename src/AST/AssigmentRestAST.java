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
public class AssigmentRestAST extends StatementAST{
    public TypeAST t=null;
    public ExpressionAST ex=null; 

    public AssigmentRestAST(TypeAST t) {
        this.t=t;
    }
    public AssigmentRestAST(ExpressionAST ex) {
        this.ex=ex;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitAssigmentRestAST(this,arg);
    }
}
