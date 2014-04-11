/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AST;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
 public class ExpressionListAST extends AST{
    public Expression  ex=null;
    public List<ExpressionRestAST> exr = new ArrayList<ExpressionRestAST>();

    public ExpressionListAST(Expression nex,List<ExpressionRestAST> nexr) {
        this.ex=nex;
        this.exr=nexr;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitExpressionListAST(this,arg);
    }
    
}
