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
public class ArrayAssignmentStatementAST extends Statement{
    public IdentifierAST id=null;
    public Expression ex=null;
    public AssigmentRestAST ar=null;

    public ArrayAssignmentStatementAST(IdentifierAST id,Expression ex,AssigmentRestAST ar) {
        this.id=id;
        this.ex=ex;
        this.ar=ar;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitArrayAssignmentStatementAST(this,arg);
    }
    
}
