
package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclarationAST extends TypeDeclarationAST {
	public IdentifierAST id;
	public ArrayList<VarDeclarationAST> vd = new ArrayList<VarDeclarationAST>();
	public ArrayList<MethodDeclarationAST> md = new ArrayList<MethodDeclarationAST>();

  
    public ClassDeclarationAST(IdentifierAST id, ArrayList<VarDeclarationAST> vd, ArrayList<MethodDeclarationAST> md) {
        this.id = id;
        this.vd = vd;
        this.md = md;
    }

    public Object visit(Visitor v, Object arg) {
        return v.visitClassDeclarationAST(this,arg);
    }
}
