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
    
    public Object visitMethodDeclarationAST(MethodDeclarationAST c, Object arg);
   
    
    public Object visitFormalParameterAST(FormalParameterAST c, Object arg);
    public Object visitFormalParameterListAST(FormalParameterListAST c, Object arg);
    public Object visitFormalParameterRestAST(FormalParameterRestAST c, Object arg);
    
    public Object visitSimpleTypeAST(SimpleType c, Object arg);
    public Object visitArrayTypeAST(TypeArrayTypeAST c, Object arg);
    public Object visitTypeDeclarationAST(TypeDeclarationAST c, Object arg);

    public Object visitAllocationExpressionAST(AllocationExpressionAST aThis, Object arg);

    public Object visitAndExpressionAST(AndExpressionAST aThis, Object arg);

    public Object visitArrayAllocationExpressionAST(ArrayAllocationExpressionAST aThis, Object arg);

    public Object visitArrayAssignmentStatementAST(ArrayAssignmentStatementAST aThis, Object arg);

    public Object visitArrayLengthAST(ArrayLengthAST aThis, Object arg);

    public Object visitArrayLookupAST(ArrayLookupAST aThis, Object arg);

    public Object visitAssigmentRestAST(AssigmentRestAST aThis, Object arg);

    public Object visitAssignmentStatementAST(AssignmentStatementAST aThis, Object arg);

    public Object visitBlockAST(BlockAST aThis, Object arg);

    public Object visitBooleanTypeAST(BooleanTypeAST aThis, Object arg);

    public Object visitBracketExpressionAST(BracketExpressionAST aThis, Object arg);

    public Object visitCharConstantAST(CharConstantAST aThis, Object arg);

    public Object visitCharTypeAST(CharTypeAST aThis, Object arg);

    public Object visitEqualExpressionAST(EqualExpressionAST aThis, Object arg);

    public Object visitExpressionListAST(ExpressionListAST aThis, Object arg);

    public Object visitExpressionRestAST(ExpressionRestAST aThis, Object arg);

    public Object visitFalseLiteralAST(FalseLiteralAST aThis, Object arg);

    public Object visitGreatExpressionAST(GreatExpressionAST aThis, Object arg);

    public Object visitIfElseStatementAST(IfElseStatementAST aThis, Object arg);

    public Object visitIfStatementAST(IfStatementAST aThis, Object arg);

    public Object visitIntegerLiteralAST(IntegerLiteralAST aThis, Object arg);

    public Object visitIntegerTypeAST(IntegerTypeAST aThis, Object arg);

    public Object visitLessExpressionAST(LessExpressionAST aThis, Object arg);

    public Object visitMessageSendAST(MessageSendAST aThis, Object arg);

    public Object visitMinusExpressionAST(MinusExpressionAST aThis, Object arg);

    public Object visitNotExpressionAST(NotExpressionAST aThis, Object arg);

    public Object visitIdentifierAST(IdentifierAST aThis, Object arg);

    public Object visitTypeNameAST(TypeNameAST aThis, Object arg);

    public Object visitTypeIdentifierAST(TypeIdentifierAST aThis, Object arg);

    public Object visitVoidTypeAST(VoidTypeAST aThis, Object arg);

    public Object visitObjectTypeAST(ObjectTypeAST aThis, Object arg);

    public Object visitStringTypeAST(StringTypeAST aThis, Object arg);

    public Object visitWhileStatementAST(WhileStatementAST aThis, Object arg);

    public Object visitOrExpressionAST(OrExpressionAST aThis, Object arg);

    public Object visitPlusExpressionAST(PlusExpressionAST aThis, Object arg);

    public Object visitPrintStatementAST(PrintStatementAST aThis, Object arg);

    public Object visitStringConstantAST(StringConstantAST aThis, Object arg);

    public Object visitSubExpressionAST(SubExpressionAST aThis, Object arg);

    public Object visitSwitchStatementAST(SwitchStatementAST aThis, Object arg);

    public Object visitThisExpressionAST(ThisExpressionAST aThis, Object arg);

    public Object visitTimesExpressionAST(TimesExpressionAST aThis, Object arg);

    public Object visitTrueLiteralAST(TrueLiteralAST aThis, Object arg);

    public Object visitATypeSimple(TypeSimpleTypeAST aThis, Object arg);

    public Object visitTypeSimpleTypeAST(TypeSimpleTypeAST aThis, Object arg);
    
    
    
}
