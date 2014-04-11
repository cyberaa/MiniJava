package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassExtendsDeclarationAST extends TypeDeclarationAST {
	public Object id1;
	public Object id2;
	public ArrayList<VarDeclarationAST> vd = new ArrayList<VarDeclarationAST>();
	public ArrayList<MethodDeclarationAST> md = new ArrayList<MethodDeclarationAST>();

    public ClassExtendsDeclarationAST(Object id1, Object id2, ArrayList<VarDeclarationAST> vd, ArrayList<MethodDeclarationAST> md1) {
        this.id1 = id1;
        this.id2 = id2;
        this.vd = vd;
        this.md = md;
    }

	public Object visit(Visitor v, Object arg) {
		return v.visitClassExtendsDeclaration(this,arg);
	}
}
