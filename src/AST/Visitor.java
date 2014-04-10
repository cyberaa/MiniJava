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
public interface Visitor {
    
    public Object visitGoalAST(GoalAST c, Object arg);
    public Object visitImportDeclaration(ImportDeclarationAST c, Object arg);
    public Object visitSingleImportDeclaration(SingleImportDeclarationAST c, Object arg);
    
    public Object visitMultipleImportDeclarationAST(MultipleImportDeclarationAST c, Object arg);
    public Object visitMainClassAST(MainClassAST c, Object arg);
    public Object visitClassDeclarationAST(ClassDeclarationAST c, Object arg);
    
    public Object visitClassExtendsDeclaration(ClassExtendsDeclarationAST c, Object arg);
    public Object visitVarDeclarationAST(VarDeclarationAST c, Object arg);
    public Object visitFormalParameterRepAST(FormalParameterRepAST c, Object arg);
    public Object visitMethodDeclarationAST(MethodDeclarationAST c, Object arg);
    public Object visitVarDeclarationRepAST(VarDeclarationRepAST c, Object arg);
    public Object visitStatementRepAST(StatementRepAST c, Object arg);
    public Object visitFormalParameterAST(FormalParameterAST c, Object arg);
    public Object visitFormalParameterListAST(FormalParameterListAST c, Object arg);
    public Object visitFormalParameterRestAST(FormalParameterRestAST c, Object arg);
    public Object visitFormalParameterListRestAST(FormalParameterListRestAST c, Object arg);
    public Object visitSimpleTypeAST(SimpleTypeAST c, Object arg);
    public Object visitArrayTypeAST(ArrayTypeAST c, Object arg);
    public Object visitTypeDeclarationAST(TypeDeclarationAST c, Object arg);
    
    
    
}
