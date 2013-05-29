package com.arthurguru.crosslexic;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import javax.swing.*;
public class TempTest {

    public boolean test(){
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        comboBox.setSelectedIndex(10);
        comboBox.setSelectedIndex(19);
        comboBox.setSelectedIndex(10);
        comboBox.setSelectedIndex(10);
        return cl.getWordlength() < 11;
    }
}
