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

public class TempTest {

    public boolean test(){
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
        nvDifficulties.doClick();
        sp.difficultySetter.setSelectedIndex(0);
        sp.difficultySetter.setSelectedIndex(1);
        sp.difficultySetter.setSelectedIndex(0);
        nvNewGame.doClick();
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        while (gp.getStatus() != Status.LOSE)
        {
        try{
        int osfp = Helper.findNearestPickUp(gp.getPickUps(gp.getPickUps()), gp.getPlayer());
        Helper.getRobotDirection(gp.getPickUps().get(osfp),game.getGamePanel().getPlayer(), robot);
        } catch(Exception e){
        System.err.println(e.getMessage());
        }
        try {
        Thread.sleep(200);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
        return (Difficulty.EASY == gp.getDifficulty()) == true;
    }
}
