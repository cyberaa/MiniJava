/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ASTPRINT;
import AST.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ASTPRINT implements Visitor{
    
    public Object visitGoalAST(GoalAST aThis, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if(aThis.id.size() > 0){
            for(int i=0;i<aThis.id.size();i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id.get(i).getClass().getName());
                raiz.add(h0);
                aThis.id.get(i).visit(this, h0);
            }
        }
        ///////
        if (aThis.mc != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.mc.getClass().getName());
            raiz.add(h0);
            aThis.mc.visit(this, h0);
        }
        ///////
        if (aThis.td.size()>0) {
            for(int i=0;i<aThis.td.size();i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.td.get(i).getClass().getName());
                raiz.add(h0);
                aThis.td.get(i).visit(this, h0);
            }
        }
        ///////
        return raiz;
    }

    public Object visitSingleImportDeclaration(SingleImportDeclarationAST aThis, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if(aThis.tn!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.tn.getClass().getName());
            raiz.add(h0);
            aThis.tn.visit(this, h0);
        }
        return null;
    }

    public Object visitMultipleImportDeclarationAST(MultipleImportDeclarationAST aThis, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if(aThis.td!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.td.getClass().getName());
            raiz.add(h0);
            aThis.td.visit(this, h0);
        }
        return null;
    }

    public Object visitMainClassAST(MainClassAST aThis, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if(aThis.id1!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id1.getClass().getName());
            raiz.add(h0);
        }   
        if(aThis.id2!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id2.getClass().getName());
            raiz.add(h0);
        } 
        if(aThis.ps0!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ps0.getClass().getName());
            raiz.add(h0);
            aThis.ps0.visit(this, h0);
        }
        return null;
    }

    public Object visitClassDeclarationAST(ClassDeclarationAST aThis, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if(aThis.id!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id.getClass().getName());
            raiz.add(h0);
            aThis.id.visit(this, h0);
        } 
        if(aThis.md!=null){
            for(int i=0;i<aThis.md.size();i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.md.get(i).getClass().getName());
                raiz.add(h0);
                aThis.md.get(i).visit(this, h0);
            }
        } 
        if(aThis.vd!=null){
            for(int i=0;i<aThis.vd.size();i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.vd.get(i).getClass().getName());
                raiz.add(h0);
                aThis.vd.get(i).visit(this, h0);
            }
        } 
        return null;
    }

    public Object visitClassExtendsDeclaration(ClassExtendsDeclarationAST aThis, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if(aThis.id1!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id1.getClass().getName());
            raiz.add(h0);
        } 
        if(aThis.id2!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id1.getClass().getName());
            raiz.add(h0);
        }
        return null;
    }

    public Object visitVarDeclarationAST(VarDeclarationAST aThis, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if(aThis.id!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id.getClass().getName());
            raiz.add(h0);
            aThis.id.visit(this, h0);
        }
        if(aThis.t!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.t.getClass().getName());
            raiz.add(h0);
            aThis.t.visit(this, h0);
        }
        return null;
    }
    
    public Object visitMethodDeclarationAST(MethodDeclarationAST aThis, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if(aThis.ex!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            raiz.add(h0);
            aThis.ex.visit(this, h0);
        }
        return null;
    }

    public Object visitFormalParameterAST(FormalParameterAST aThis, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if(aThis.id!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id.getClass().getName());
            raiz.add(h0);
            aThis.id.visit(this, h0);
        }
        if(aThis.type!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.type.getClass().getName());
            raiz.add(h0);
            aThis.type.visit(this, h0);
        }
        return null;
    }

    public Object visitFormalParameterListAST(FormalParameterListAST aThis, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if(aThis.fp!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.fp.getClass().getName());
            raiz.add(h0);
            aThis.fp.visit(this, h0);
        } 
        if(aThis.fpr!=null){
            for(int i=0;i<aThis.fpr.size();i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.fpr.get(i).getClass().getName());
                raiz.add(h0);
                aThis.fpr.get(i).visit(this, h0);
            }
        }
        return null;
    }

    public Object visitFormalParameterRestAST(FormalParameterRestAST aThis, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if(aThis.fp!=null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.fp.getClass().getName());
            raiz.add(h0);
            aThis.fp.visit(this, h0);
        }
        return null;
    }

    @Override
    public Object visitSimpleTypeAST(SimpleType c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitArrayTypeAST(ArrayTypeAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTypeDeclarationAST(TypeDeclarationAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAllocationExpressionAST(AllocationExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAndExpressionAST(AndExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitArrayAllocationExpressionAST(ArrayAllocationExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitArrayAssignmentStatementAST(ArrayAssignmentStatementAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitArrayLengthAST(ArrayLengthAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitArrayLookupAST(ArrayLookupAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAssigmentRestAST(AssigmentRestAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAssignmentStatementAST(AssignmentStatementAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBlockAST(BlockAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBooleanTypeAST(BooleanTypeAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBracketExpressionAST(BracketExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCharConstantAST(CharConstantAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCharTypeAST(CharTypeAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEqualExpressionAST(EqualExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExpressionListAST(ExpressionListAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExpressionRestAST(ExpressionRestAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFalseLiteralAST(FalseLiteralAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitGreatExpressionAST(GreatExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIfElseStatementAST(IfElseStatementAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIfStatementAST(IfStatementAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIntegerLiteralAST(IntegerLiteralAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIntegerTypeAST(IntegerTypeAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLessExpressionAST(LessExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMessageSendAST(MessageSendAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMinusExpressionAST(MinusExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNotExpressionAST(NotExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIdentifierAST(IdentifierAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIdentifier_Type(Identifier_Type aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTypeNameAST(TypeNameAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTypeIdentifierAST(TypeIdentifierAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitVoidTypeAST(VoidTypeAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitObjectTypeAST(ObjectTypeAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitStringTypeAST(StringTypeAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitWhileStatementAST(WhileStatementAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOrExpressionAST(OrExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitPlusExpressionAST(PlusExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitPrintStatementAST(PrintStatementAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitStringConstantAST(StringConstantAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSubExpressionAST(SubExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSwitchStatementAST(SwitchStatementAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitThisExpressionAST(ThisExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTimesExpressionAST(TimesExpressionAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTrueLiteralAST(TrueLiteralAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitImportDeclaration(ImportDeclarationAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
