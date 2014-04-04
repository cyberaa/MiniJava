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

    public Type type;
    public Object id;
    public FormalParameterRepAST fpr;
    public VarDeclarationRepAST vdr;
    public StatementRepAST str;
    public Expression e;

    public MethodDeclarationAST(Type type, Object id, FormalParameterRepAST fpr, VarDeclarationRepAST vdr, StatementRepAST str, Expression e) {
        this.type = type;
        this.id = id;
        this.fpr = fpr;
        this.vdr = vdr;
        this.str = str;
        this.e = e;
    }
    
    public Object visit(Visitor v, Object arg) {
        return v.visitMethodDeclarationAST(this,arg);
    }
    
}
