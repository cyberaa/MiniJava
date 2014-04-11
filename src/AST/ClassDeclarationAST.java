
package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclarationAST extends TypeDeclarationAST {
	public IdentifierAST id;
	public List<VarDeclarationAST> vd = new ArrayList<VarDeclarationAST>();
	public List<MethodDeclarationAST> md = new ArrayList<MethodDeclarationAST>();

  
    public ClassDeclarationAST(IdentifierAST id, List<VarDeclarationAST> vd, List<MethodDeclarationAST> md) {
        this.id = id;
        this.vd = vd;
        this.md = md;
    }

    public Object visit(Visitor v, Object arg) {
        return v.visitClassDeclarationAST(this,arg);
    }
}
