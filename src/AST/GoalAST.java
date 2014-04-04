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
public class GoalAST extends AST{
    public ImportDeclarationAST id;
    public MainClassAST mc;
    public TypeDeclarationAST td;

    public GoalAST(ImportDeclarationAST id, MainClassAST mc, TypeDeclarationAST td) {
        this.id = id;
        this.mc = mc;
        this.td = td;
    }
    
    public Object visit(Visitor v,Object arg){
        return v.visitGoalAST(this, arg);
    }     
}
