
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class PolyTest {

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addPos OneDegAndPosCoef addNeg MoreDegAndMixCoef  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        /*** test code of addNeg4Mapping for the element addNeg ***/
        p = p.add(new Poly(-3,4));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addNeg OneDegAndNegCoef addPos MoreDegAndMixCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addPos3Mapping for the element addPos ***/
        p = p.add(new Poly(2,3));
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addNeg OneDegAndNegCoef deleteNeg ZeroDeg addNeg OneDegAndNegCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of deleteNeg1Mapping for the element deleteNeg ***/
        p = p.sub(new Poly(-2,1));
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addPos3Mapping for the element addPos ***/
        p = p.add(new Poly(2,3));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addPos OneDegAndPosCoef deletePos ZeroDeg addNeg OneDegAndNegCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        /*** test code of deletePos1Mapping for the element deletePos ***/
        p = p.sub(new Poly(1,1));
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addPos3Mapping for the element addPos ***/
        p = p.add(new Poly(2,3));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addNeg OneDegAndNegCoef addNeg MoreDegAndNegCoef deleteNeg OneDegAndNegCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addNeg4Mapping for the element addNeg ***/
        p = p.add(new Poly(-3,4));
        /*** test code of deleteNeg4Mapping for the element deleteNeg ***/
        p = p.sub(new Poly(-3,4));
        /*** test code of addPos3Mapping for the element addPos ***/
        p = p.add(new Poly(2,3));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addNeg OneDegAndNegCoef minus OneDegAndPosCoef minus OneDegAndNegCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of minusMapping for the element minus ***/
        p = p.minus();
        /*** test code of minusMapping for the element minus ***/
        p = p.minus();
        /*** test code of addPos3Mapping for the element addPos ***/
        p = p.add(new Poly(2,3));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addNeg OneDegAndNegCoef addNeg MoreDegAndNegCoef addNeg MoreDegAndNegCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test6(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addNeg4Mapping for the element addNeg ***/
        p = p.add(new Poly(-3,4));
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addNeg OneDegAndNegCoef addPos MoreDegAndMixCoef deletePos MoreDegAndNegCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test7(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addPos3Mapping for the element addPos ***/
        p = p.add(new Poly(2,3));
        /*** test code of deletePos1Mapping for the element deletePos ***/
        p = p.sub(new Poly(1,1));
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addPos OneDegAndPosCoef addPos MoreDegAndPosCoef minus MoreDegAndNegCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test8(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        /*** test code of addPos3Mapping for the element addPos ***/
        p = p.add(new Poly(2,3));
        /*** test code of minusMapping for the element minus ***/
        p = p.minus();
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addNeg OneDegAndNegCoef addNeg MoreDegAndNegCoef minus MoreDegAndPosCoef addNeg MoreDegAndMixCoef  FinalState0  */ 
    public void test9(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addNeg4Mapping for the element addNeg ***/
        p = p.add(new Poly(-3,4));
        /*** test code of minusMapping for the element minus ***/
        p = p.minus();
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addNeg OneDegAndNegCoef addPos MoreDegAndMixCoef deleteNeg MoreDegAndPosCoef addNeg MoreDegAndMixCoef  FinalState0  */ 
    public void test10(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addPos3Mapping for the element addPos ***/
        p = p.add(new Poly(2,3));
        /*** test code of deleteNeg1Mapping for the element deleteNeg ***/
        p = p.sub(new Poly(-2,1));
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addPos OneDegAndPosCoef addPos MoreDegAndPosCoef addPos MoreDegAndPosCoef addNeg MoreDegAndMixCoef  FinalState0  */ 
    public void test11(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        /*** test code of addPos3Mapping for the element addPos ***/
        p = p.add(new Poly(2,3));
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addPos OneDegAndPosCoef addPos MoreDegAndPosCoef deletePos OneDegAndPosCoef minus OneDegAndNegCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test12(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        /*** test code of addPos3Mapping for the element addPos ***/
        p = p.add(new Poly(2,3));
        /*** test code of deletePos3Mapping for the element deletePos ***/
        p = p.sub(new Poly(2,3));
        /*** test code of minusMapping for the element minus ***/
        p = p.minus();
        /*** test code of addPos3Mapping for the element addPos ***/
        p = p.add(new Poly(2,3));
        assertEquals(true, (p.degree() > 1) == true);
    }

}
