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
public abstract class TypeDeclarationAST extends AST{
    public abstract Object visit(Visitor v,Object arg);
}
