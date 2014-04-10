/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AST;

/**
 *
 * @author administrador
 */
public class PrintStatementAST extends AST{
    public ExpressionAST ex;
    public PrintStatementAST(ExpressionAST ex) {
        this.ex = ex;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitPrintStatementAST(this,arg);
    }
}
