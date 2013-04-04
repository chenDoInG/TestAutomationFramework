
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TempTest {

    public boolean test(){
        StringBuffer sb = new StringBuffer("MM");
        vendingMachine vm = new vendingMachine();
        vm.coin(25);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.coin(25);
        vm.coin(25);
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.getChoc(sb);
        return (vm.getCredit() == 0) && (vm.getStock().size() == 1);
    }
}
