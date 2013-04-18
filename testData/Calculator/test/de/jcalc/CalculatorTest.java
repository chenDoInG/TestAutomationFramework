package de.jcalc;

import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.awt.*;
import javax.swing.*;

public class CalculatorTest {

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized point Frac1 oper OpEntered digit_0 Zero2 rightParenthesis RightParenthesisEntered clear Initialized point Frac1 oper OpEntered digit_0 Zero2 equals Result  FinalStateOn  FinalState  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of rightParenthesisMapping for the element rightParenthesis ***/
        jbRIGHTPARENTHESIS.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized negate Negated1 leftParenthesis LeftParenthesisEntered digit_0 Zero2 point Frac2 clear Initialized point Frac1 oper OpEntered digit_0 Zero2 equals Result  FinalStateOn  FinalState  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of leftParenthesisMapping for the element leftParenthesis ***/
        jbLEFTPARENTHESIS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized negate Negated1 leftParenthesis LeftParenthesisEntered digit_1-9 Int2 digit_0-9 Int2 rightParenthesis RightParenthesisEntered clear Initialized point Frac1 oper OpEntered digit_0 Zero2 equals Result  FinalStateOn  FinalState  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of leftParenthesisMapping for the element leftParenthesis ***/
        jbLEFTPARENTHESIS.doClick();
        /*** test code of digit_1-9Mapping for the element digit_1-9 ***/
        jb2.doClick();
        /*** test code of digit_0-9Mapping for the element digit_0-9 ***/
        jb2.doClick();
        /*** test code of rightParenthesisMapping for the element rightParenthesis ***/
        jbRIGHTPARENTHESIS.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized point Frac1 oper OpEntered digit_0 Zero2 digit_0 Zero2 leftParenthesis LeftParenthesisEntered digit_0 Zero1 point Frac1 oper OpEntered digit_0 Zero2 equals Result  FinalStateOn  FinalState  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of leftParenthesisMapping for the element leftParenthesis ***/
        jbLEFTPARENTHESIS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized point Frac1 oper OpEntered negate Negated2 point Frac2 digit_0-9 Frac2 clear Initialized point Frac1 oper OpEntered digit_0 Zero2 equals Result  FinalStateOn  FinalState  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of digit_0-9Mapping for the element digit_0-9 ***/
        jb2.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized digit_0 Zero1 oper OpEntered point Frac2 equals Result  FinalStateOn  FinalState  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized point Frac1 oper OpEntered negate Negated2 rightParenthesis RightParenthesisEntered oper OpEntered digit_1-9 Int2 equals Result  FinalStateOn  FinalState  */ 
    public void test6(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of rightParenthesisMapping for the element rightParenthesis ***/
        jbRIGHTPARENTHESIS.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_1-9Mapping for the element digit_1-9 ***/
        jb2.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized negate Negated1 leftParenthesis LeftParenthesisEntered point Frac2 leftParenthesis LeftParenthesisEntered oper OpEntered digit_0 Zero2 equals Result clear Initialized digit_0 Zero1 digit_0 Zero1 negate Negated1 oper OpEntered negate Negated2 digit_0 Zero2 digit_1-9 Int2 leftParenthesis LeftParenthesisEntered negate Negated2 digit_1-9 Int2 point Frac2 rightParenthesis RightParenthesisEntered oper OpEntered clear Initialized point Frac1 digit_0-9 Frac1 negate Negated1 clear Initialized digit_1-9 Int1 point Frac1 oper OpEntered rightParenthesis RightParenthesisEntered rightParenthesis RightParenthesisEntered equals Result  FinalStateOn  FinalState  */ 
    public void test7(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of leftParenthesisMapping for the element leftParenthesis ***/
        jbLEFTPARENTHESIS.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of leftParenthesisMapping for the element leftParenthesis ***/
        jbLEFTPARENTHESIS.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of digit_1-9Mapping for the element digit_1-9 ***/
        jb2.doClick();
        /*** test code of leftParenthesisMapping for the element leftParenthesis ***/
        jbLEFTPARENTHESIS.doClick();
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of digit_1-9Mapping for the element digit_1-9 ***/
        jb2.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of rightParenthesisMapping for the element rightParenthesis ***/
        jbRIGHTPARENTHESIS.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of digit_0-9Mapping for the element digit_0-9 ***/
        jb2.doClick();
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of digit_1-9Mapping for the element digit_1-9 ***/
        jb2.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of rightParenthesisMapping for the element rightParenthesis ***/
        jbRIGHTPARENTHESIS.doClick();
        /*** test code of rightParenthesisMapping for the element rightParenthesis ***/
        jbRIGHTPARENTHESIS.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized point Frac1 oper OpEntered negate Negated2 leftParenthesis LeftParenthesisEntered digit_1-9 Int1 digit_0-9 Int1 oper OpEntered leftParenthesis LeftParenthesisEntered point Frac1 negate Negated1 negate Negated1 point Frac1 clear Initialized point Frac1 oper OpEntered digit_0 Zero2 equals Result  FinalStateOn  FinalState  */ 
    public void test8(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of leftParenthesisMapping for the element leftParenthesis ***/
        jbLEFTPARENTHESIS.doClick();
        /*** test code of digit_1-9Mapping for the element digit_1-9 ***/
        jb2.doClick();
        /*** test code of digit_0-9Mapping for the element digit_0-9 ***/
        jb2.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of leftParenthesisMapping for the element leftParenthesis ***/
        jbLEFTPARENTHESIS.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized negate Negated1 leftParenthesis LeftParenthesisEntered clear Initialized digit_0 Zero1 digit_1-9 Int1 negate Negated1 leftParenthesis LeftParenthesisEntered negate Negated1 digit_1-9 Int1 clear Initialized point Frac1 oper OpEntered digit_0 Zero2 equals Result  FinalStateOn  FinalState  */ 
    public void test9(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of leftParenthesisMapping for the element leftParenthesis ***/
        jbLEFTPARENTHESIS.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of digit_1-9Mapping for the element digit_1-9 ***/
        jb2.doClick();
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of leftParenthesisMapping for the element leftParenthesis ***/
        jbLEFTPARENTHESIS.doClick();
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of digit_1-9Mapping for the element digit_1-9 ***/
        jb2.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized negate Negated1 digit_0 Zero1 clear Initialized point Frac1 oper OpEntered digit_0 Zero2 equals Result  FinalStateOn  FinalState  */ 
    public void test10(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized point Frac1 oper OpEntered negate Negated2 clear Initialized point Frac1 oper OpEntered digit_0 Zero2 equals Result  FinalStateOn  FinalState  */ 
    public void test11(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of negatelMapping for the element negate ***/
        jbREVERSE.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized point Frac1 oper OpEntered digit_0 Zero2 clear Initialized point Frac1 oper OpEntered digit_0 Zero2 equals Result  FinalStateOn  FinalState  */ 
    public void test12(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

    @Test
    /* The test for the path Initial initialize InitialOn  Initialized point Frac1 oper OpEntered digit_1-9 Int2 clear Initialized point Frac1 oper OpEntered digit_0 Zero2 equals Result  FinalStateOn  FinalState  */ 
    public void test13(){
        /*** test code of initializeMapping for the element initialize ***/
        FrmJCalc frm = new FrmJCalc();
        Component [] components = frm.getFrame().getRootPane().getContentPane().getComponents();
        
        JButton jb0 = new JButton();
        JButton jb2 = new JButton();
        
        JButton jbPLUS = new JButton();
        JButton jbMINUS = new JButton();
        
        JButton jbPOINT = new JButton();
        JButton jbREVERSE = new JButton();
        
        JButton jbRESULT = new JButton();
        JButton jbLEFTPARENTHESIS = new JButton();
        JButton jbRIGHTPARENTHESIS = new JButton();
        JButton jbCLEAR = new JButton();
        
        for(Component component: components){
        if(component instanceof JButton){
        if(((JButton) component).getText().equals("0")){
        jb0 = (JButton) component;
        }
        if(((JButton) component).getText().equals("2")){
        jb2 = (JButton) component;
        }
        if(((JButton) component).getText().equals("+")){
        jbPLUS = (JButton) component;
        }
        if(((JButton) component).getText().equals("-")){
        jbMINUS = (JButton) component;
        }
        if(((JButton) component).getText().equals(".")){
        jbPOINT = (JButton) component;
        }
        if(((JButton) component).getText().equals("+/-")){
        jbREVERSE = (JButton) component;
        }
        if(((JButton) component).getText().equals("(")){
        jbLEFTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals(")")){
        jbRIGHTPARENTHESIS = (JButton) component;
        }
        if(((JButton) component).getText().equals("=")){
        jbRESULT = (JButton) component;
        }
        if(((JButton) component).getText().equals("clr")){
        jbCLEAR = (JButton) component;
        }
        }
        }
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_1-9Mapping for the element digit_1-9 ***/
        jb2.doClick();
        /*** test code of clearMapping for the element clear ***/
        jbCLEAR.doClick();
        /*** test code of pointMapping for the element point ***/
        jbPOINT.doClick();
        /*** test code of operMapping for the element oper ***/
        jbPLUS.doClick();
        /*** test code of digit_0Mapping for the element digit_0 ***/
        jb0.doClick();
        /*** test code of equalsMapping for the element equals ***/
        jbRESULT.doClick();
        assertEquals(true, frm.getTxtDisplayContent().length() > 0);
    }

}
