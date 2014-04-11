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
        if(c.id.size() >0 ){
            for(int i=0; i < c.id.size(); i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id.get(i).getClass().getName());
                root.add(h0);
                c.id.get(i).visit(this, h0);
            }
        }
        if (c.mc != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.mc.getClass().getName());
            root.add(h0);
            c.mc.visit(this, h0);
        }
        //--------------------------------------------------//
        if (c.td.size() >0 ) {
            for(int i=0; i < c.td.size(); i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.td.get(i).getClass().getName());
                root.add(h0);
                c.td.get(i).visit(this, h0);                
            }
        }        
        //--------------------------------------------------//
        return null;        
    }

    @Override
    public Object visitImportDeclaration(ImportDeclarationAST c, Object arg) {
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode nn = new DefaultMutableTreeNode(c.getClass().getName());
        root.add(nn);
        c.visit(this, nn);
       return null;
    }

    @Override
    public Object visitSingleImportDeclaration(SingleImportDeclarationAST c, Object arg) {
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) arg;
        if(c.tn!=null){
            DefaultMutableTreeNode nn = new DefaultMutableTreeNode(c.tn.getClass().getName());
            root.add(nn);
            c.tn.visit(this, nn);
        }
       return null;
    }

    @Override
    public Object visitMultipleImportDeclarationAST(MultipleImportDeclarationAST c, Object arg) {
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) arg;
        if(c.td!=null){
            DefaultMutableTreeNode nn = new DefaultMutableTreeNode(c.td.getClass().getName());
            root.add(nn);
            c.td.visit(this, nn);
        }
       return null;
    }

    @Override
    public Object visitMainClassAST(MainClassAST c, Object arg) {
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) arg;
        if (c.id1 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id1.getStringvalue());
            root.add(h0);
        }
        //--------------------------------------------------//
//        if (c.id2 != null) {
//            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id2.getStringvalue());
//            root.add(h0);
//        }
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
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (c.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id.getStringvalue());
            root.add(h0);
        }
        //--------------------------------------------------//
        if (c.vd.size() >0 ) {       
            for(int i=0; i < c.vd.size(); i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.vd.get(i).getClass().getName());
                c.vd.get(i).visit(this, h0);
                root.add(h0);
            }
        }
        //--------------------------------------------------//
        if (c.md.size() >0 ) {       
            for(int i=0; i < c.md.size(); i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.md.get(i).getClass().getName());     
                c.md.get(i).visit(this, h0);
                root.add(h0);     
            }
        }
       return null;
}
    

    @Override
    public Object visitClassExtendsDeclaration(ClassExtendsDeclarationAST c, Object arg) {
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) arg;
        if (c.id1 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id1.getStringvalue());
            root.add(h0);
        }
        if (c.id2 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id2.getStringvalue());
            root.add(h0);
        }
        if(c.vd.size() >0 ){
            for(int i=0; i < c.vd.size(); i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.vd.get(i).getClass().getName());
                root.add(h0);
                c.vd.get(i).visit(this, h0);                  
            }
        }                
        if (c.md.size() >0 ){
            for(int i=0; i < c.md.size(); i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.md.get(i).getClass().getName());
                root.add(h0);     
                c.md.get(i).visit(this, h0);                
            }
        }
       return null;
    }

    @Override
    public Object visitVarDeclarationAST(VarDeclarationAST c, Object arg) {
        
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) arg;
        if (c.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id.getStringvalue());
            root.add(h0);
        }
        if (c.t != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.t.getClass().getName());
            root.add(h0);
            c.t.visit(this, h0);
        }
        return null;
    }

    @Override
    public Object visitMethodDeclarationAST(MethodDeclarationAST c, Object arg) {        
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;    
        if (c.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id.getStringvalue());
            raiz.add(h0);
        }
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
        if(c.vd.size() >0 ){
            for(int i=0; i < c.vd.size(); i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.vd.get(i).getClass().getName());
                raiz.add(h0); 
                c.vd.get(i).visit(this, h0);                 
            }
        }
        //--------------------------------------------------//
        if (c.st.size() >0 ) {
            for(int i=0; i < c.st.size(); i++){
                DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.st.get(i).getClass().getName());
                raiz.add(h0);  
                c.st.get(i).visit(this, h0);
            }
        }
        //--------------------------------------------------//
        if (c.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(h0);
            c.ex.visit(this, h0);
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
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.id.getStringvalue());
            raiz.add(h0);
        }
        return null;
    }
    

    @Override
    public Object visitFormalParameterListAST(FormalParameterListAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if (c.fp != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.fp.getClass().getName());
            raiz.add(h0);
            c.fp.visit(this, h0);
        }
        if(c.fpr.size() > 0){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.fpr.getClass().getName());
            for(int i=0; i < c.fpr.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(c.fpr.get(i).getClass().getName());
                h0.add(temp);
                c.fpr.get(i).visit(this, temp);
                raiz.add(h0);  
            }
        }
        return  raiz;
    }

    @Override
    public Object visitFormalParameterRestAST(FormalParameterRestAST c, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (c.fp != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.fp.getClass().getName());
            root.add(h0);
            c.fp.visit(this, h0);
        }
       return null;
    }


    @Override
    public Object visitArrayTypeAST(TypeArrayTypeAST c, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (c.at != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.at.getClass().getName());
            root.add(h0);
            c.at.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitAllocationExpressionAST(AllocationExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id.getStringvalue());
            root.add(h0);
        }
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitAndExpressionAST(AndExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.pex1 != null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex1.getClass().getName());
            root.add(h0);
            aThis.pex1.visit(this, h0);
        }
        if (aThis.pex2 != null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex2.getClass().getName());
            root.add(h0);
            aThis.pex2.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitArrayAllocationExpressionAST(ArrayAllocationExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.ex != null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
        if (aThis.st != null){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.st.getClass().getName());
            root.add(h0);
            aThis.st.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitArrayAssignmentStatementAST(ArrayAssignmentStatementAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.ar != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ar.getClass().getName());
            root.add(h0);
            aThis.ar.visit(this, h0);
        }
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
        if (aThis.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id.getStringvalue());
            root.add(h0);
            aThis.id.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitArrayLengthAST(ArrayLengthAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitArrayLookupAST(ArrayLookupAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.pex1 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex1.getClass().getName());
            root.add(h0);
            aThis.pex1.visit(this, h0);
        }
        if (aThis.pex2 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex2.getClass().getName());
            root.add(h0);
            aThis.pex2.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitAssigmentRestAST(AssigmentRestAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.t != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.t.getClass().getName());
            root.add(h0);
            aThis.t.visit(this, h0);
        }
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitAssignmentStatementAST(AssignmentStatementAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id.getClass().getName());
            root.add(h0);
            aThis.id.visit(this, h0);
        }
        if (aThis.ar != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ar.getClass().getName());
            root.add(h0);
            aThis.ar.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitBlockAST(BlockAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if(aThis.st.size() > 0){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.st.getClass().getName());
            for(int i=0; i < aThis.st.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(aThis.st.get(i).getClass().getName());
                h0.add(temp);
                aThis.st.get(i).visit(this, temp);
                root.add(h0);  
            }
        }
       return null;
    }

    @Override
    public Object visitBooleanTypeAST(BooleanTypeAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getStringValue());
        root.add(h0);
        return  root;
    }

    @Override
    public Object visitBracketExpressionAST(BracketExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitCharConstantAST(CharConstantAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getStringValue());
        root.add(h0);
        return  root;
    }

    @Override
    public Object visitCharTypeAST(CharTypeAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getClass().getName());
        root.add(h0);
        return  root;
    }

    @Override
    public Object visitEqualExpressionAST(EqualExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.pex1 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex1.getClass().getName());
            root.add(h0);
            aThis.pex1.visit(this, h0);
        }
        if (aThis.pex2 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex2.getClass().getName());
            root.add(h0);
            aThis.pex2.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitExpressionListAST(ExpressionListAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
        if(aThis.exr.size() > 0){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.exr.getClass().getName());
            for(int i=0; i < aThis.exr.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(aThis.exr.get(i).getClass().getName());
                h0.add(temp);
                aThis.exr.get(i).visit(this, temp);
                root.add(h0);  
            }
        }
       return null;
    }

    @Override
    public Object visitExpressionRestAST(ExpressionRestAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitFalseLiteralAST(FalseLiteralAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getStringValue());
        root.add(h0);
        return  root;
    }

    @Override
    public Object visitGreatExpressionAST(GreatExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.pex1 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex1.getClass().getName());
            root.add(h0);
            aThis.pex1.visit(this, h0);
        }
        if (aThis.pex2 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex2.getClass().getName());
            root.add(h0);
            aThis.pex2.visit(this, h0);
        }
       return null;
    }
  

    @Override
    public Object visitIfElseStatementAST(IfElseStatementAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
        if (aThis.stif != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.stif.getClass().getName());
            root.add(h0);
            aThis.stif.visit(this, h0);
        }
        if (aThis.stelse != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.stelse.getClass().getName());
            root.add(h0);
            aThis.stelse.visit(this, h0);
        }
       return null;
    }
    
    @Override
    public Object visitIfStatementAST(IfStatementAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
        if (aThis.st != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.st.getClass().getName());
            root.add(h0);
            aThis.st.visit(this, h0);
        }
       return null;
    }
    

    @Override
    public Object visitIntegerLiteralAST(IntegerLiteralAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getStringValue());
        root.add(h0);
        return  null;
    }

    @Override
    public Object visitIntegerTypeAST(IntegerTypeAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getClass().getName());
        root.add(h0);
        return  null;
    }

    @Override
    public Object visitLessExpressionAST(LessExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.pex1 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex1.getClass().getName());
            root.add(h0);
            aThis.pex1.visit(this, h0);
        }
        if (aThis.pex2 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex2.getClass().getName());
            root.add(h0);
            aThis.pex2.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitMessageSendAST(MessageSendAST aThis, Object arg){
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
        if (aThis.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id.getStringvalue());
            root.add(h0);
        }
        if (aThis.exl != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.exl.getClass().getName());
            root.add(h0);
            aThis.exl.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitMinusExpressionAST(MinusExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.pex1 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex1.getClass().getName());
            root.add(h0);
            aThis.pex1.visit(this, h0);
        }
        if (aThis.pex2 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex2.getClass().getName());
            root.add(h0);
            aThis.pex2.visit(this, h0);
        }
       return null;
    }
    
    @Override
    public Object visitNotExpressionAST(NotExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitIdentifierAST(IdentifierAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getStringvalue());
        root.add(h0);
        return null;
    }

    @Override
    public Object visitTypeNameAST(TypeNameAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if(aThis.id.size() > 0){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id.getClass().getName());
            for(int i=0; i < aThis.id.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(aThis.id.get(i).getStringvalue());
                h0.add(temp);
                aThis.id.get(i).visit(this, temp);
                root.add(h0);  
            }
        }
       return null;
    }

    @Override
    public Object visitTypeIdentifierAST(TypeIdentifierAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getStringValue());
        root.add(h0);
        return  root;
    }

    @Override
    public Object visitVoidTypeAST(VoidTypeAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getClass().getName());
        root.add(h0);
        return  root;
    }

    @Override
    public Object visitObjectTypeAST(ObjectTypeAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getClass().getName());
        root.add(h0);
        return  root;
    }

    @Override
    public Object visitStringTypeAST(StringTypeAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getClass().getName());
        root.add(h0);
        return  root;
    }

    @Override
    public Object visitWhileStatementAST(WhileStatementAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.ex != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.ex.getClass().getName());
            root.add(h0);
            aThis.ex.visit(this, h0);
        }
        if (aThis.st != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.st.getClass().getName());
            root.add(h0);
            aThis.st.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitOrExpressionAST(OrExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.pex1 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex1.getClass().getName());
            root.add(h0);
            aThis.pex1.visit(this, h0);
        }
        if (aThis.pex2 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex2.getClass().getName());
            root.add(h0);
            aThis.pex2.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitPlusExpressionAST(PlusExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.pex1 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex1.getClass().getName());
            root.add(h0);
            aThis.pex1.visit(this, h0);
        }
        if (aThis.pex2 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex2.getClass().getName());
            root.add(h0);
            aThis.pex2.visit(this, h0);
        }
       return null;
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
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getClass().getName());
        root.add(h0);
        return  null;
    }

    @Override
    public Object visitSubExpressionAST(SubExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.pex1 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex1.getClass().getName());
            root.add(h0);
            aThis.pex1.visit(this, h0);
        }
        if (aThis.pex2 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex2.getClass().getName());
            root.add(h0);
            aThis.pex2.visit(this, h0);
        }
       return null;
    }

    @Override
    public Object visitSwitchStatementAST(SwitchStatementAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id.getStringvalue());
            root.add(h0);
            aThis.id.visit(this, h0);
        }
        if (aThis.id2 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id2.getClass().getName());
            root.add(h0);
            aThis.id2.visit(this, h0);
        }
        if(aThis.st.size() > 0){
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.st.getClass().getName());
            for(int i=0; i < aThis.st.size(); i++){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(aThis.st.get(i).getClass().getName());
                h0.add(temp);
                aThis.st.get(i).visit(this, temp);
                root.add(h0);  
            }
        }
       return null;
    }
    
    @Override
    public Object visitThisExpressionAST(ThisExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getStringValue());
        root.add(h0);
        return  root;
    }

    @Override
    public Object visitTimesExpressionAST(TimesExpressionAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.pex1 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex1.getClass().getName());
            root.add(h0);
            aThis.pex1.visit(this, h0);
        }
        if (aThis.pex2 != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.pex2.getClass().getName());
            root.add(h0);
            aThis.pex2.visit(this, h0);
        }
       return null;
    }


    @Override
    public Object visitTrueLiteralAST(TrueLiteralAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.getClass().getName());
        root.add(h0);
        return  null;
    }

    @Override
    public Object visitTypeDeclarationAST(TypeDeclarationAST c, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.getClass().getName());
        root.add(h0);
        c.visit(this, h0);
        return  root;
    }

    @Override
    public Object visitATypeSimple(TypeSimpleTypeAST aThis, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        if (aThis.st != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.st.getClass().getName());
            root.add(h0);
            aThis.st.visit(this, h0);
        }
       return null;
    }


    @Override
    public Object visitSimpleTypeAST(SimpleType c, Object arg) {
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) arg;
        DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(c.getClass().getName());
        root.add(h0);
        c.visit(this, h0);
        return  root;
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
