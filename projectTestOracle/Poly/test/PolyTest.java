
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class PolyTest {

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addPos OneDegAndPosCoef minus OneDegAndNegCoef deleteNeg ZeroDeg addNeg OneDegAndNegCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        /*** test code of minusMapping for the element minus ***/
        p = p.minus();
        /*** test code of deleteNeg1Mapping1 for the element deleteNeg ***/
        p = p.sub(new Poly(-1,1));
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addPos2Mapping for the element addPos ***/
        p = p.add(new Poly(1,2));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addPos OneDegAndPosCoef addPos MoreDegAndPosCoef minus MoreDegAndNegCoef addNeg MoreDegAndNegCoef deleteNeg OneDegAndNegCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        /*** test code of addPos2Mapping for the element addPos ***/
        p = p.add(new Poly(1,2));
        /*** test code of minusMapping for the element minus ***/
        p = p.minus();
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of deleteNeg2Mapping for the element deleteNeg ***/
        p = p.sub(new Poly(-1,2));
        /*** test code of addPos2Mapping for the element addPos ***/
        p = p.add(new Poly(1,2));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addNeg OneDegAndNegCoef addNeg MoreDegAndNegCoef minus MoreDegAndPosCoef addPos MoreDegAndPosCoef deletePos OneDegAndPosCoef addNeg MoreDegAndMixCoef  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addNeg4Mapping for the element addNeg ***/
        p = p.add(new Poly(-3,4));
        /*** test code of minusMapping for the element minus ***/
        p = p.minus();
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        /*** test code of deletePos4Mapping for the element deletePos ***/
        p = p.sub(new Poly(3,4));
        /*** test code of addNeg4Mapping for the element addNeg ***/
        p = p.add(new Poly(-3,4));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addNeg OneDegAndNegCoef minus OneDegAndPosCoef deletePos ZeroDeg addNeg OneDegAndNegCoef addNeg MoreDegAndNegCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of minusMapping for the element minus ***/
        p = p.minus();
        /*** test code of deletePos1Mapping1 for the element deletePos ***/
        p = p.sub(new Poly(2,1));
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addNeg4Mapping for the element addNeg ***/
        p = p.add(new Poly(-3,4));
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        assertEquals(true, (p.degree() > 1) == true);
    }

    @Test
    /* The test for the path Initial0 initialize ZeroDeg addPos OneDegAndPosCoef addPos MoreDegAndPosCoef addNeg MoreDegAndMixCoef addPos MoreDegAndMixCoef  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        Poly p = new Poly();
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        /*** test code of addPos2Mapping for the element addPos ***/
        p = p.add(new Poly(1,2));
        /*** test code of addNeg1Mapping for the element addNeg ***/
        p = p.add(new Poly(-2,1));
        /*** test code of addPos1Mapping for the element addPos ***/
        p = p.add(new Poly(1,1));
        assertEquals(true, (p.degree() > 1) == true);
    }

}
