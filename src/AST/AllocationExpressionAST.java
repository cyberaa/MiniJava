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
public class AllocationExpressionAST extends PrimaryExpressionAST{
    public IdentifierAST id=null;
    public BracketExpressionAST ex=null;
    public AllocationExpressionAST(IdentifierAST nid,BracketExpressionAST bex) {
        this.id=nid;
        this.ex=bex;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitAllocationExpressionAST(this,arg);
    }
}
