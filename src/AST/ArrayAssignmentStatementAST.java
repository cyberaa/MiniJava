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
public class ArrayAssignmentStatementAST extends StatementAST{
    public IdentifierAST id=null;
    public ExpressionAST ex=null;
    public AssigmentRestAST ar=null;

    public ArrayAssignmentStatementAST(IdentifierAST id,ExpressionAST ex,AssigmentRestAST ar) {
        this.id=id;
        this.ex=ex;
        this.ar=ar;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitArrayAssignmentStatementAST(this,arg);
    }
    
}
