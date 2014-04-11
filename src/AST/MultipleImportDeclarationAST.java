/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AST;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author administrador
 */
public class MultipleImportDeclarationAST extends ImportDeclarationAST{
    
    public TypeNameAST td;
    public MultipleImportDeclarationAST(TypeNameAST tn) {
        this.td = tn;
    }

    public Object visit(Visitor v,Object arg){
        return v.visitMultipleImportDeclarationAST(this, arg);
    }
    
}
