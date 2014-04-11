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
public class MainClassAST extends AST{
    
    public IdentifierAST id1;
    public IdentifierAST id2;
    public PrintStatementAST ps0;

    public MainClassAST(IdentifierAST id1, IdentifierAST id2, PrintStatementAST ps0) {
        this.id1 = id1;
        this.id2 = id2;
        this.ps0 = ps0;
    }
    
    public Object visit(Visitor v, Object arg) {
        return v.visitMainClassAST(this,arg);
    }
}
