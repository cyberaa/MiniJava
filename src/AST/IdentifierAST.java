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
public class IdentifierAST extends PrimaryExpression{
    private Object t;
    public IdentifierAST(Object t) {
        this.t=t;
    }  
    public String getStringvalue() {
        return t.toString();
    }
    
    public Object visit(Visitor v, Object arg) {
        return v.visitIdentifierAST(this,arg);
    }  
}




