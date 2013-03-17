
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class SnakeTest {

    @Test
    /* The test for the path Initial0 initialize Default checkScores HighScores newGame Default pressKey NormalStarted play NormalLost  FinalState0  */ 
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
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default checkScores HighScores chooseDifficulty Initial0Difficulty  Normal easy Easy newGame EasyNewGame pressKey EasyStarted play EasyLost  FinalState0  */ 
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
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy norm Normal easy Easy newGame EasyNewGame pressKey EasyStarted play EasyLost  FinalState0  */ 
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
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of easyMapping for the element easy ***/
        sp.difficultySetter.setSelectedIndex(0);
        /*** test code of normMapping for the element norm ***/
        sp.difficultySetter.setSelectedIndex(1);
        /*** test code of easyMapping for the element easy ***/
        sp.difficultySetter.setSelectedIndex(0);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal extreme ExtremeHard norm Normal easy Easy newGame EasyNewGame pressKey EasyStarted play EasyLost  FinalState0  */ 
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
        /*** test code of extremeMapping for the element extreme ***/
        sp.difficultySetter.setSelectedIndex(3);
        /*** test code of normMapping for the element norm ***/
        sp.difficultySetter.setSelectedIndex(1);
        /*** test code of easyMapping for the element easy ***/
        sp.difficultySetter.setSelectedIndex(0);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy checkScores EasyHighScores chooseDifficulty Easy newGame EasyNewGame pressKey EasyStarted play EasyLost  FinalState0  */ 
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
        /*** test code of easyMapping for the element easy ***/
        sp.difficultySetter.setSelectedIndex(0);
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy checkScores EasyHighScores newGame EasyNewGame pressKey EasyStarted play EasyLost  FinalState0  */ 
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
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy hard Hard easy Easy newGame EasyNewGame pressKey EasyStarted play EasyLost  FinalState0  */ 
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
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of easyMapping for the element easy ***/
        sp.difficultySetter.setSelectedIndex(0);
        /*** test code of hardMapping for the element hard ***/
        sp.difficultySetter.setSelectedIndex(2);
        /*** test code of easyMapping for the element easy ***/
        sp.difficultySetter.setSelectedIndex(0);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy newGame EasyNewGame chooseDifficulty Easy newGame EasyNewGame pressKey EasyStarted play EasyLost  FinalState0  */ 
    public void test7(){
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
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy hard Hard extreme ExtremeHard newGame ExHardNewGame pressKey ExHardStarted play ExHardLost  FinalState0  */ 
    public void test8(){
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
        /*** test code of extremeMapping for the element extreme ***/
        sp.difficultySetter.setSelectedIndex(3);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal extreme ExtremeHard checkScores ExHardHighScores chooseDifficulty ExtremeHard newGame ExHardNewGame pressKey ExHardStarted play ExHardLost  FinalState0  */ 
    public void test9(){
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
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal extreme ExtremeHard checkScores ExHardHighScores newGame ExHardNewGame pressKey ExHardStarted play ExHardLost  FinalState0  */ 
    public void test10(){
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
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal extreme ExtremeHard newGame ExHardNewGame chooseDifficulty ExtremeHard newGame ExHardNewGame pressKey ExHardStarted play ExHardLost  FinalState0  */ 
    public void test11(){
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
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal extreme ExtremeHard hard Hard newGame HardNewGame pressKey HardStarted play HardLost  FinalState0  */ 
    public void test12(){
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
        /*** test code of hardMapping for the element hard ***/
        sp.difficultySetter.setSelectedIndex(2);
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy hard Hard checkScores HardHighScores chooseDifficulty Hard newGame HardNewGame pressKey HardStarted play HardLost  FinalState0  */ 
    public void test13(){
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
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy hard Hard checkScores HardHighScores NewGame HardNewGame pressKey HardStarted play HardLost  FinalState0  */ 
    public void test14(){
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
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy hard Hard newGame HardNewGame chooseDifficulty Hard newGame HardNewGame pressKey HardStarted play HardLost  FinalState0  */ 
    public void test15(){
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
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal checkScores HighScores newGame Default pressKey NormalStarted play NormalLost  FinalState0  */ 
    public void test16(){
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
        /*** test code of checkScoresMapping for the element checkScores ***/
        nvHighScores.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy newGame EasyNewGame checkScores EasyHighScores chooseDifficulty Easy newGame EasyNewGame pressKey EasyStarted play EasyLost  FinalState0  */ 
    public void test17(){
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
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal extreme ExtremeHard newGame ExHardNewGame checkScores ExHardHighScores chooseDifficulty ExtremeHard newGame ExHardNewGame pressKey ExHardStarted play ExHardLost  FinalState0  */ 
    public void test18(){
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
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

    @Test
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy hard Hard newGame HardNewGame checkScores HardHighScores chooseDifficulty Hard newGame HardNewGame pressKey HardStarted play HardLost  FinalState0  */ 
    public void test19(){
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
        /*** test code of chooseDifficultyMapping for the element chooseDifficulty ***/
        nvDifficulties.doClick();
        /*** test code of newGameMapping for the element newGame ***/
        nvNewGame.doClick();
        /*** test code of pressKeyMapping for the element pressKey ***/
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        /*** test code of playMapping for the element play ***/
        while (gp.getStatus() != Status.LOSE)
        {
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
    }

}
