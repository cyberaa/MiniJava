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
public class FormalParameterRepAST extends AST{

    public FormalParameterList fpl;

    public FormalParameterRepAST(FormalParameterList fpl) {
        this.fpl = fpl;
    }

    public Object visit(Visitor v, Object arg) {
        return v.visitFormalParameterRepAST(this,arg);
    }
    
}