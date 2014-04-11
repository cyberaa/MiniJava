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
public class MessageSendAST extends Expression{
    public PrimaryExpression ex=null;
    public IdentifierAST id=null;
    public ExpressionListAST exl=null;
    public MessageSendAST(PrimaryExpression ex1,IdentifierAST nid,ExpressionListAST exlist) {
        this.ex=ex1;
        this.id=nid;
        this.exl=exlist;
    }
    public Object visit(Visitor v, Object arg) {
        return v.visitMessageSendAST(this,arg);
    }
}
