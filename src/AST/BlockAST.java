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
public class BlockAST extends Statement{
    List<Statement> st = new ArrayList<Statement>();

    public BlockAST(List<Statement> st) {
        this.st=st;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitBlockAST(this,arg);
    }  
}
