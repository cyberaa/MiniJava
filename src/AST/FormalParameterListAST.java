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
 * @author Daniel
 */
public class FormalParameterListAST extends AST{
    public ArrayList<FormalParameterRestAST> fpr = new ArrayList<FormalParameterRestAST>();
    public FormalParameterAST fp = null;

    public FormalParameterListAST(FormalParameterAST a,ArrayList<FormalParameterRestAST> b) {
        this.fp=a;
        this.fpr=b;
    }
    
    public Object visit(Visitor v, Object arg) {
        return v.visitFormalParameterListAST(this,arg);
    }
}
