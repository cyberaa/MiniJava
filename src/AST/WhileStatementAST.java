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
public class WhileStatementAST extends Statement{
    public Expression ex=null;
    public Statement st=null;    

    public WhileStatementAST(Expression ex,Statement st) {
        this.ex=ex;
        this.st=st;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitWhileStatementAST(this,arg);
    }
}
