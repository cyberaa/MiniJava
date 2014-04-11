package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassExtendsDeclarationAST extends TypeDeclarationAST {
	public IdentifierAST id1;
	public IdentifierAST id2;
	public ArrayList<VarDeclarationAST> vd = new ArrayList<VarDeclarationAST>();
	public ArrayList<MethodDeclarationAST> md = new ArrayList<MethodDeclarationAST>();

    public ClassExtendsDeclarationAST(IdentifierAST a, IdentifierAST b, ArrayList<VarDeclarationAST> c, ArrayList<MethodDeclarationAST> d) {
        this.id1 = a;
        this.id2 = b;
        this.vd = c;
        this.md = d;
    }

	public Object visit(Visitor v, Object arg) {
		return v.visitClassExtendsDeclaration(this,arg);
	}
}
