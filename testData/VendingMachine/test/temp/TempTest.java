import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TempTest {

    public boolean test(){
        StringBuffer sb = new StringBuffer(s);
        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.coin(100);
        vm.getChoc(sb);
        vm.addChoc("MM");
        return (vm.getStock().size() > 0 && vm.getStock().size() < 10) && (vm.getCredit() == 0);
    }
}
