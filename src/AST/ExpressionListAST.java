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
public class ExpressionListAST extends AST{
    public ExpressionAST  ex=null;
    public ExpressionRestAST exr=null;

    public ExpressionListAST(ExpressionAST nex,ExpressionRestAST nexr) {
        this.ex=nex;
        this.exr=nexr;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitExpressionListAST(this,arg);
    }
    
}
