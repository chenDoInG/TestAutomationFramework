
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TempTest {

    public boolean test(){
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
        buttonParse.doClick();
        return checkBoxDirection.isSelected() == false;
    }
}
