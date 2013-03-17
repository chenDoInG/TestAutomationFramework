import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    /* The test for the path Initial initialize State1 addChocs State4 addCoinAtLeastNinty State6 getChocs State1 addChocs State4 none Final  */ 
    public void test1(){
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }
}
