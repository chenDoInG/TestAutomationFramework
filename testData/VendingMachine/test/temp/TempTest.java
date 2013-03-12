import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TempTest {

    public boolean test(){
        vendingMachine vm = new vendingMachine();
        return (vm.getStock().size() == 0) && (vm.getCredit() == 0);
    }
}
