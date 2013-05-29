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
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        
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
        return (Difficulty.NORM == gp.getDifficulty()) == true;
    }
}
