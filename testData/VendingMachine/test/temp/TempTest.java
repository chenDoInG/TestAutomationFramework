
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TempTest {

    public boolean test(){
        int c = 25;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);
        vendingMachine vm = new vendingMachine();
        vm.coin(25);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.coin(c);
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.getChoc(sb);
        return (vm.getStock().size() > 0 && vm.getStock().size() < 10) && (vm.getCredit() == 0);
    }
}
