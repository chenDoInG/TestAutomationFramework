
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TempTest {

    public boolean test(){
        Triangle t = new Triangle(1,2,3);
        t.setSideLengths(3, 4, 5);
        System.out.println(t.getPerimeter());
        return t.isRightAngled() == true;
    }
}
