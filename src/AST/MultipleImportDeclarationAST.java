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
public class MultipleImportDeclarationAST extends AST{
    public TypeNameAST tn;

    public MultipleImportDeclarationAST(TypeNameAST tn) {
        this.tn = tn;
    }
    
            public Object visit(Visitor v,Object arg){
        return v.visitMultipleImportDeclarationAST(this, arg);
    }
    
}