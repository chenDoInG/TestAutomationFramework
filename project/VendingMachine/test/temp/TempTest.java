
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TempTest {

    public boolean test(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);
        int c = 25;
        vendingMachine vm = new vendingMachine();
        vm.coin(100);
        vm.addChoc("MM");
        vm.getChoc(sb);
        vm.coin(25);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.coin(c);
        vm.getChoc(sb);
        vm.addChoc("MM");
        return (vm.getStock().size() == 10) && (vm.getCredit() == 0);
    }
}