
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TempTest {

    public boolean test(){
        int c = 11;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);
        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.coin(25);
        vm.coin(c);
        vm.getChoc(sb);
        vm.addChoc("MM");
        return vm.getCredit() == 0;
    }
}
