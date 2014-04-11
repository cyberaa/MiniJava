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
public class IfStatementAST extends Statement{
    public Expression ex=null;
    public Statement st=null;

    public IfStatementAST(Expression a,Statement b) {
        this.ex=a;
        this.st=b;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitIfStatementAST(this,arg);
    }
}
