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
    public SingleImportDeclarationAST sid;
    public MultipleImportDeclarationAST mid;

    public ImportDeclarationAST(SingleImportDeclarationAST sid, MultipleImportDeclarationAST mid) {
        this.sid = sid;
        this.mid = mid;
    }
    
    public Object visit(Visitor v,Object arg){
        return v.visitImportDeclaration(this, arg);
    }
}
