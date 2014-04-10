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
public class FormalParameterAST extends AST{
    
    public TypeAST type;	
    public IdentifierAST id;

    public FormalParameterAST(TypeAST type, IdentifierAST id) {
        this.type = type;
        this.id = id;
    }

    public Object visit(Visitor v, Object arg) {
        return v.visitFormalParameterAST(this,arg);
    }
    
}
