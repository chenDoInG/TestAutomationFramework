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
public class TempTest {

    public boolean test(){
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
        gameMenu.getItem(2).doClick();
        languageMenu.getItem(1).doClick();
        gameMenu.getItem(4).doClick();
        gameMenu.getItem(3).doClick();
        boardMenu.getItem(0).doClick();
        languageMenu.getItem(0).doClick();
        return gamePanel.getDifficulty().equals("intermediate");
    }
}
