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
public class WhileStatementAST extends StatementAST{
    public ExpressionAST ex=null;
    public StatementAST st=null;    

    public WhileStatementAST(ExpressionAST ex,StatementAST st) {
        this.ex=ex;
        this.st=st;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitWhileStatementAST(this,arg);
    }
}
