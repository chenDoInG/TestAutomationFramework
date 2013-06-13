
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TriangleTest {

    @Test
    /* The test for the path Initial0 initialize Scalene setEquilateral Equilateral getPerimeter Equilateral  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        Triangle t = new Triangle(1,2,3);
        /*** test code of setEquilateralMapping for the element setEquilateral ***/
        t.setSideLengths(3, 3, 3);
        /*** test code of getPerimeterMapping for the element getPerimeter ***/
        System.out.println(t.getPerimeter());
        assertEquals(true, t.isEquilateral() == true);
    }

    @Test
    /* The test for the path Initial0 initialize Scalene setIsoceles Isosceles getPerimeter Isosceles  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        Triangle t = new Triangle(1,2,3);
        /*** test code of setIsocelesMapping for the element setIsoceles ***/
        t.setSideLengths(2, 2, 3);
        /*** test code of getPerimeterMapping for the element getPerimeter ***/
        System.out.println(t.getPerimeter());
        assertEquals(true, t.isIsosceles() == true);
    }

    @Test
    /* The test for the path Initial0 initialize Scalene setRightAngled RightAngled getPerimeter RightAngled  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        Triangle t = new Triangle(1,2,3);
        /*** test code of setRightAngledMapping for the element setRightAngled ***/
        t.setSideLengths(3, 4, 5);
        /*** test code of getPerimeterMapping for the element getPerimeter ***/
        System.out.println(t.getPerimeter());
        assertEquals(true, t.isRightAngled() == true);
    }

    @Test
    /* The test for the path Initial0 initialize Scalene setImpossible Impossible getPerimeter Impossible  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        Triangle t = new Triangle(1,2,3);
        /*** test code of setImpossibleMapping for the element setImpossible ***/
        t.setSideLengths(1, 0, 0);
        /*** test code of getPerimeterMapping for the element getPerimeter ***/
        System.out.println(t.getPerimeter());
        assertEquals(true, t.isImpossible() == true);
    }

    @Test
    /* The test for the path Initial0 initialize Scalene setIsoceles Isosceles setRightAngled RightAngled setIsoceles Isosceles  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        Triangle t = new Triangle(1,2,3);
        /*** test code of setIsocelesMapping for the element setIsoceles ***/
        t.setSideLengths(2, 2, 3);
        /*** test code of setRightAngledMapping for the element setRightAngled ***/
        t.setSideLengths(3, 4, 5);
        /*** test code of setIsocelesMapping for the element setIsoceles ***/
        t.setSideLengths(2, 2, 3);
        assertEquals(true, t.isIsosceles() == true);
    }

    @Test
    /* The test for the path Initial0 initialize Scalene setEquilateral Equilateral setIsoceles Isosceles setEquilateral Equilateral setImpossible Impossible setEquilateral Equilateral setRightAngled RightAngled setImpossible Impossible setScalene Scalene setImpossible Impossible setRightAngled RightAngled setEquilateral Equilateral setScalene Scalene setIsoceles Isosceles setImpossible Impossible setIsoceles Isosceles setScalene Scalene setRightAngled RightAngled setScalene Scalene getPerimeter Scalene  FinalState0  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        Triangle t = new Triangle(1,2,3);
        /*** test code of setEquilateralMapping for the element setEquilateral ***/
        t.setSideLengths(3, 3, 3);
        /*** test code of setIsocelesMapping for the element setIsoceles ***/
        t.setSideLengths(2, 2, 3);
        /*** test code of setEquilateralMapping for the element setEquilateral ***/
        t.setSideLengths(3, 3, 3);
        /*** test code of setImpossibleMapping for the element setImpossible ***/
        t.setSideLengths(1, 0, 0);
        /*** test code of setEquilateralMapping for the element setEquilateral ***/
        t.setSideLengths(3, 3, 3);
        /*** test code of setRightAngledMapping for the element setRightAngled ***/
        t.setSideLengths(3, 4, 5);
        /*** test code of setImpossibleMapping for the element setImpossible ***/
        t.setSideLengths(1, 0, 0);
        /*** test code of setScaleneMapping for the element setScalene ***/
        t.setSideLengths(1, 2, 3);
        /*** test code of setImpossibleMapping for the element setImpossible ***/
        t.setSideLengths(1, 0, 0);
        /*** test code of setRightAngledMapping for the element setRightAngled ***/
        t.setSideLengths(3, 4, 5);
        /*** test code of setEquilateralMapping for the element setEquilateral ***/
        t.setSideLengths(3, 3, 3);
        /*** test code of setScaleneMapping for the element setScalene ***/
        t.setSideLengths(1, 2, 3);
        /*** test code of setIsocelesMapping for the element setIsoceles ***/
        t.setSideLengths(2, 2, 3);
        /*** test code of setImpossibleMapping for the element setImpossible ***/
        t.setSideLengths(1, 0, 0);
        /*** test code of setIsocelesMapping for the element setIsoceles ***/
        t.setSideLengths(2, 2, 3);
        /*** test code of setScaleneMapping for the element setScalene ***/
        t.setSideLengths(1, 2, 3);
        /*** test code of setRightAngledMapping for the element setRightAngled ***/
        t.setSideLengths(3, 4, 5);
        /*** test code of setScaleneMapping for the element setScalene ***/
        t.setSideLengths(1, 2, 3);
        /*** test code of getPerimeterMapping for the element getPerimeter ***/
        System.out.println(t.getPerimeter());
        assertEquals(true, t.isScalene() == true);
    }

}
