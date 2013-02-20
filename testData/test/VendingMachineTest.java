
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    /* The test for the path Initial initialize State1 addChocs State4 addCoinLessThanNinty State5 coin State6 getChocs State1 addChocs State4  Final  */ 
    public void test1(){
        int c = 11;
        String s = "baaac";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.getStock() > 0 && vm.getStock() < 10;
        vm.coin(25);
        vm.getStock() > 0 && vm.getStock() < 10;
        vm.coin(c);
        vm.getStock() > 0 && vm.getStock() < 10;
        vm.getChoc(sb);
        
        vm.addChoc("MM");
        vm.getStock() > 0 && vm.getStock() < 10;
    }
}
