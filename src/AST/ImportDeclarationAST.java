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
public class ImportDeclarationAST extends AST{
    public TypeNameAST tn;
    public SingleImportDeclaration sid;
    public MultipleImportDeclarationAST mid;

    public ImportDeclarationAST(TypeNameAST tn, SingleImportDeclaration sid, MultipleImportDeclarationAST mid) {
        this.tn = tn;
        this.sid = sid;
        this.mid = mid;
    }
    
    public Object visit(Visitor v,Object arg){
        return v.visitImportDeclaration(this, arg);
    }
}
