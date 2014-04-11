/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AST;

import java.util.ArrayList;

/**
 *
 * @author administrador
 */
public class GoalAST extends AST{
    public ArrayList<ImportDeclarationAST> id = new ArrayList<ImportDeclarationAST>();
    public MainClassAST mc=null;
    public ArrayList<TypeDeclarationAST> td = new ArrayList<TypeDeclarationAST>();

    public GoalAST(ArrayList<ImportDeclarationAST> id, MainClassAST mc, ArrayList<TypeDeclarationAST> td) {
        this.id = id;
        this.mc = mc;
        this.td = td;
    }
    
    public Object visit(Visitor v,Object arg){
        return v.visitGoalAST(this, arg);
    }     
}
