package osa.ora;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;
import javax.swing.*;

public class DynamicParserTest {

    @Test
    /* The test for the path Initial0  InitialArithMode  ArithDefault parse Output math MathOutput  FinalStateArithMode  FinalState0  */ 
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
        /*** test code of mathMapping for the element math ***/
        radioButtonMath.doClick();
        assertEquals(true, checkBoxDirection.isSelected() == false);
    }
}
