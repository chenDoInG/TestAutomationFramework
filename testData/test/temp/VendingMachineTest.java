
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    /* The test for the path initialize addChocs addCoinLessThanNinty coin getChocs getChocs addChocs   */ 
    public void test1(){
        10,25,100
        StringBuffer sb = new StringBuffer("MM");

        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.coin(25);
        vm.coin(c);
        vm.getChoc(sb);
        
        vm.getChoc(sb);
        
        vm.addChoc("MM");
    }
}
