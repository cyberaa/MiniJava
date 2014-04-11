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
    
    public Type t=null;
    public IdentifierAST id=null;
    public FormalParameterListAST  fpl=null;
    public List<VarDeclarationAST>  vd = new ArrayList<VarDeclarationAST>();
    public List<Statement>  st = new ArrayList<Statement>();
    public Expression  ex=null;

    public MethodDeclarationAST(Type t, IdentifierAST id, FormalParameterListAST fpl, List<VarDeclarationAST> vd, List<Statement> st, Expression ex) {
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
