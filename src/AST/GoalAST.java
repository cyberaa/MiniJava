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
public class GoalAST extends AST{
    List<ImportDeclarationAST> id = new ArrayList<ImportDeclarationAST>();
    public MainClassAST mc;
    List<TypeDeclarationAST> td = new ArrayList<TypeDeclarationAST>();

    public GoalAST(List<ImportDeclarationAST> id, MainClassAST mc, List<TypeDeclarationAST> td) {
        this.id = id;
        this.mc = mc;
        this.td = td;
    }

    public Object visit(Visitor v,Object arg){
        return v.visitGoalAST(this, arg);
    }     
}
