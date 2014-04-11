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
public class TypeDeclarationAST extends AST {
    
    private ClassDeclarationAST cd;
    private ClassExtendsDeclarationAST ced;

    public TypeDeclarationAST(ClassDeclarationAST cd, ClassExtendsDeclarationAST ced) {
        this.cd = cd;
        this.ced = ced;
    }
    
    public Object visit(Visitor v,Object arg){
        return v.visitTypeDeclarationAST(this, arg);
    } 
}
