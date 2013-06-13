package snakeapplication;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import snakeapplication.GamePanel.Difficulty;
import snakeapplication.GamePanel.Status;
import snakeapplication.SideNavigationBar.NavButton;
public class SnakeTest {

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy checkScores EasyHighScores chooseDifficulty Easy hard Hard newGame HardNewGame chooseDifficulty Hard easy Easy hard Hard checkScores HardHighScores chooseDifficulty Hard extreme ExtremeHard newGame ExHardNewGame chooseDifficulty ExtremeHard hard Hard newGame HardNewGame pressKey HardStarted play HardLost  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        SnakeApplication game = new SnakeApplication();
        GamePanel gp = game.getGamePanel();
        SideNavigationBar sn = game.getSideNavigation();
        NavButton nvHighScores = sn.getHighScores();
        NavButton nvNewGame = sn.getNewGame();
        NavButton nvDifficulties = sn.getSettings();
        SettingsPanel sp = game.getSettingsPanel();
        Robot robot = null;
        try {
        robot = new Robot();
        } catch (AWTException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of easyMapping for the element easy ***/
        sp.difficultySetter.setSelectedIndex(0);
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of hardMapping for the element hard ***/
        sp.difficultySetter.setSelectedIndex(2);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of easyMapping for the element easy ***/
        sp.difficultySetter.setSelectedIndex(0);
        /*** test code of hardMapping for the element hard ***/
        sp.difficultySetter.setSelectedIndex(2);
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of extremeMapping for the element extreme ***/
        sp.difficultySetter.setSelectedIndex(3);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of hardMapping for the element hard ***/
        sp.difficultySetter.setSelectedIndex(2);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        
        int i = 0;
        while (gp.getStatus() != Status.LOSE)
        {
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        i ++;
        if(i == 10)
        gp.setStatus(Status.LOSE);
        }
        assertEquals(true, (Difficulty.HARD == gp.getDifficulty()) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy newGame EasyNewGame chooseDifficulty Easy norm Normal extreme ExtremeHard checkScores ExHardHighScores chooseDifficulty ExtremeHard norm Normal checkScores HighScores chooseDifficulty Initial0Difficulty  Normal easy Easy newGame EasyNewGame pressKey EasyStarted play EasyLost  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        SnakeApplication game = new SnakeApplication();
        GamePanel gp = game.getGamePanel();
        SideNavigationBar sn = game.getSideNavigation();
        NavButton nvHighScores = sn.getHighScores();
        NavButton nvNewGame = sn.getNewGame();
        NavButton nvDifficulties = sn.getSettings();
        SettingsPanel sp = game.getSettingsPanel();
        Robot robot = null;
        try {
        robot = new Robot();
        } catch (AWTException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of easyMapping for the element easy ***/
        sp.difficultySetter.setSelectedIndex(0);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of normMapping for the element norm ***/
        sp.difficultySetter.setSelectedIndex(1);
        /*** test code of extremeMapping for the element extreme ***/
        sp.difficultySetter.setSelectedIndex(3);
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of normMapping for the element norm ***/
        sp.difficultySetter.setSelectedIndex(1);
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of easyMapping for the element easy ***/
        sp.difficultySetter.setSelectedIndex(0);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        
        int i = 0;
        while (gp.getStatus() != Status.LOSE)
        {
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        i ++;
        if(i == 10)
        gp.setStatus(Status.LOSE);
        }
        assertEquals(true, (Difficulty.EASY == gp.getDifficulty()) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Default checkScores HighScores newGame Default checkScores HighScores newGame Default pressKey NormalStarted play NormalLost  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        SnakeApplication game = new SnakeApplication();
        GamePanel gp = game.getGamePanel();
        SideNavigationBar sn = game.getSideNavigation();
        NavButton nvHighScores = sn.getHighScores();
        NavButton nvNewGame = sn.getNewGame();
        NavButton nvDifficulties = sn.getSettings();
        SettingsPanel sp = game.getSettingsPanel();
        Robot robot = null;
        try {
        robot = new Robot();
        } catch (AWTException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        
        int i = 0;
        while (gp.getStatus() != Status.LOSE)
        {
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        i ++;
        if(i == 10)
        gp.setStatus(Status.LOSE);
        }
        assertEquals(true, (Difficulty.NORM == gp.getDifficulty()) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy hard Hard newGame HardNewGame checkScores HardHighScores newGame HardNewGame pressKey HardStarted play HardLost  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        SnakeApplication game = new SnakeApplication();
        GamePanel gp = game.getGamePanel();
        SideNavigationBar sn = game.getSideNavigation();
        NavButton nvHighScores = sn.getHighScores();
        NavButton nvNewGame = sn.getNewGame();
        NavButton nvDifficulties = sn.getSettings();
        SettingsPanel sp = game.getSettingsPanel();
        Robot robot = null;
        try {
        robot = new Robot();
        } catch (AWTException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of easyMapping for the element easy ***/
        sp.difficultySetter.setSelectedIndex(0);
        /*** test code of hardMapping for the element hard ***/
        sp.difficultySetter.setSelectedIndex(2);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        
        int i = 0;
        while (gp.getStatus() != Status.LOSE)
        {
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        i ++;
        if(i == 10)
        gp.setStatus(Status.LOSE);
        }
        assertEquals(true, (Difficulty.HARD == gp.getDifficulty()) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal extreme ExtremeHard newGame ExHardNewGame checkScores ExHardHighScores newGame ExHardNewGame pressKey ExHardStarted play ExHardLost  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        SnakeApplication game = new SnakeApplication();
        GamePanel gp = game.getGamePanel();
        SideNavigationBar sn = game.getSideNavigation();
        NavButton nvHighScores = sn.getHighScores();
        NavButton nvNewGame = sn.getNewGame();
        NavButton nvDifficulties = sn.getSettings();
        SettingsPanel sp = game.getSettingsPanel();
        Robot robot = null;
        try {
        robot = new Robot();
        } catch (AWTException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of extremeMapping for the element extreme ***/
        sp.difficultySetter.setSelectedIndex(3);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        
        int i = 0;
        while (gp.getStatus() != Status.LOSE)
        {
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        i ++;
        if(i == 10)
        gp.setStatus(Status.LOSE);
        }
        assertEquals(true, (Difficulty.EXTREME == gp.getDifficulty()) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy newGame EasyNewGame checkScores EasyHighScores newGame EasyNewGame pressKey EasyStarted play EasyLost  FinalState0  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        SnakeApplication game = new SnakeApplication();
        GamePanel gp = game.getGamePanel();
        SideNavigationBar sn = game.getSideNavigation();
        NavButton nvHighScores = sn.getHighScores();
        NavButton nvNewGame = sn.getNewGame();
        NavButton nvDifficulties = sn.getSettings();
        SettingsPanel sp = game.getSettingsPanel();
        Robot robot = null;
        try {
        robot = new Robot();
        } catch (AWTException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of easyMapping for the element easy ***/
        sp.difficultySetter.setSelectedIndex(0);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        
        int i = 0;
        while (gp.getStatus() != Status.LOSE)
        {
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        i ++;
        if(i == 10)
        gp.setStatus(Status.LOSE);
        }
        assertEquals(true, (Difficulty.EASY == gp.getDifficulty()) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Default pressKey NormalStarted play NormalLost  FinalState0  */ 
    public void test6(){
        /*** test code of initializeMapping for the element initialize ***/
        SnakeApplication game = new SnakeApplication();
        GamePanel gp = game.getGamePanel();
        SideNavigationBar sn = game.getSideNavigation();
        NavButton nvHighScores = sn.getHighScores();
        NavButton nvNewGame = sn.getNewGame();
        NavButton nvDifficulties = sn.getSettings();
        SettingsPanel sp = game.getSettingsPanel();
        Robot robot = null;
        try {
        robot = new Robot();
        } catch (AWTException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        
        int i = 0;
        while (gp.getStatus() != Status.LOSE)
        {
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        i ++;
        if(i == 10)
        gp.setStatus(Status.LOSE);
        }
        assertEquals(true, (Difficulty.NORM == gp.getDifficulty()) == true);
    }

}
