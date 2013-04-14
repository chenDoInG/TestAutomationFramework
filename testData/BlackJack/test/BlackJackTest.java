

import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;



public class BlackJackTest {

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal hitHitHit AfterHitHitHit  Result  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hitHitHitMapping for the element hitHitHit ***/
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        assertEquals(true, frame.getWinLoseBox().getText().trim().equals("") == false);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal stayStayStay AfterStayStayStay  Result  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of stayStayStayMapping for the element stayStayStay ***/
        frame.getStayButton().doClick();
        frame.getStayButton().doClick();
        frame.getStayButton().doClick();
        assertEquals(true, frame.getWinLoseBox().getText().trim().equals("") == false);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal hitHitStay AfterHitHitStay  Result  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hitHitStayMapping for the element hitHitStay ***/
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        frame.getStayButton().doClick();
        assertEquals(true, frame.getWinLoseBox().getText().trim().equals("") == false);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal hitStayHit AfterHitStayHit  Result  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hitStayHitMapping for the element hitStayHit ***/
        frame.getHitButton().doClick();
        frame.getStayButton().doClick();
        frame.getHitButton().doClick();
        assertEquals(true, frame.getWinLoseBox().getText().trim().equals("") == false);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal hitStayStay AfterHitStayStay  Result  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of hitStayStayMapping for the element hitStayStay ***/
        frame.getHitButton().doClick();
        frame.getStayButton().doClick();
        frame.getStayButton().doClick();
        assertEquals(true, frame.getWinLoseBox().getText().trim().equals("") == false);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal stayStayHit AfterStayStayHit  Result  FinalState0  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of stayStayHitMapping for the element stayStayHit ***/
        frame.getStayButton().doClick();
        frame.getStayButton().doClick();
        frame.getHitButton().doClick();
        assertEquals(true, frame.getWinLoseBox().getText().trim().equals("") == false);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal stayHitStay AfterStayHitStay  Result  FinalState0  */ 
    public void test6(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of stayHitStayMapping for the element stayHitStay ***/
        frame.getStayButton().doClick();
        frame.getHitButton().doClick();
        frame.getStayButton().doClick();
        assertEquals(true, frame.getWinLoseBox().getText().trim().equals("") == false);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized deal NewDeal stayHitHit AfterStayHitHit  Result again Initialized deal NewDeal stayHitHit AfterStayHitHit  Result  FinalState0  */ 
    public void test7(){
        /*** test code of initializeMapping for the element initialize ***/
        BlackjackGUI frame = new BlackjackGUI();
        frame.display();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of stayHitHitMapping for the element stayHitHit ***/
        frame.getStayButton().doClick();
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        /*** test code of againMapping for the element again ***/
        frame.getPlayAgainButton().doClick();
        /*** test code of dealMapping for the element deal ***/
        frame.getDealButton().doClick();
        /*** test code of stayHitHitMapping for the element stayHitHit ***/
        frame.getStayButton().doClick();
        frame.getHitButton().doClick();
        frame.getHitButton().doClick();
        assertEquals(true, frame.getWinLoseBox().getText().trim().equals("") == false);
    }

}
