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
public class NotExpressionAST extends AST{
    public ExpressionAST ex=null;
    public NotExpressionAST(ExpressionAST in){
        this.ex=in;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitNotExpressionAST(this,arg);
    }
    
}
