
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    /* The test for the path Initial initialize State1 addCoinLessThanNinty State2 addChocs State5 addChocs State8 coin State8 coin State9 getChocs State4 none Final  */ 
    public void test1(){
        int c = 25;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
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
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }
}
