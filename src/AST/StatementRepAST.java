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
public class StatementRepAST extends AST{
    
    public StatementRepAST sr;
    public Statement st;

    public StatementRepAST(StatementRepAST sr, Statement st) {
        this.sr = sr;
        this.st = st;
    }

    public Object visit(Visitor v, Object arg) {
        return v.visitStatementRepAST(this,arg);
    }
}
