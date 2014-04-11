/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AST;

/**
 *
 * @author Darknihus
 */
 public class TypeSimpleTypeAST extends Type{
    public SimpleType st;

    public TypeSimpleTypeAST(SimpleType st) {
        this.st = st;
    }
    
    public Object visit(Visitor v, Object arg) {
		return v.visitTypeSimpleTypeAST(this,arg);
    }
}
