
package AST;

public class ClassDeclarationAST extends AST {
	public Object id;
	public VarDeclarationAST vd;
	public MethodDeclarationAST md;

    public ClassDeclarationAST(Object id, VarDeclarationAST vd, MethodDeclarationAST md) {
        this.id = id;
        this.vd = vd;
        this.md = md;
    }

    public Object visit(Visitor v, Object arg) {
        return v.visitClassDeclarationAST(this,arg);
    }
}