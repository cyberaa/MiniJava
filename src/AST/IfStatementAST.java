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
public class IfStatementAST extends StatementAST{
    public ExpressionAST ex=null;
    public StatementAST st=null;

    public IfStatementAST(ExpressionAST a,StatementAST b) {
        this.ex=a;
        this.st=b;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitIfStatementAST(this,arg);
    }
}
