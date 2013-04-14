

import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;



public class TempTest {

    public boolean test(){
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        frame.getDealButton().doClick();
        frame.getStayButton().doClick();
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        frame.getPlayAgainButton().doClick();
        frame.getDealButton().doClick();
        frame.getStayButton().doClick();
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        return frame.getWinLoseBox().getText().trim().equals("") == false;
    }
}
