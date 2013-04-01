package osa.ora;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import javax.swing.*;
public class ParserTest {

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault parse Output  FinalStateArithMode logicMode InitialLogicalMode  LogicalDefault parse LogicOutput  FinalStateLogicMode arithMode InitialArithMode  ArithDefault parse Output  FinalStateArithMode  FinalState0  */ 
    public void test0(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of logicModeMapping for the element logicMode ***/
        comboBoxOperation.setSelectedIndex(1);
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of arithModeMapping for the element arithMode ***/
        comboBoxOperation.setSelectedIndex(0);
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault allEqual AllEqual math Math customize ArithDefault parse Output  FinalStateArithMode  FinalState0  */ 
    public void test1(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault parse Output math MathOutput clear Math customize ArithDefault parse Output  FinalStateArithMode  FinalState0  */ 
    public void test2(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of clearMapping for the element clear ***/
        buttonClear.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault math Math left MathLeft right Math customize ArithDefault parse Output  FinalStateArithMode  FinalState0  */ 
    public void test3(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault math Math allEqual AllEqual customize ArithDefault parse Output  FinalStateArithMode  FinalState0  */ 
    public void test4(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault parse Output allEqual AllEqualOutput clear AllEqual customize ArithDefault parse Output  FinalStateArithMode  FinalState0  */ 
    public void test5(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of clearMapping for the element clear ***/
        buttonClear.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault allEqual AllEqual left AllEqualLeft right AllEqual customize ArithDefault parse Output  FinalStateArithMode  FinalState0  */ 
    public void test6(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault math Math left MathLeft customize Left right ArithDefault parse Output  FinalStateArithMode  FinalState0  */ 
    public void test7(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault allEqual AllEqual left AllEqualLeft customize Left right ArithDefault parse Output  FinalStateArithMode  FinalState0  */ 
    public void test8(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault left Left parse LeftOutPut clear Left right ArithDefault parse Output  FinalStateArithMode  FinalState0  */ 
    public void test9(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of clearMapping for the element clear ***/
        buttonClear.doClick();
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault allEqual AllEqual parse AllEqualOutput  FinalStateArithMode  FinalState0  */ 
    public void test10(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault parse Output math MathOutput allEqual AllEqualOutput  FinalStateArithMode  FinalState0  */ 
    public void test11(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault math Math parse MathOutput  FinalStateArithMode  FinalState0  */ 
    public void test12(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault parse Output allEqual AllEqualOutput math MathOutput  FinalStateArithMode  FinalState0  */ 
    public void test13(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault math Math left MathLeft parse MathLeftOutPut customize LeftOutPut  FinalStateArithMode  FinalState0  */ 
    public void test14(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == true);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault allEqual AllEqual left AllEqualLeft parse AllEqualLeftOutput customize LeftOutPut  FinalStateArithMode  FinalState0  */ 
    public void test15(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == true);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault left Left math MathLeft parse MathLeftOutPut  FinalStateArithMode  FinalState0  */ 
    public void test16(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == true);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault allEqual AllEqual left AllEqualLeft math MathLeft parse MathLeftOutPut  FinalStateArithMode  FinalState0  */ 
    public void test17(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == true);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault left Left parse LeftOutPut math MathLeftOutPut  FinalStateArithMode  FinalState0  */ 
    public void test18(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == true);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault math Math left MathLeft parse MathLeftOutPut clear MathLeft parse MathLeftOutPut  FinalStateArithMode  FinalState0  */ 
    public void test19(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of clearMapping for the element clear ***/
        buttonClear.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == true);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault allEqual AllEqual left AllEqualLeft parse AllEqualLeftOutput math MathLeftOutPut  FinalStateArithMode  FinalState0  */ 
    public void test20(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == true);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault left Left allEqual AllEqualLeft parse AllEqualLeftOutput  FinalStateArithMode  FinalState0  */ 
    public void test21(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == true);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault math Math left MathLeft allEqual AllEqualLeft parse AllEqualLeftOutput  FinalStateArithMode  FinalState0  */ 
    public void test22(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == true);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault left Left parse LeftOutPut allEqual AllEqualLeftOutput  FinalStateArithMode  FinalState0  */ 
    public void test23(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == true);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault math Math left MathLeft parse MathLeftOutPut allEqual AllEqualLeftOutput  FinalStateArithMode  FinalState0  */ 
    public void test24(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == true);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault allEqual AllEqual left AllEqualLeft parse AllEqualLeftOutput clear AllEqualLeft parse AllEqualLeftOutput  FinalStateArithMode  FinalState0  */ 
    public void test25(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of clearMapping for the element clear ***/
        buttonClear.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == true);
    }

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault parse Output  FinalStateArithMode logicMode InitialLogicalMode  LogicalDefault parse LogicOutput left LogicLeftOutPut clear LogicLeft right LogicalDefault parse LogicOutput  FinalStateLogicMode  FinalState0  */ 
    public void test26(){
        DynamicParserView parserView = new DynamicParserView(new DynamicParserApp());
		JTextArea textAreaVar = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(0)).getViewport().getView();
		JCheckBox checkBoxDirection = (JCheckBox) parserView.getComponent().getComponent(1);
		JTextField textFieldString = (JTextField) parserView.getComponent().getComponent(2);
		JComboBox comboBoxOperation = (JComboBox) parserView.getComponent().getComponent(3);
		JList listOperator = (JList) ((JScrollPane)parserView.getComponent().getComponent(4)).getViewport().getView();
		JButton buttonDown = (JButton) parserView.getComponent().getComponent(5);
		JButton buttonUp = (JButton) parserView.getComponent().getComponent(6);
		JRadioButton radioButtonMath = (JRadioButton) parserView.getComponent().getComponent(7);
		JRadioButton radioButtonCustomized = (JRadioButton) parserView.getComponent().getComponent(8);
		JRadioButton radioButtonEqual = (JRadioButton) parserView.getComponent().getComponent(9);
		JButton buttonParse = (JButton) parserView.getComponent().getComponent(10);
		JTextArea textAreaOutput = (JTextArea) ((JScrollPane)parserView.getComponent().getComponent(11)).getViewport().getView();
		JButton buttonClear = (JButton) parserView.getComponent().getComponent(12);
		DynamicParserApp.main(null);

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of logicModeMapping for the element logicMode ***/
        comboBoxOperation.setSelectedIndex(1);
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of clearMapping for the element clear ***/
        buttonClear.doClick();
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

}
