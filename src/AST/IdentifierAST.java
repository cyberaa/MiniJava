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
public class IdentifierAST extends AST{
    public IdentifierAST() {
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitIdentifierAST(this,arg);
    }  
}

public class IdentifierAST_PrimaryExpression extends PrimaryExpressionAST{
    public IdentifierAST_PrimaryExpression() {
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitIdentifierAST_PrimaryExpression(this,arg);
    }  
}



