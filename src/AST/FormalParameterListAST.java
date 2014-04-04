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
public class FormalParameterListAST extends FormalParameterList{
    
    public FormalParameterListAST fpl;

    public FormalParameterListAST(FormalParameterListAST fpl) {
        this.fpl = fpl;
    }

    public Object visit(Visitor v, Object arg) {
        return v.visitFormalParameterListAST(this,arg);
    }
}
