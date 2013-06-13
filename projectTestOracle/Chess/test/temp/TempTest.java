
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TempTest {

    public boolean test(){
        GameController gc = new GameController();
        final ChessBoard chessBoard = gc.getChessBoard();
        chessBoard.initialiseBoard();
        final JLabel[][] chessLabels = chessBoard.getChessSquareArray();
        JCheckBox checkBox = chessBoard.getAllowUndoCheckBox();
        Thread thread2 = null;
        Thread thread3 = null;
        Thread thread4 = null;
        Thread thread5 = null;
        
        Robot robot = null;
        try {
        robot = new Robot();
        } catch (AWTException e) {
        e.printStackTrace();
        }
        checkBox.doClick();
        thread4 = new Thread(){
        public void run(){
        Robot robot2 = null;
        try {
        robot2 = new Robot();
        } catch (AWTException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        }
        //move white pawn2
        robot2.mouseMove(chessLabels[6][1].getLocationOnScreen().x , chessLabels[6][1].getLocationOnScreen().y);
        robot2.mousePress(InputEvent.BUTTON1_MASK);
        robot2.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot2.mouseMove(chessLabels[4][1].getLocationOnScreen().x , chessLabels[4][1].getLocationOnScreen().y);
        robot2.mousePress(InputEvent.BUTTON1_MASK);
        robot2.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move black pawn4
        robot2.mouseMove(chessLabels[1][3].getLocationOnScreen().x , chessLabels[1][3].getLocationOnScreen().y);
        robot2.mousePress(InputEvent.BUTTON1_MASK);
        robot2.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot2.mouseMove(chessLabels[3][3].getLocationOnScreen().x , chessLabels[3][3].getLocationOnScreen().y);
        robot2.mousePress(InputEvent.BUTTON1_MASK);
        robot2.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        
        //move white pawn3
        robot2.mouseMove(chessLabels[6][2].getLocationOnScreen().x , chessLabels[6][2].getLocationOnScreen().y);
        robot2.mousePress(InputEvent.BUTTON1_MASK);
        robot2.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot2.mouseMove(chessLabels[4][2].getLocationOnScreen().x , chessLabels[4][2].getLocationOnScreen().y);
        robot2.mousePress(InputEvent.BUTTON1_MASK);
        robot2.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        //System.out.println(chessBoard.getChessPieces());
        
        //move black pawn4
        robot2.mouseMove(chessLabels[3][3].getLocationOnScreen().x , chessLabels[3][3].getLocationOnScreen().y);
        
        robot2.mousePress(InputEvent.BUTTON1_MASK);
        robot2.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot2.mouseMove(chessLabels[4][2].getLocationOnScreen().x , chessLabels[4][2].getLocationOnScreen().y);
        robot2.mousePress(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        robot2.mouseRelease(InputEvent.BUTTON1_MASK);
        
        
        //move white queen
        robot2.mouseMove(chessLabels[7][3].getLocationOnScreen().x , chessLabels[7][3].getLocationOnScreen().y);
        robot2.mousePress(InputEvent.BUTTON1_MASK);
        robot2.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        robot2.mouseMove(chessLabels[4][0].getLocationOnScreen().x , chessLabels[4][0].getLocationOnScreen().y);
        robot2.mousePress(InputEvent.BUTTON1_MASK);
        robot2.mouseRelease(InputEvent.BUTTON1_MASK);
        
        }
        };
        
        thread4.start();
        try {
        Thread.sleep(100);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        /*** test code of checkmateAfterCheckedMapping for the element checkmateAfterChecked ***/
        
        thread5 = new Thread(){
        public void run(){
        Robot robot = null;
        try {
        robot = new Robot();
        } catch (AWTException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        }
        robot.mouseMove(chessLabels[1][2].getLocationOnScreen().x , chessLabels[1][2].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[2][2].getLocationOnScreen().x , chessLabels[2][2].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move white pawn 4
        robot.mouseMove(chessLabels[6][3].getLocationOnScreen().x , chessLabels[6][3].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[5][3].getLocationOnScreen().x , chessLabels[5][3].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move black pawn 4
        robot.mouseMove(chessLabels[4][2].getLocationOnScreen().x , chessLabels[4][2].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[5][3].getLocationOnScreen().x , chessLabels[5][3].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move white pawn 5
        robot.mouseMove(chessLabels[6][4].getLocationOnScreen().x , chessLabels[6][4].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[5][3].getLocationOnScreen().x , chessLabels[5][3].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move black queen
        robot.mouseMove(chessLabels[0][3].getLocationOnScreen().x , chessLabels[0][3].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[5][3].getLocationOnScreen().x , chessLabels[5][3].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move white bishop 2
        robot.mouseMove(chessLabels[7][5].getLocationOnScreen().x , chessLabels[7][5].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[5][3].getLocationOnScreen().x , chessLabels[5][3].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move black bishop 1
        robot.mouseMove(chessLabels[0][2].getLocationOnScreen().x , chessLabels[0][2].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[3][5].getLocationOnScreen().x , chessLabels[3][5].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move white bishop 2
        robot.mouseMove(chessLabels[5][3].getLocationOnScreen().x , chessLabels[5][3].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[3][5].getLocationOnScreen().x , chessLabels[3][5].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move black knight 1
        robot.mouseMove(chessLabels[0][1].getLocationOnScreen().x , chessLabels[0][1].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[2][0].getLocationOnScreen().x , chessLabels[2][0].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move white pawn 2
        robot.mouseMove(chessLabels[4][1].getLocationOnScreen().x , chessLabels[4][1].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[3][1].getLocationOnScreen().x , chessLabels[3][1].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move black pawn 3
        robot.mouseMove(chessLabels[2][2].getLocationOnScreen().x , chessLabels[2][2].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[3][1].getLocationOnScreen().x , chessLabels[3][1].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move white king
        robot.mouseMove(chessLabels[7][4].getLocationOnScreen().x , chessLabels[7][4].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[7][3].getLocationOnScreen().x , chessLabels[7][3].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move black pawn 8
        robot.mouseMove(chessLabels[1][7].getLocationOnScreen().x , chessLabels[1][7].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[2][7].getLocationOnScreen().x , chessLabels[2][7].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move white queen
        robot.mouseMove(chessLabels[4][0].getLocationOnScreen().x , chessLabels[4][0].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[3][1].getLocationOnScreen().x , chessLabels[3][1].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //black is being checked
        //assertEquals(true, chessBoard.getCheckNotifier().isVisible());
        
        //move black king
        robot.mouseMove(chessLabels[0][4].getLocationOnScreen().x , chessLabels[0][4].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[0][3].getLocationOnScreen().x , chessLabels[0][3].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        //move white queen
        robot.mouseMove(chessLabels[3][1].getLocationOnScreen().x , chessLabels[3][1].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
        Thread.sleep(1);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        
        robot.mouseMove(chessLabels[1][3].getLocationOnScreen().x , chessLabels[1][3].getLocationOnScreen().y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        }
        };
        
        thread5.start();
        try {
        Thread.sleep(100);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        return gc.isCheckmate();
    }
}
