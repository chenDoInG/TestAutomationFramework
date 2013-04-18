package jmines.test;

import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import jmines.control.actions.game.*;
import jmines.model.GameBoard;
import jmines.view.components.*;
import jmines.view.persistence.*;
public class JMinesTest {

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner spanish BegineerSpanish expert ExpertSpanish intermediate IntermediateSpanish otherShape IntermediateSpanishOtherShape english IntermediateOtherShape beginner BeginnerOtherShape expert ExpertOtherShape newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of otherShapeMapping for the element otherShape ***/
        boardMenu.getItem(0).doClick();
        /*** test code of englishMapping for the element english ***/
        languageMenu.getItem(0).doClick();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner expert Expert otherShape ExpertOtherShape spanish ExpertSpanishOtherShape intermediate IntermediateSpanishOtherShape beginner BeginnerSpanishOtherShape expert ExpertSpanishOtherShape newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of otherShapeMapping for the element otherShape ***/
        boardMenu.getItem(0).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner expert Expert spanish ExpertSpanish english Expert spanish ExpertSpanish robotPlay RobotPlaying  Result  FinalState  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of englishMapping for the element english ***/
        languageMenu.getItem(0).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner intermediate Intermediate otherShape IntermediateOtherShape spanish IntermediateSpanishOtherShape expert ExpertSpanishOtherShape beginner BeginnerSpanishOtherShape newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of otherShapeMapping for the element otherShape ***/
        boardMenu.getItem(0).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner intermediate Intermediate spanish IntermediateSpanish beginner BegineerSpanish english Beginner otherShape BeginnerOtherShape spanish BeginnerSpanishOtherShape intermediate IntermediateSpanishOtherShape newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of englishMapping for the element english ***/
        languageMenu.getItem(0).doClick();
        /*** test code of otherShapeMapping for the element otherShape ***/
        boardMenu.getItem(0).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner intermediate Intermediate beginner Beginner intermediate Intermediate expert Expert intermediate Intermediate expert Expert beginner Beginner expert Expert spanish ExpertSpanish beginner BegineerSpanish intermediate IntermediateSpanish english Intermediate spanish IntermediateSpanish expert ExpertSpanish otherShape ExpertSpanishOtherShape english ExpertOtherShape intermediate IntermediateOtherShape newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of englishMapping for the element english ***/
        languageMenu.getItem(0).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of otherShapeMapping for the element otherShape ***/
        boardMenu.getItem(0).doClick();
        /*** test code of englishMapping for the element english ***/
        languageMenu.getItem(0).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner robotPlay RobotPlaying  Result newGame NewGame  InitialInDifficulty beginner Beginner spanish BegineerSpanish otherShape BeginnerSpanishOtherShape english BeginnerOtherShape intermediate IntermediateOtherShape expert ExpertOtherShape beginner BeginnerOtherShape newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test6(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of otherShapeMapping for the element otherShape ***/
        boardMenu.getItem(0).doClick();
        /*** test code of englishMapping for the element english ***/
        languageMenu.getItem(0).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame newGame NewGame robotPlay RobotPlaying newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test7(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test8(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test9(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner intermediate Intermediate newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test10(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner expert Expert newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test11(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner spanish BegineerSpanish newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test12(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner intermediate Intermediate spanish IntermediateSpanish newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test13(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner expert Expert spanish ExpertSpanish newGame NewGame robotPlay RobotPlaying  Result  FinalState  */ 
    public void test14(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of newGameMapping for the element newGame ***/
        gameMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner intermediate Intermediate robotPlay RobotPlaying  Result  FinalState  */ 
    public void test15(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner expert Expert robotPlay RobotPlaying  Result  FinalState  */ 
    public void test16(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner spanish BegineerSpanish robotPlay RobotPlaying  Result  FinalState  */ 
    public void test17(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner otherShape BeginnerOtherShape robotPlay RobotPlaying  Result  FinalState  */ 
    public void test18(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of otherShapeMapping for the element otherShape ***/
        boardMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner intermediate Intermediate spanish IntermediateSpanish robotPlay RobotPlaying  Result  FinalState  */ 
    public void test19(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner intermediate Intermediate otherShape IntermediateOtherShape robotPlay RobotPlaying  Result  FinalState  */ 
    public void test20(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of otherShapeMapping for the element otherShape ***/
        boardMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner expert Expert spanish ExpertSpanish robotPlay RobotPlaying  Result  FinalState  */ 
    public void test21(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner expert Expert otherShape ExpertOtherShape robotPlay RobotPlaying  Result  FinalState  */ 
    public void test22(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of otherShapeMapping for the element otherShape ***/
        boardMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner spanish BegineerSpanish otherShape BeginnerSpanishOtherShape robotPlay RobotPlaying  Result  FinalState  */ 
    public void test23(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of otherShapeMapping for the element otherShape ***/
        boardMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner intermediate Intermediate spanish IntermediateSpanish otherShape IntermediateSpanishOtherShape robotPlay RobotPlaying  Result  FinalState  */ 
    public void test24(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of intermediateMapping for the element intermediate ***/
        gameMenu.getItem(3).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of otherShapeMapping for the element otherShape ***/
        boardMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

    @Test
    /* The test for the path Initial initialize NewGame  InitialInDifficulty beginner Beginner expert Expert spanish ExpertSpanish otherShape ExpertSpanishOtherShape robotPlay RobotPlaying  Result  FinalState  */ 
    public void test25(){
        /*** test code of initializeMapping for the element initialize ***/
        final Configuration tmpConfiguration = Configuration.getInstance();
        Configuration   CONFIGURATION = tmpConfiguration;
        String userLookAndFeelClassName = CONFIGURATION.getString(Configuration.KEY_USER_LOOKANDFEEL);
        
        MainFrame frame = null;
        frame = MainFrame.changeLookAndFeel(UIManager.getLookAndFeel(), frame);
        JMenu gameMenu = frame.getMainFrameMenuBar().getGameMenu();
        GamePanel gamePanel = frame.getMainPanel().getGamePanel();
        final MainPanel mainPanel = frame.getMainPanel();
        Thread thread = null;
        JMenu languageMenu = frame.getMainFrameMenuBar().getLanguageMenu();
        JMenu boardMenu = frame.getMainFrameMenuBar().getBoardMenu();
        JMenu robotMenu = frame.getMainFrameMenuBar().getRobotMenu();
        /*** test code of beginnerMapping for the element beginner ***/
        gameMenu.getItem(2).doClick();
        /*** test code of expertMapping for the element expert ***/
        gameMenu.getItem(4).doClick();
        /*** test code of spanishMapping for the element spanish ***/
        languageMenu.getItem(1).doClick();
        /*** test code of otherShapeMapping for the element otherShape ***/
        boardMenu.getItem(0).doClick();
        /*** test code of robotPlayMapping for the element robotPlay ***/
        robotMenu.getItem(6).doClick();
    }

}
