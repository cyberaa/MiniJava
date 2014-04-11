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
public class IfElseStatementAST extends Statement{
    public ExpressionAST ex=null;
    public Statement stif=null;
    public Statement stelse=null;

    public IfElseStatementAST(ExpressionAST a,Statement b,Statement c) {
        this.ex=a;
        this.stif=b;
        this.stelse=c;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitIfElseStatementAST(this,arg);
    }
}
