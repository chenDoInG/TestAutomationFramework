package com.arthurguru.crosslexic;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import javax.swing.*;
public class CrossLexicTest {

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 search Searching  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of searchMapping for the element search ***/
        cl.getSearchButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 clear Clear  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of clearMapping for the element clear ***/
        cl.getClearButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 switch 11-19/0 switch 1-10/0  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch1To10Mapping for the element switch ***/
        comboBox.setSelectedIndex(3);
        assertEquals(true, cl.getWordlength() < 11);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 back 20/0  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of deleteThirteenLettersMapping for the element back ***/
        
        cl.getLetterText()[0].setText("");
        cl.getLetterText()[1].setText("");
        cl.getLetterText()[2].setText("");
        cl.getLetterText()[3].setText("");
        cl.getLetterText()[4].setText("");
        cl.getLetterText()[5].setText("");
        cl.getLetterText()[6].setText("");
        cl.getLetterText()[7].setText("");
        cl.getLetterText()[8].setText("");
        cl.getLetterText()[9].setText("");
        cl.getLetterText()[10].setText("");
        cl.getLetterText()[11].setText("");
        cl.getLetterText()[12].setText("");
        assertEquals(true, cl.getLettersLength() == 0);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 switch 11-19/0 switch 20/0  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch20Mapping for the element switch ***/
        comboBox.setSelectedIndex(19);
        assertEquals(true, cl.getLettersLength() == 0);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 search Searching  FinalState0  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of searchMapping for the element search ***/
        cl.getSearchButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 switch 11-19/0 search Searching  FinalState0  */ 
    public void test6(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of searchMapping for the element search ***/
        cl.getSearchButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 clear Clear  FinalState0  */ 
    public void test7(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of clearMapping for the element clear ***/
        cl.getClearButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 switch 11-19/0 clear Clear  FinalState0  */ 
    public void test8(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of clearMapping for the element clear ***/
        cl.getClearButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 search Searching clear Clear  FinalState0  */ 
    public void test9(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of searchMapping for the element search ***/
        cl.getSearchButton().doClick();
        /*** test code of clearMapping for the element clear ***/
        cl.getClearButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 switch 11-19/0 typeLetters 11-19/1-10  FinalState0  */ 
    public void test10(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        assertEquals(true, cl.getLettersLength() > 0 && cl.getLettersLength() < 11);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 typeLetters 20/11-20 switch 11-19/11-19  FinalState0  */ 
    public void test11(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of typeThirteenLettersMapping for the element typeLetters ***/
        
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        cl.getLetterText()[6].setText("f");
        cl.getLetterText()[7].setText("f");
        cl.getLetterText()[8].setText("f");
        cl.getLetterText()[9].setText("f");
        cl.getLetterText()[10].setText("f");
        cl.getLetterText()[11].setText("f");
        cl.getLetterText()[12].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        assertEquals(true, cl.getLettersLength() > 10);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 switch 11-19/1-10 switch 1-10/1-10  FinalState0  */ 
    public void test12(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch1To10Mapping for the element switch ***/
        comboBox.setSelectedIndex(3);
        assertEquals(true, cl.getWordlength() < 11);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 clear Clear backToTyping InitialInTyping  20/0  FinalState0  */ 
    public void test13(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of clearMapping for the element clear ***/
        cl.getClearButton().doClick();
        /*** test code of backToTypingMapping for the element backToTyping ***/
        comboBox.setSelectedIndex(19);
        assertEquals(true, cl.getLettersLength() == 0);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 typeLetters 20/11-20 back 20/1-10  FinalState0  */ 
    public void test14(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of typeThirteenLettersMapping for the element typeLetters ***/
        
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        cl.getLetterText()[6].setText("f");
        cl.getLetterText()[7].setText("f");
        cl.getLetterText()[8].setText("f");
        cl.getLetterText()[9].setText("f");
        cl.getLetterText()[10].setText("f");
        cl.getLetterText()[11].setText("f");
        cl.getLetterText()[12].setText("f");
        /*** test code of deleteTenLettersMapping for the element back ***/
        cl.getLetterText()[3].setText("");
        cl.getLetterText()[4].setText("");
        cl.getLetterText()[5].setText("");
        cl.getLetterText()[6].setText("");
        cl.getLetterText()[7].setText("");
        cl.getLetterText()[8].setText("");
        cl.getLetterText()[9].setText("");
        cl.getLetterText()[10].setText("");
        cl.getLetterText()[11].setText("");
        cl.getLetterText()[12].setText("");
        assertEquals(true, cl.getLettersLength() > 0 && cl.getLettersLength() < 11);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 switch 11-19/1-10 switch 20/1-10  FinalState0  */ 
    public void test15(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch20Mapping for the element switch ***/
        comboBox.setSelectedIndex(19);
        assertEquals(true, cl.getLettersLength() > 0 && cl.getLettersLength() < 11);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 switch 11-19/1-10 back 11-19/0  FinalState0  */ 
    public void test16(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of deleteThirteenLettersMapping for the element back ***/
        
        cl.getLetterText()[0].setText("");
        cl.getLetterText()[1].setText("");
        cl.getLetterText()[2].setText("");
        cl.getLetterText()[3].setText("");
        cl.getLetterText()[4].setText("");
        cl.getLetterText()[5].setText("");
        cl.getLetterText()[6].setText("");
        cl.getLetterText()[7].setText("");
        cl.getLetterText()[8].setText("");
        cl.getLetterText()[9].setText("");
        cl.getLetterText()[10].setText("");
        cl.getLetterText()[11].setText("");
        cl.getLetterText()[12].setText("");
        assertEquals(true, cl.getLettersLength() == 0);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 switch 11-19/0 switch 1-10/0 switch 11-19/0  FinalState0  */ 
    public void test17(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch1To10Mapping for the element switch ***/
        comboBox.setSelectedIndex(3);
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        assertEquals(true, cl.getLettersLength() == 0);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 typeLetters 20/11-20 search Searching  FinalState0  */ 
    public void test18(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of typeThirteenLettersMapping for the element typeLetters ***/
        
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        cl.getLetterText()[6].setText("f");
        cl.getLetterText()[7].setText("f");
        cl.getLetterText()[8].setText("f");
        cl.getLetterText()[9].setText("f");
        cl.getLetterText()[10].setText("f");
        cl.getLetterText()[11].setText("f");
        cl.getLetterText()[12].setText("f");
        /*** test code of searchMapping for the element search ***/
        cl.getSearchButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 switch 11-19/1-10 search Searching  FinalState0  */ 
    public void test19(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of searchMapping for the element search ***/
        cl.getSearchButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 switch 11-19/0 switch 1-10/0 search Searching  FinalState0  */ 
    public void test20(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch1To10Mapping for the element switch ***/
        comboBox.setSelectedIndex(3);
        /*** test code of searchMapping for the element search ***/
        cl.getSearchButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 typeLetters 20/11-20 clear Clear  FinalState0  */ 
    public void test21(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of typeThirteenLettersMapping for the element typeLetters ***/
        
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        cl.getLetterText()[6].setText("f");
        cl.getLetterText()[7].setText("f");
        cl.getLetterText()[8].setText("f");
        cl.getLetterText()[9].setText("f");
        cl.getLetterText()[10].setText("f");
        cl.getLetterText()[11].setText("f");
        cl.getLetterText()[12].setText("f");
        /*** test code of clearMapping for the element clear ***/
        cl.getClearButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 switch 11-19/1-10 clear Clear  FinalState0  */ 
    public void test22(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of clearMapping for the element clear ***/
        cl.getClearButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 switch 11-19/0 switch 1-10/0 clear Clear  FinalState0  */ 
    public void test23(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch1To10Mapping for the element switch ***/
        comboBox.setSelectedIndex(3);
        /*** test code of clearMapping for the element clear ***/
        cl.getClearButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 switch 11-19/1-10 typeLetters 11-19/11-19  FinalState0  */ 
    public void test24(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of typeThirteenLettersMapping for the element typeLetters ***/
        
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        cl.getLetterText()[6].setText("f");
        cl.getLetterText()[7].setText("f");
        cl.getLetterText()[8].setText("f");
        cl.getLetterText()[9].setText("f");
        cl.getLetterText()[10].setText("f");
        cl.getLetterText()[11].setText("f");
        cl.getLetterText()[12].setText("f");
        assertEquals(true, cl.getLettersLength() > 10);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 switch 11-19/0 switch 1-10/0 typeLetters 1-10/1-10  FinalState0  */ 
    public void test25(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch1To10Mapping for the element switch ***/
        comboBox.setSelectedIndex(3);
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        assertEquals(true, cl.getWordlength() < 11);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 typeLetters 20/11-20 switch 11-19/11-19 search Searching  FinalState0  */ 
    public void test26(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of typeThirteenLettersMapping for the element typeLetters ***/
        
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        cl.getLetterText()[6].setText("f");
        cl.getLetterText()[7].setText("f");
        cl.getLetterText()[8].setText("f");
        cl.getLetterText()[9].setText("f");
        cl.getLetterText()[10].setText("f");
        cl.getLetterText()[11].setText("f");
        cl.getLetterText()[12].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of searchMapping for the element search ***/
        cl.getSearchButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 switch 11-19/1-10 switch 1-10/1-10 search Searching  FinalState0  */ 
    public void test27(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch1To10Mapping for the element switch ***/
        comboBox.setSelectedIndex(3);
        /*** test code of searchMapping for the element search ***/
        cl.getSearchButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 typeLetters 20/11-20 switch 11-19/11-19 clear Clear  FinalState0  */ 
    public void test28(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of typeThirteenLettersMapping for the element typeLetters ***/
        
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        cl.getLetterText()[6].setText("f");
        cl.getLetterText()[7].setText("f");
        cl.getLetterText()[8].setText("f");
        cl.getLetterText()[9].setText("f");
        cl.getLetterText()[10].setText("f");
        cl.getLetterText()[11].setText("f");
        cl.getLetterText()[12].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of clearMapping for the element clear ***/
        cl.getClearButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 switch 11-19/1-10 switch 1-10/1-10 clear Clear  FinalState0  */ 
    public void test29(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch1To10Mapping for the element switch ***/
        comboBox.setSelectedIndex(3);
        /*** test code of clearMapping for the element clear ***/
        cl.getClearButton().doClick();
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 typeLetters 20/11-20 switch 11-19/11-19 switch 20/11-20  FinalState0  */ 
    public void test30(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of typeThirteenLettersMapping for the element typeLetters ***/
        
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        cl.getLetterText()[6].setText("f");
        cl.getLetterText()[7].setText("f");
        cl.getLetterText()[8].setText("f");
        cl.getLetterText()[9].setText("f");
        cl.getLetterText()[10].setText("f");
        cl.getLetterText()[11].setText("f");
        cl.getLetterText()[12].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch20Mapping for the element switch ***/
        comboBox.setSelectedIndex(19);
        assertEquals(true, cl.getLettersLength() > 10);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 typeLetters 20/11-20 switch 11-19/11-19 back 11-19/1-10  FinalState0  */ 
    public void test31(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of typeThirteenLettersMapping for the element typeLetters ***/
        
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        cl.getLetterText()[6].setText("f");
        cl.getLetterText()[7].setText("f");
        cl.getLetterText()[8].setText("f");
        cl.getLetterText()[9].setText("f");
        cl.getLetterText()[10].setText("f");
        cl.getLetterText()[11].setText("f");
        cl.getLetterText()[12].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of deleteTenLettersMapping for the element back ***/
        cl.getLetterText()[3].setText("");
        cl.getLetterText()[4].setText("");
        cl.getLetterText()[5].setText("");
        cl.getLetterText()[6].setText("");
        cl.getLetterText()[7].setText("");
        cl.getLetterText()[8].setText("");
        cl.getLetterText()[9].setText("");
        cl.getLetterText()[10].setText("");
        cl.getLetterText()[11].setText("");
        cl.getLetterText()[12].setText("");
        assertEquals(true, cl.getLettersLength() > 0 && cl.getLettersLength() < 11);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 switch 11-19/1-10 switch 1-10/1-10 switch 11-19/1-10  FinalState0  */ 
    public void test32(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch1To10Mapping for the element switch ***/
        comboBox.setSelectedIndex(3);
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        assertEquals(true, cl.getLettersLength() > 0 && cl.getLettersLength() < 11);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 switch 11-19/1-10 switch 1-10/1-10 back 1-10/0  FinalState0  */ 
    public void test33(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch1To10Mapping for the element switch ***/
        comboBox.setSelectedIndex(3);
        /*** test code of deleteThirteenLettersMapping for the element back ***/
        
        cl.getLetterText()[0].setText("");
        cl.getLetterText()[1].setText("");
        cl.getLetterText()[2].setText("");
        cl.getLetterText()[3].setText("");
        cl.getLetterText()[4].setText("");
        cl.getLetterText()[5].setText("");
        cl.getLetterText()[6].setText("");
        cl.getLetterText()[7].setText("");
        cl.getLetterText()[8].setText("");
        cl.getLetterText()[9].setText("");
        cl.getLetterText()[10].setText("");
        cl.getLetterText()[11].setText("");
        cl.getLetterText()[12].setText("");
        assertEquals(true, cl.getWordlength() < 11);
    }

    @Test
    /* The test for the path Initial0 initialize InitialInTyping  20/0 typeLetters 20/1-10 typeLetters 20/11-20 switch 11-19/11-19 switch 1-10/1-10  FinalState0  */ 
    public void test34(){
        /*** test code of initializeMapping for the element initialize ***/
        Crosslexic cl = new Crosslexic();
        JComboBox comboBox = cl.getWordlengthComboBox();
        /*** test code of typeSixLettersMapping for the element typeLetters ***/
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        /*** test code of typeThirteenLettersMapping for the element typeLetters ***/
        
        cl.getLetterText()[0].setText("a");
        cl.getLetterText()[1].setText("b");
        cl.getLetterText()[2].setText("c");
        cl.getLetterText()[3].setText("d");
        cl.getLetterText()[4].setText("e");
        cl.getLetterText()[5].setText("f");
        cl.getLetterText()[6].setText("f");
        cl.getLetterText()[7].setText("f");
        cl.getLetterText()[8].setText("f");
        cl.getLetterText()[9].setText("f");
        cl.getLetterText()[10].setText("f");
        cl.getLetterText()[11].setText("f");
        cl.getLetterText()[12].setText("f");
        /*** test code of switch11To19Mapping for the element switch ***/
        comboBox.setSelectedIndex(10);
        /*** test code of switch1To10Mapping for the element switch ***/
        comboBox.setSelectedIndex(3);
        assertEquals(true, cl.getWordlength() < 11);
    }

}
