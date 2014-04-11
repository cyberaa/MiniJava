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
public class BracketExpressionAST extends PrimaryExpression{
    
    public Expression ex=null;    
    public BracketExpressionAST(){ 
    }    
    public BracketExpressionAST(Expression expre){
        this.ex=expre;        
    }    
    public Object visit(Visitor v, Object arg) {
        return v.visitBracketExpressionAST(this,arg);
    }
}
