/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ASTPRINT;
import AST.ArrayTypeAST;
import AST.ClassDeclarationAST;
import AST.ClassExtendsDeclarationAST;
import AST.FormalParameterAST;
import AST.FormalParameterListAST;
import AST.FormalParameterListRestAST;
import AST.FormalParameterRepAST;
import AST.FormalParameterRestAST;
import AST.GoalAST;
import AST.ImportDeclarationAST;
import AST.MainClassAST;
import AST.MethodDeclarationAST;
import AST.MultipleImportDeclarationAST;
import AST.SimpleTypeAST;
import AST.SingleImportDeclaration;
import AST.StatementRepAST;
import AST.TypeDeclarationAST;
import AST.VarDeclarationAST;
import AST.VarDeclarationRepAST;
import AST.Visitor;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Daniel
 */
public class ASTPRINT implements Visitor{
    
    public Object visitAGoal(GoalAST aThis, Object arg) {

        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arg;
        if (aThis.id != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.id.getClass().getName());
            raiz.add(h0);
            aThis.id.visit(this, h0);
        }
        ///////
        if (aThis.mc != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.mc.getClass().getName());
            raiz.add(h0);
            aThis.mc.visit(this, h0);
        }
        ///////
        if (aThis.td != null) {
            DefaultMutableTreeNode h0 = new DefaultMutableTreeNode(aThis.td.getClass().getName());
            raiz.add(h0);
            aThis.td.visit(this, h0);
        }
        ///////
        return null;
    }   

    @Override
    public Object visitGoalAST(GoalAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitImportDeclaration(ImportDeclarationAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSingleImportDeclaration(SingleImportDeclaration c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMultipleImportDeclarationAST(MultipleImportDeclarationAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMainClassAST(MainClassAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitClassDeclarationAST(ClassDeclarationAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitClassExtendsDeclaration(ClassExtendsDeclarationAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitVarDeclarationAST(VarDeclarationAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFormalParameterRepAST(FormalParameterRepAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMethodDeclarationAST(MethodDeclarationAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitVarDeclarationRepAST(VarDeclarationRepAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitStatementRepAST(StatementRepAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFormalParameterAST(FormalParameterAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public Object visitFormalParameterListRestAST(FormalParameterListRestAST c, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSimpleTypeAST(SimpleTypeAST c, Object arg) {
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
}
