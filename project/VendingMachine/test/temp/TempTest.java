
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TempTest {

    public boolean test(){
        int c = 10;
        vendingMachine vm = new vendingMachine();
        vm.coin(25);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.coin(c);
        vm.coin(25);
        vm.coin(25);
        vm.getChoc(new StringBuffer("none"));
        return vm.getCredit() == 0;
    }
}
