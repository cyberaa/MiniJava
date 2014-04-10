/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AST;

/**
 *
 * @author administrador
 */
public class MethodDeclarationAST {

    public TypeAST t=null;
    public IdentifierAST id=null;
    public FormalParameterListAST  fpl=null;
    public VarDeclarationAST  vd=null;
    public StatementAST  st=null;
    public ExpressionAST  ex=null;

    public MethodDeclarationAST(TypeAST t, IdentifierAST id, FormalParameterListAST fpl, VarDeclarationAST vd, StatementAST st, ExpressionAST ex) {
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
