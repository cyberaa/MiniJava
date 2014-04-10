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
public class AssignmentStatementAST extends StatementAST{
    public IdentifierAST id=null;
    public AssigmentRestAST ar=null;

    public AssignmentStatementAST(IdentifierAST id,AssigmentRestAST ar) {
        this.id=id;
        this.ar=ar;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitAssignmentStatementAST(this,arg);
    } 
}
