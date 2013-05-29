
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TempTest {

    public boolean test(){
        Triangle t = new Triangle(1,2,3);
        t.setSideLengths(3, 3, 3);
        t.setSideLengths(2, 2, 3);
        t.setSideLengths(3, 3, 3);
        t.setSideLengths(1, 0, 0);
        t.setSideLengths(3, 3, 3);
        t.setSideLengths(3, 4, 5);
        t.setSideLengths(1, 0, 0);
        t.setSideLengths(1, 2, 3);
        t.setSideLengths(1, 0, 0);
        t.setSideLengths(3, 4, 5);
        t.setSideLengths(3, 3, 3);
        t.setSideLengths(1, 2, 3);
        t.setSideLengths(2, 2, 3);
        t.setSideLengths(1, 0, 0);
        t.setSideLengths(2, 2, 3);
        t.setSideLengths(1, 2, 3);
        t.setSideLengths(3, 4, 5);
        t.setSideLengths(1, 2, 3);
        System.out.println(t.getPerimeter());
        return t.isScalene() == true;
    }
}
