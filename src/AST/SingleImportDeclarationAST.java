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
public class SingleImportDeclarationAST extends ImportDeclarationAST{
    public TypeNameAST tn;

    public SingleImportDeclarationAST(TypeNameAST tn) {
        this.tn = tn;
    }
    
    public Object visit(Visitor v,Object arg){
        return v.visitSingleImportDeclaration(this, arg);
    }
}
