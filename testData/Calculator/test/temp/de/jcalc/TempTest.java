package de.jcalc;

import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.awt.*;
import javax.swing.*;

public class TempTest {

    public boolean test(){
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
        jbPOINT.doClick();
        jbPLUS.doClick();
        jb2.doClick();
        jbCLEAR.doClick();
        jbPOINT.doClick();
        jbPLUS.doClick();
        jb0.doClick();
        jbRESULT.doClick();
        return frm.getTxtDisplayContent().length() > 0;
    }
}
