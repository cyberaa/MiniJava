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
public class SwitchStatementAST extends Statement{
    public IdentifierAST id=null;
    public IntegerTypeAST intt=null;
    List<Statement> st = new ArrayList<Statement>();

    public SwitchStatementAST(IdentifierAST id,IntegerTypeAST intt,List<Statement> st) {
        this.id=id;
        this.intt=intt;
        this.st=st;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitSwitchStatementAST(this,arg);
    }
}
