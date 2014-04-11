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
 * @author administrador
 */
public class MethodDeclarationAST extends AST{
    
    private Type t=null;
    private IdentifierAST id=null;
    private FormalParameterListAST  fpl=null;
    List<VarDeclarationAST>  vd = new ArrayList<VarDeclarationAST>();
    List<Statement>  st = new ArrayList<Statement>();
    public ExpressionAST  ex=null;

    public MethodDeclarationAST(Type t, IdentifierAST id, FormalParameterListAST fpl, List<VarDeclarationAST> vd, List<Statement> st, ExpressionAST ex) {
        this.t = t;
        this.id = id;
        this.fpl = fpl;
        this.vd = vd;
        this.st = st;
        this.ex = ex;
    }
      
    public Object visit(Visitor v, Object arg) {
        return v.visitMethodDeclarationAST(this,arg);
    }
    
}
