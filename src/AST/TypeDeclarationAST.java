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
public class TypeDeclarationAST {
    
    public Object visit(Visitor v,Object arg){
        return v.visitTypeDeclarationAST(this, arg);
    } 
}
