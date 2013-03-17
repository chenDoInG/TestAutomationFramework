package snakeapplication;import java.io.*;
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
    /* The test for the path Initial0 initialize Default chooseDifficulty Initial0Difficulty  Normal easy Easy norm Normal easy Easy newGame EasyNewGame pressKey EasyStarted play EasyLost  FinalState0  */ 
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
}
