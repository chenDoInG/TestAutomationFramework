
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class DynamicParserTest {

    @Test
    /* The test for the path   changePrecedence parse    */ 
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

        /*** test code of changePrecedenceMapping for the element changePrecedence ***/
        parserView.setOperStrings(new String[]{ "+", "%", "*", "/" });
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   parse clear parse    */ 
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

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of clearMapping for the element clear ***/
        buttonClear.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   parse changePrecedence    */ 
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
        /*** test code of changePrecedenceMapping for the element changePrecedence ***/
        parserView.setOperStrings(new String[]{ "+", "%", "*", "/" });
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   parse allEqual    */ 
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

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   parse allEqual customize    */ 
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

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   parse math    */ 
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
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   parse math customize    */ 
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

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   parse  logicMode  parse  arithMode  parse    */ 
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
    /* The test for the path   parse  logicMode  changePrecedence parse    */ 
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

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of logicModeMapping for the element logicMode ***/
        comboBoxOperation.setSelectedIndex(1);
        /*** test code of changePrecedenceMapping for the element changePrecedence ***/
        parserView.setOperStrings(new String[]{ "+", "%", "*", "/" });
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
    }

    @Test
    /* The test for the path   parse  logicMode  parse changePrecedence    */ 
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

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of logicModeMapping for the element logicMode ***/
        comboBoxOperation.setSelectedIndex(1);
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of changePrecedenceMapping for the element changePrecedence ***/
        parserView.setOperStrings(new String[]{ "+", "%", "*", "/" });
    }

    @Test
    /* The test for the path   parse  logicMode  parse clear parse    */ 
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

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of logicModeMapping for the element logicMode ***/
        comboBoxOperation.setSelectedIndex(1);
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of clearMapping for the element clear ***/
        buttonClear.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
    }

    @Test
    /* The test for the path   parse  logicMode  parse left right    */ 
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
        /*** test code of logicModeMapping for the element logicMode ***/
        comboBoxOperation.setSelectedIndex(1);
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
    }

    @Test
    /* The test for the path   allEqual math customize parse    */ 
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
    /* The test for the path   parse math clear customize parse    */ 
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
    /* The test for the path   math left right customize parse    */ 
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
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   math allEqual customize parse    */ 
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
    /* The test for the path   parse allEqual clear customize parse    */ 
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
    /* The test for the path   allEqual left right customize parse    */ 
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
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   left changePrecedence right parse    */ 
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
        /*** test code of changePrecedenceMapping for the element changePrecedence ***/
        parserView.setOperStrings(new String[]{ "+", "%", "*", "/" });
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   math left customize right parse    */ 
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
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   allEqual left customize right parse    */ 
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
        /*** test code of customizeMapping for the element customize ***/
        radioButtonCustomized.doClick();
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   left parse clear right parse    */ 
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
    /* The test for the path   allEqual parse    */ 
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

        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   parse math allEqual    */ 
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

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   math parse    */ 
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
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   parse allEqual math    */ 
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

        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of allEqualMapping for the element allEqual ***/
        radioButtonEqual.doClick();
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }

    @Test
    /* The test for the path   left parse changePrecedence    */ 
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

        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
        /*** test code of changePrecedenceMapping for the element changePrecedence ***/
        parserView.setOperStrings(new String[]{ "+", "%", "*", "/" });
    }

    @Test
    /* The test for the path   math left parse customize    */ 
    public void test27(){
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
    }

    @Test
    /* The test for the path   allEqual left parse customize    */ 
    public void test28(){
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
    }

    @Test
    /* The test for the path   left math parse    */ 
    public void test29(){
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
    }

    @Test
    /* The test for the path   allEqual left math parse    */ 
    public void test30(){
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
    }

    @Test
    /* The test for the path   left parse math    */ 
    public void test31(){
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
    }

    @Test
    /* The test for the path   math left parse clear parse    */ 
    public void test32(){
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
    }

    @Test
    /* The test for the path   allEqual left parse math    */ 
    public void test33(){
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
    }

    @Test
    /* The test for the path   left allEqual parse    */ 
    public void test34(){
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
    /* The test for the path   math left allEqual parse    */ 
    public void test35(){
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
    /* The test for the path   left parse allEqual    */ 
    public void test36(){
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
    /* The test for the path   math left parse allEqual    */ 
    public void test37(){
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
    /* The test for the path   allEqual left parse clear parse    */ 
    public void test38(){
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
    /* The test for the path   parse  logicMode  left changePrecedence right parse    */ 
    public void test39(){
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
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of changePrecedenceMapping for the element changePrecedence ***/
        parserView.setOperStrings(new String[]{ "+", "%", "*", "/" });
        /*** test code of rightMapping for the element right ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
    }

    @Test
    /* The test for the path   parse  logicMode  parse left clear right parse    */ 
    public void test40(){
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
    }

    @Test
    /* The test for the path   parse  logicMode  left parse    */ 
    public void test41(){
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
        /*** test code of leftMapping for the element left ***/
        checkBoxDirection.doClick();
        /*** test code of parseMapping for the element parse ***/
        buttonParse.doClick();
    }

    @Test
    /* The test for the path   parse  logicMode  parse left changePrecedence    */ 
    public void test42(){
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
        /*** test code of changePrecedenceMapping for the element changePrecedence ***/
        parserView.setOperStrings(new String[]{ "+", "%", "*", "/" });
    }

}
