
package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclarationAST extends TypeDeclarationAST {
	public IdentifierAST id;
	public List<VarDeclarationAST> vdlist = new ArrayList<VarDeclarationAST>();
	public List<MethodDeclarationAST> mdlist = new ArrayList<MethodDeclarationAST>();

    public ClassDeclarationAST(IdentifierAST id, List<VarDeclarationAST> vd, List<MethodDeclarationAST> md) {
        this.id = id;
        this.vdlist = vd;
        this.mdlist = md;
    }

    public Object visit(Visitor v, Object arg) {
        return v.visitClassDeclarationAST(this,arg);
    }
}