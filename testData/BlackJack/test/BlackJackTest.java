
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class BlackJackTest {

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal hitOrStay Win  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hit2OrStayMapping for the element hitOrStay ***/
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        assertEquals(true, frame.getWinLoseBox().getText().equals("Lost") == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal hitOrStay Draw  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hit2OrStayMapping for the element hitOrStay ***/
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        assertEquals(true, frame.getWinLoseBox().getText().equals("Draw") == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal hitOrStay Draw again Initialized deal NewDeal hitOrStay Lost  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hit2OrStayMapping for the element hitOrStay ***/
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        /*** test code of againMapping for the element again ***/
        frame.getPlayAgainButton().doClick();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hit2OrStayMapping for the element hitOrStay ***/
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        assertEquals(true, (frame.getWinLoseBox().getText().equals("Lost") || frame.getWinLoseBox().getText().equals("Bust")) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal hitOrStay Lost again Initialized deal NewDeal hitOrStay Lost  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hit1OrStayMapping for the element hitOrStay ***/
        frame.getHitButton().doClick();
        /*** test code of againMapping for the element again ***/
        frame.getPlayAgainButton().doClick();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hit1OrStayMapping for the element hitOrStay ***/
        frame.getHitButton().doClick();
        assertEquals(true, (frame.getWinLoseBox().getText().equals("Lost") || frame.getWinLoseBox().getText().equals("Bust")) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal hitOrStay Win again Initialized deal NewDeal hitOrStay Lost  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hit2OrStayMapping for the element hitOrStay ***/
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        /*** test code of againMapping for the element again ***/
        frame.getPlayAgainButton().doClick();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hit2OrStayMapping for the element hitOrStay ***/
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        assertEquals(true, (frame.getWinLoseBox().getText().equals("Lost") || frame.getWinLoseBox().getText().equals("Bust")) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal hitOrStay InPlay stay Win  FinalState0  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hit1OrStayMapping for the element hitOrStay ***/
        frame.getHitButton().doClick();
        /*** test code of stayMapping for the element stay ***/
        frame.getStayButton().doClick();
        assertEquals(true, frame.getWinLoseBox().getText().equals("Lost") == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal hitOrStay InPlay stay Draw  FinalState0  */ 
    public void test6(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hit1OrStayMapping for the element hitOrStay ***/
        frame.getHitButton().doClick();
        /*** test code of stayMapping for the element stay ***/
        frame.getStayButton().doClick();
        assertEquals(true, frame.getWinLoseBox().getText().equals("Draw") == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal hitOrStay InPlay hitOrStay InPlay stay Lost  FinalState0  */ 
    public void test7(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hit1OrStayMapping for the element hitOrStay ***/
        frame.getHitButton().doClick();
        /*** test code of hit1OrStayMapping for the element hitOrStay ***/
        frame.getHitButton().doClick();
        /*** test code of stayMapping for the element stay ***/
        frame.getStayButton().doClick();
        assertEquals(true, (frame.getWinLoseBox().getText().equals("Lost") || frame.getWinLoseBox().getText().equals("Bust")) == true);
    }

}
