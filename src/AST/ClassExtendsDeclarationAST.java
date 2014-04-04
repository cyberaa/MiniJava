package AST;

public class ClassExtendsDeclarationAST extends AST {
	public Object id1;
	public Object id2;
	public VarDeclarationAST vd;
	public MethodDeclarationAST md;

    public ClassExtendsDeclarationAST(Object id1, Object id2, VarDeclarationAST vd, MethodDeclarationAST md1) {
        this.id1 = id1;
        this.id2 = id2;
        this.vd = vd;
        this.md = md1;
    }

	public Object visit(Visitor v, Object arg) {
		return v.visitClassExtendsDeclaration(this,arg);
	}
}