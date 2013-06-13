
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TempTest {

    public boolean test(){
        Poly p = new Poly();
        p = p.add(new Poly(1,1));
        p = p.add(new Poly(1,2));
        p = p.add(new Poly(-2,1));
        p = p.add(new Poly(1,1));
        return (p.degree() > 1) == true;
    }
}
