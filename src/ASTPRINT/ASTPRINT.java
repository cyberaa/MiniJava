/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ASTPRINT;

import AST.*;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Darknihus
 */
public class ASTPRINT implements Visitor{
    

    @Override
    public Object visitGoalAST(GoalAST c, Object arg) {
        
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) arg;
        if(c.id != null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id.getClass().getName());
            for(int i=0; i < c.id.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(c.id.get(i).getClass().getName());
                h0.add(temp);
                c.id.get(i).visit(this, h0);
                root.add(h0);
            }
        }
        if (c.mc != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.mc.getClass().getName());
            root.add(h0);
            c.mc.visit(this, h0);
        }
        //--------------------------------------------------//
        if (c.td != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.td.getClass().getName());
            for(int i=0; i < c.td.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(c.td.get(i).getClass().getName());
                h0.add(temp);
                c.td.get(i).visit(this, h0);
                root.add(h0);
            }
        }
        
        //--------------------------------------------------//
        return null;        
    }

    @Override
    public Object visitImportDeclaration(ImportDeclarationAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSingleImportDeclaration(SingleImportDeclarationAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMultipleImportDeclarationAST(MultipleImportDeclarationAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMainClassAST(MainClassAST c, Object arg) {

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) arg;
        if (c.id1 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id1.toString());
            root.add(h0);
        }
        //--------------------------------------------------//
        if (c.id2 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id2.toString());
            root.add(h0);
        }
        //--------------------------------------------------//
        if (c.ps0 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.ps0.getClass().getName());
            root.add(h0);
            c.ps0.visit(this, h0);
        }
        
        return null;
    }

    @Override
    public Object visitClassDeclarationAST(ClassDeclarationAST c, Object arg) {
        
         DefaultMutableTreeNode root;
        root = (DefaultMutableTreeNode) arg;
        if (c.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id.t.toString());
            root.add(h0);
        }
        //--------------------------------------------------//
        if (c.vd != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.vd.getClass().getName());
            //root.add(h0);
            //c.vd0.visit(this, h0);
            
            for(int i=0; i < c.vd.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(c.vd.get(i).getClass().getName());
                h0.add(temp);
                c.vd.get(i).visit(this, h0);
                root.add(h0);
            }
        }
        //--------------------------------------------------//
        if (c.md != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.md.getClass().getName());
            
            for(int i=0; i < c.md.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(c.md.get(i).getClass().getName());
                h0.add(temp);
                c.md.get(i).visit(this, h0);
                root.add(h0);     
            }
        }

        return null;
        }
    

    @Override
    public Object visitClassExtendsDeclaration(ClassExtendsDeclarationAST c, Object arg) {

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) arg;
        if (c.md != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.md.getClass().getName());
            for(int i=0; i < c.md.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(c.md.get(i).getClass().getName());
                h0.add(temp);
                c.md.get(i).visit(this, temp);
                root.add(h0);     
            }
        }
        if(c.vd != null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.vd.getClass().getName());
            for(int i=0; i < c.vd.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(c.vd.get(i).getClass().getName());
                h0.add(temp);
                c.vd.get(i).visit(this, temp);
                root.add(h0);  
            }
        }
        return null;
    }

    @Override
    public Object visitVarDeclarationAST(VarDeclarationAST c, Object arg) {
        
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) arg;
        if (c.t != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.t.getClass().getName());
            root.add(h0);
            c.t.visit(this, h0);
        }
        //--------------------------------------------------//
        if (c.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id.t.getClass());
            root.add(h0);
        }
        return null;
    }

    @Override
    public Object visitMethodDeclarationAST(MethodDeclarationAST c, Object arg) {
        
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        
        if (c.t != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.t.getClass().getName());
            raiz.add(h0);
            c.t.visit(this, h0);
        }
        //--------------------------------------------------//
        if (c.fpl != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.fpl.getClass().getName());
            raiz.add(h0);
            c.fpl.visit(this, h0);
        }
        //--------------------------------------------------//
        if(c.vd != null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.vd.getClass().getName());
            for(int i=0; i < c.vd.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(c.vd.get(i).getClass().getName());
                h0.add(temp);
                c.vd.get(i).visit(this, temp);
                raiz.add(h0);  
            }
        }
        //--------------------------------------------------//
        if (c.st != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.st.getClass().getName());
            for(int i=0; i < c.st.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(c.st.get(i).getClass().getName());
                h0.add(temp);
                c.st.get(i).visit(this, temp);
                raiz.add(h0);  
            }
        }
        //--------------------------------------------------//
        if (c.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(h0);
            c.ex.visit(this, h0);
        }
        //--------------------------------------------------//
        if (c.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id.t.toString());
            raiz.add(h0);
        }
        return null;
    }

    @Override
    public Object visitFormalParameterAST(FormalParameterAST c, Object arg) {
               
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if (c.type != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.type.getClass().getName());
            raiz.add(h0);
            c.type.visit(this, h0);
        }
//--------------------------------------------------//
        if (c.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id.t.toString());
            raiz.add(h0);
        }
        return null;
    }
    

    @Override
    public Object visitFormalParameterListAST(FormalParameterListAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFormalParameterRestAST(FormalParameterRestAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public Object visitArrayTypeAST(TypeArrayTypeAST c, Object arg) {
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
        return null;
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
        return null;
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
        return null;
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
        return null;
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
        return null;
    }

    @Override
    public Object visitObjectTypeAST(ObjectTypeAST aThis, Object arg) {
        return null;
    }

    @Override
    public Object visitStringTypeAST(StringTypeAST aThis, Object arg) {
        return null;
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

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) arg;
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
        return null;
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
    public Object visitTypeDeclarationAST(TypeDeclarationAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitATypeSimple(TypeSimpleTypeAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSimpleTypeAST(SimpleType c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTypeSimpleTypeAST(TypeSimpleTypeAST aThis, Object arg) {
              DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if (aThis.st != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.st.getClass().getName());
            raiz.add(h0);
            aThis.st.visit(this, h0);
        }
        return null;
    }
    
}
