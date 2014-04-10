/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AST;

/**
 *
 * @author Daniel
 */
public class BlockAST extends StatementAST{
    public StatementAST st=null;

    public BlockAST(StatementAST st) {
        this.st=st;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitBlockAST(this,arg);
    }  
}
